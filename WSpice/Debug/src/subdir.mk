################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../src/main.c \
../src/mice.c \
../src/wspice.c 

OBJS += \
./src/main.o \
./src/mice.o \
./src/wspice.o 

C_DEPS += \
./src/main.d \
./src/mice.d \
./src/wspice.d 


# Each subdirectory must supply rules for building sources it contributes
src/%.o: ../src/%.c
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C Compiler'
	gcc -I/Users/lintondf/cspice/mice -I/Users/lintondf/cspice/include -I/Applications/Mathematica.app/Contents//SystemFiles/IncludeFiles/C/ -I/Applications/Mathematica.app/Contents/Frameworks/mathlink.framework/Versions/4.36/Headers -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


