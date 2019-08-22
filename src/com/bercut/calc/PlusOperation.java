package com.bercut.calc;

public class PlusOperation extends AbstractBinaryOperation {
    public PlusOperation(double a, double b) {
        super(a, b);
    }

    @Override
    public String getOperationSymbol() {
        return "+";
    }

    @Override
    public double doProcess() {
        return getOperandA() + getOperandB();
    }
}
