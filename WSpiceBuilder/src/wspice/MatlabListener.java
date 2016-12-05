package wspice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import wspice.MATLABParser.ArrayAssignStatContext;
import wspice.MATLABParser.ExprContext;
import wspice.MATLABParser.ForStatContext;

public class MatlabListener extends MATLABParserBaseListener {
	    private final List<String> ruleNames;
	    private final MATLABParser parser;
	    private final ParseTree    tree;
	    private final String       prefix;
	    private final HashSet<String>  variables;
		public static HashMap<String, String>  functionRemap = new HashMap<String, String>();
	    
	    protected StringBuffer wout;
	    
	    protected void appendCode( String code ) {
	    	wout.append( code );
	    }
	     
//	    protected class ExprListener extends MATLABParserBaseListener {
//	    	public ExprListener() {}
//	    	
//	        @Override
//	        public void enterEveryRule(ParserRuleContext ctx) {
//	        	StringBuffer childText = new StringBuffer();
//	        	for (int i = 0; i < ctx.getChildCount(); i++) {
//	        		if (ctx.getChild(i) instanceof ParserRuleContext) {
//		        		ParserRuleContext child = (ParserRuleContext) ctx.getChild(i);
//		        		childText.append( String.format("/%s:%s,", getName(child), child.getText() ) );
//	        		} else if (ctx.getChild(i) instanceof TerminalNodeImpl) {
//	        			TerminalNodeImpl child = (TerminalNodeImpl) ctx.getChild(i);
//	        			childText.append( String.format("/%s,", child.getText() ) );
//	        		}
//	        	}
//	        	System.out.printf("%s:<%s%s>:%d\n", getName(ctx), ctx.getText(), 
//	        			childText.toString(), ctx.getChildCount() );
////	        	switch (getName(ctx)) {
////	        	case "idRef":
////	        		wout.append(ctx.getText() );
////	        		break;
////	        	}
//	        	if (ctx.getChild(0) instanceof TerminalNodeImpl) {
//	        		wout.append(ctx.getText() );
//	        	}
//	        }
//	    }

		public MatlabListener(HashSet<String>  variables, MATLABParser parser, ParseTree tree, String prefix ) {
			this.variables = variables;
			this.parser = parser;
			this.tree = tree;
			this.prefix = prefix;
			ruleNames = Arrays.asList(parser.getRuleNames());
			variables = new HashSet<String>();
			reset();
		}
		
		
		public void reset() {
			wout = new StringBuffer();
		}
		
		public String getMathematica() {
			return wout.toString();
		}
		
	    public HashSet<String> getVariables() {
			return variables;
		}

		protected String getName( RuleContext ctx ) {
	    	int ruleIndex = ctx.getRuleIndex();
	        String ruleName;
	        if (ruleIndex >= 0 && ruleIndex < ruleNames.size()) {
	            ruleName = ruleNames.get(ruleIndex);
	        }
	        else {
	            ruleName = Integer.toString(ruleIndex);
	        }
	        return ruleName;
		}
		
		protected void report( String tag, ParserRuleContext ctx ) {
	        System.err.println( tag + ": " + getName(ctx) + "  (" + ctx.getChildCount() + "," + ctx.depth() + ") " + ctx.toStringTree(ruleNames) );
	        for (int i = 0; i < ctx.getChildCount(); i++) {
	        	System.err.printf("  %d: %s\n", i, ctx.getChild(i).toStringTree(parser) );
	        }
		}
		
