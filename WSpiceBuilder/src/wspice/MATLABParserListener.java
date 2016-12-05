// Generated from MATLABParser.g4 by ANTLR 4.5.3

    package wspice;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MATLABParser}.
 */
public interface MATLABParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MATLABParser#fileDecl}.
	 * @param ctx the parse tree
	 */
	void enterFileDecl(MATLABParser.FileDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#fileDecl}.
	 * @param ctx the parse tree
	 */
	void exitFileDecl(MATLABParser.FileDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(MATLABParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(MATLABParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#endStat}.
	 * @param ctx the parse tree
	 */
	void enterEndStat(MATLABParser.EndStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#endStat}.
	 * @param ctx the parse tree
	 */
	void exitEndStat(MATLABParser.EndStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#endStatNL}.
	 * @param ctx the parse tree
	 */
	void enterEndStatNL(MATLABParser.EndStatNLContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#endStatNL}.
	 * @param ctx the parse tree
	 */
	void exitEndStatNL(MATLABParser.EndStatNLContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#partialFunctionDecl}.
	 * @param ctx the parse tree
	 */
	void enterPartialFunctionDecl(MATLABParser.PartialFunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#partialFunctionDecl}.
	 * @param ctx the parse tree
	 */
	void exitPartialFunctionDecl(MATLABParser.PartialFunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(MATLABParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(MATLABParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(MATLABParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(MATLABParser.MethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(MATLABParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(MATLABParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#propBlockDecl}.
	 * @param ctx the parse tree
	 */
	void enterPropBlockDecl(MATLABParser.PropBlockDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#propBlockDecl}.
	 * @param ctx the parse tree
	 */
	void exitPropBlockDecl(MATLABParser.PropBlockDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#methodBlockDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodBlockDecl(MATLABParser.MethodBlockDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#methodBlockDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodBlockDecl(MATLABParser.MethodBlockDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#outArgs}.
	 * @param ctx the parse tree
	 */
	void enterOutArgs(MATLABParser.OutArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#outArgs}.
	 * @param ctx the parse tree
	 */
	void exitOutArgs(MATLABParser.OutArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#inArgs}.
	 * @param ctx the parse tree
	 */
	void enterInArgs(MATLABParser.InArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#inArgs}.
	 * @param ctx the parse tree
	 */
	void exitInArgs(MATLABParser.InArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#prop}.
	 * @param ctx the parse tree
	 */
	void enterProp(MATLABParser.PropContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#prop}.
	 * @param ctx the parse tree
	 */
	void exitProp(MATLABParser.PropContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#idRef}.
	 * @param ctx the parse tree
	 */
	void enterIdRef(MATLABParser.IdRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#idRef}.
	 * @param ctx the parse tree
	 */
	void exitIdRef(MATLABParser.IdRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#statBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatBlock(MATLABParser.StatBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#statBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatBlock(MATLABParser.StatBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(MATLABParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(MATLABParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#whileStat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(MATLABParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#whileStat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(MATLABParser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#forStat}.
	 * @param ctx the parse tree
	 */
	void enterForStat(MATLABParser.ForStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#forStat}.
	 * @param ctx the parse tree
	 */
	void exitForStat(MATLABParser.ForStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#caseStat}.
	 * @param ctx the parse tree
	 */
	void enterCaseStat(MATLABParser.CaseStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#caseStat}.
	 * @param ctx the parse tree
	 */
	void exitCaseStat(MATLABParser.CaseStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#scalarAssignStat}.
	 * @param ctx the parse tree
	 */
	void enterScalarAssignStat(MATLABParser.ScalarAssignStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#scalarAssignStat}.
	 * @param ctx the parse tree
	 */
	void exitScalarAssignStat(MATLABParser.ScalarAssignStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#arrayAssignStat}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignStat(MATLABParser.ArrayAssignStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#arrayAssignStat}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignStat(MATLABParser.ArrayAssignStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(MATLABParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(MATLABParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#arrayRef}.
	 * @param ctx the parse tree
	 */
	void enterArrayRef(MATLABParser.ArrayRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#arrayRef}.
	 * @param ctx the parse tree
	 */
	void exitArrayRef(MATLABParser.ArrayRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(MATLABParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(MATLABParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#cellExpr}.
	 * @param ctx the parse tree
	 */
	void enterCellExpr(MATLABParser.CellExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#cellExpr}.
	 * @param ctx the parse tree
	 */
	void exitCellExpr(MATLABParser.CellExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MATLABParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MATLABParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(MATLABParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(MATLABParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hcat}
	 * labeled alternative in {@link MATLABParser#exprArrayList}.
	 * @param ctx the parse tree
	 */
	void enterHcat(MATLABParser.HcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hcat}
	 * labeled alternative in {@link MATLABParser#exprArrayList}.
	 * @param ctx the parse tree
	 */
	void exitHcat(MATLABParser.HcatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vcat}
	 * labeled alternative in {@link MATLABParser#exprArrayList}.
	 * @param ctx the parse tree
	 */
	void enterVcat(MATLABParser.VcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vcat}
	 * labeled alternative in {@link MATLABParser#exprArrayList}.
	 * @param ctx the parse tree
	 */
	void exitVcat(MATLABParser.VcatContext ctx);
}