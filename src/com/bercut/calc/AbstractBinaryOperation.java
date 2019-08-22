package com.bercut.calc;

public abstract class AbstractBinaryOperation implements Operation {
    double operandA;
    double operandB;
    public AbstractBinaryOperation(double a, double b) {
        this.operandA = a;
        this.operandB = b;
    }

    public double getOperandA() {
        return operandA;
    }

    public double getOperandB() {
        return operandB;
    }


}