		protected void showChildren( String tag, ParserRuleContext expr ) {
			System.out.print( tag );
			for (int i = 0; i < expr.getChildCount(); i++) {
				ParseTree child = expr.getChild(i);
				if (child instanceof TerminalNodeImpl) {
					System.out.printf("%d:'%s' ", i, child.getText() );
				} else if (child instanceof ParserRuleContext) {
					System.out.printf("%d:%s:%s ", i, getName( (ParserRuleContext) child), child.getText() );
				}
			}
			System.out.println();
		}

		
		public static String rewriteSymbol(String symbol) {
			if (Character.isAlphabetic( symbol.charAt(0) )) {
				symbol = symbol.replaceAll("cspice_", " WSpice`" );
//				symbol = symbol.replaceAll("_", "");
//				symbol = "wst" + symbol;
				boolean upcaseNext = true;
				StringBuffer out = new StringBuffer();
				out.append("wst");
				for (int i = 0; i < symbol.length(); i++) {
					char ch = symbol.charAt(i);
					if (Character.isLetter(ch) || Character.isDigit(ch)) {
						if (upcaseNext)
							ch = Character.toUpperCase(ch);
						upcaseNext = false;
						out.append(ch);
					} else {
						upcaseNext = true;
					}
				}
				symbol = out.toString();
			}
			return symbol;
		}


		protected void addParseComment(ParserRuleContext ctx ) {
//			appendCode( String.format("%s  (* %s *)", prefix, ctx.toStringTree(ruleNames) ));
//			appendCode('\n');
//			appendCode('\n');
		}

		
		protected boolean isChildRule( ParserRuleContext expr, int iChild, String rule ) {
			ParseTree child = expr.getChild(iChild);
			if (child instanceof ParserRuleContext ) {
				ParserRuleContext childCtx = (ParserRuleContext) child;
				return getName(childCtx).equals(rule);
			}
			return false;
		}
		
		
		protected boolean isChildTerminal( ParserRuleContext expr, int iChild, String check) {
			ParseTree child = expr.getChild(iChild);
			if (child instanceof TerminalNodeImpl ) {
				return child.getText().equals(check);
			}
			return false;			
		}

		protected void translateExprArrayList( ParserRuleContext expr, boolean forceBraces ) {
//			showChildren( "ExprArrayList: ", expr );
			boolean isArrayExpr = forceBraces || !(getName(expr.getParent()).equals("arrayRef"));
			//System.out.println( "EAL: " +isArrayExpr + " "+ expr.depth() + " " + getName(expr.getParent()) + " " + expr.toStringTree(ruleNames));
			if (isArrayExpr) 
				appendCode("{");
			for (int i = 0; i < expr.getChildCount(); i++) {
				ParseTree child = expr.getChild(i);
//				System.out.printf("%d:%s:%s\n", i, child.getClass(), child.getText() );
				if ( (i%2) == 0) { // even numbered must be expr
					if (child instanceof ParserRuleContext) {
						ParserRuleContext childCtx = (ParserRuleContext)child;
						translateExpr( childCtx );
					}
				} else { // odd numbered must be terminal ',' ';' NL
					if (child instanceof TerminalNodeImpl) {
						if (child.getText().equals(",")) {
							appendCode(", ");
						} else {
							appendCode(", "); // ("}, {");
						}
					}
				}
			}
			if (isArrayExpr) 
				appendCode("}");
		}
		
		protected void translateArrayExpr( ParserRuleContext expr ) {
			//System.out.println( "EA: " + expr.depth() + " " + getName(expr.getParent()) + " " + expr.toStringTree(ruleNames));
			if (expr.getChildCount() == 3 &&
				isChildTerminal(expr, 0, "[") &&
				isChildRule( expr, 1, "exprArrayList") &&
				isChildTerminal(expr, 2, "]") ) {
				
				if (expr.depth() == 6) {
					appendCode("ArrayFlatten[");
					translateExprArrayList( (ParserRuleContext) expr.getChild(1), true );
					appendCode(", 1]");
				} else {
					translateExprArrayList( (ParserRuleContext) expr.getChild(1), false );					
				}
			} else if (expr.getChildCount() == 2 &&
					isChildTerminal(expr, 0, "[") &&
					isChildTerminal(expr, 1, "]") ) {
				appendCode("[]");
			} else {
				report( "translateArrayExpr", expr );
			}
		}
		
		protected void translateArrayRef( ParserRuleContext expr ) {
			if (expr.getChildCount() == 4 &&
				isChildRule( expr, 0, "idRef" ) &&
				isChildTerminal( expr, 1, "(" ) &&
				isChildRule( expr, 2, "exprArrayList" ) &&
				isChildTerminal( expr, 3, ")" ) ) {
				//showChildren( "ArrayRef: ", expr );
				String symbol = expr.getChild(0).getText();
				symbol = rewriteSymbol(symbol);
				//System.out.println( symbol + " ? " + variables.contains(symbol) );
				if (variables.contains(symbol)) { // array reference
					appendCode( symbol );
					appendCode("[[");
					translateExprArrayList( (ParserRuleContext)expr.getChild(2), false );
					appendCode("]]");
				} else {  // function invocation
					if (functionRemap.containsKey(symbol)) {
						symbol = functionRemap.get(symbol);
					}
					appendCode( symbol );
					appendCode("[");
					translateExprArrayList( (ParserRuleContext)expr.getChild(2), false );
					appendCode("]");
				}
			} else {
				report( "translateArrayRef", expr );
			}
		}
		
		protected void translateExpr( ParserRuleContext expr ) {
//			ExprListener exprListener = new ExprListener();
//			ParseTreeWalker.DEFAULT.walk(exprListener, expr);
	        for (int i = 0; i < expr.getChildCount(); i++) {
	        	ParseTree child = expr.getChild(i);
	        	if (child instanceof TerminalNodeImpl) {
	        		String contents = child.getText();
	        		if (contents.charAt(0) == '\'') {
	        			contents = String.format("\"%s\"", contents.substring(1, contents.length()-1) );
	        			appendCode(contents);
	        		} else if (contents.equals("@")) { // rewritten single quote transpose
	        			appendCode(" // Transpose");
	        		} else if (contents.equalsIgnoreCase(":")) {  // range generator
	        			appendCode(";;");
	        		} else {
	        			if (functionRemap.containsKey(contents)) {
	        				contents = functionRemap.get(contents);
	        			} else {
	        				contents = rewriteSymbol( contents );
	        			}
	        			appendCode(contents);
	        		}
	        	} else if (child instanceof ParserRuleContext) {
	        		ParserRuleContext childCtx = (ParserRuleContext) child;
	        		switch (getName(childCtx)) {
	        		case "expr":
	        		case "idRef":
	        			translateExpr( childCtx );
	        			break;
	        		case "arrayExpr":
	        			translateArrayExpr( childCtx );
	        			break;
	        		case "arrayRef":
	        			translateArrayRef( childCtx );
	        			break;
	        		default:
	        			System.err.println(getName(childCtx));
	        			break;
	        		}
	        	} else {
	        		System.err.println( child.getClass() );
	        	}
	        }			
		}
		

		@Override
		public void enterScalarAssignStat(MATLABParser.ScalarAssignStatContext ctx) {
//			report( ctx );
			appendCode(prefix);
			if (ctx.getChildCount() == 3) {
				ParserRuleContext childCtx0 = (ParserRuleContext) ctx.getChild(0);
				String name0 = getName( childCtx0 );
				if (name0.equals("idRef")) {
					String symbol = childCtx0.getText();
					symbol = rewriteSymbol(symbol);
					appendCode( symbol );
					variables.add( symbol );
					appendCode(" = ");
				}
				if (ctx.getChild(1).getText().equals("=")) {
					ParserRuleContext childCtx2 = (ParserRuleContext) ctx.getChild(2);
					String name2 = getName( childCtx2 );
					if (name2.equals("expr")) {
						translateExpr( childCtx2 );
					}
				}
				appendCode(";\n");
			} else {
				report( "enterScalarAssignStat", ctx );
			}
			addParseComment(ctx);
		}


		@Override
		public void enterExpr(ExprContext ctx) {
//			System.out.println( "enterExpr " + ctx.depth() + ", " + ctx.getChildCount() +
//					" : " + getName(ctx.parent) +
//					" -> " + ctx.toStringTree(ruleNames) );					
			// script/statBlock/stat/expr for standalone function invocations ONLY
			if (ctx.depth() == 4 && getName(ctx.parent).equals("stat")) {
				if (ctx.getChildCount() == 1) {
					ParserRuleContext childCtx0 = (ParserRuleContext) ctx.getChild(0);
					if (isChildRule( ctx, 0, "idRef")) {
						appendCode(prefix);
						appendCode( childCtx0.getText() );
						appendCode( "[];\n");
						addParseComment(ctx);
					} else if (isChildRule( ctx, 0, "arrayRef")) {
						//System.out.println( "expr[4]/arrayRef "+ childCtx0.depth() + ", " + childCtx0.getChildCount() + " -> " + childCtx0.toStringTree(ruleNames) );
						appendCode(prefix);
						translateArrayRef( childCtx0 );
						appendCode( ";\n");
						addParseComment(ctx);
					} else {
						System.err.println( "enterExpr unknown rule " + ctx.depth() + ", " + ctx.getChildCount() + " -> " + ctx.toStringTree(ruleNames) );
					}
				} else {
					System.err.println( "enterExpr too many children " + ctx.depth() + ", " + ctx.getChildCount() + " -> " + ctx.toStringTree(ruleNames) );					
				}
//			} else {
//				report( "enterExpr", ctx );
			}
		}


		@Override
		public void enterArrayAssignStat(ArrayAssignStatContext ctx) {
			//System.out.println( "enterArrayAssignStat " + ctx.depth() + ", " + ctx.getChildCount() + " -> " + ctx.toStringTree(ruleNames) );					
			appendCode(prefix);
			if (ctx.getChildCount() == 3 && 
				isChildRule(ctx, 0, "arrayRef") &&
				isChildTerminal(ctx, 1, "=") &&
				isChildRule(ctx, 2, "expr")) {
				
				ParserRuleContext childCtx0 = (ParserRuleContext) ctx.getChild(0);
				translateArrayRef( childCtx0 );
				appendCode(" = ");
				ParserRuleContext childCtx2 = (ParserRuleContext) ctx.getChild(2);
				translateExpr( childCtx2 );
				appendCode(";\n");
			} else {
				report( "enterArrayAssignStat", ctx );
			}
			addParseComment(ctx);
		}


		@Override
		public void enterForStat(ForStatContext ctx) {
			System.out.println( "enterForStat " + ctx.depth() + ", " + ctx.getChildCount() + " -> " + ctx.toStringTree(ruleNames) );
			// for / (idRef) / = / expr / endStat / statBlock / end
			//     expr := expr / : / expr { : / expr }   
			if (ctx.getChildCount() == 7) {
				if (isChildTerminal(ctx, 0, "for") && 
					isChildRule(ctx, 1, "idRef") && 
					isChildTerminal(ctx, 2, "=") && 
					isChildRule(ctx, 3, "expr") ) {
					
					String symbol = ctx.getChild(1).getText();
					
					String initialValue = null;
					String finalValue = null;
					String incrementValue = "1";
					StringBuffer save = wout;
					
					ParserRuleContext expr = (ParserRuleContext) ctx.getChild(3);
					if (isChildRule(expr, 0, "expr")) {
						wout = new StringBuffer();
						translateExpr( (ParserRuleContext) expr.getChild(0) );
						initialValue = wout.toString();
					}
					if (isChildRule(expr, 2, "expr")) {
						wout = new StringBuffer();
						translateExpr( (ParserRuleContext) expr.getChild(2) );						
						finalValue = wout.toString();
					}
					if (expr.getChildCount() > 3 && isChildRule( expr, 4, "expr")) {
						wout = new StringBuffer();
						translateExpr( (ParserRuleContext) expr.getChild(4) );	
						incrementValue = finalValue;
						finalValue = wout.toString();
					}
					wout = save;
					appendCode(prefix);
					appendCode( String.format("For[%s = %s,%s < %s, %s += %s,\n", 
							symbol, initialValue, symbol, finalValue, symbol, incrementValue ) );
					addParseComment(ctx);
				}
			} else {
				report( "enterForStat", ctx );
			}
		}


		@Override
		public void exitForStat(ForStatContext ctx) {
			appendCode("(*@*)");
			appendCode(prefix);
			appendCode("];");
			appendCode("\n");
		}

	}