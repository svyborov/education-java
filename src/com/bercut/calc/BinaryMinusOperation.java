package com.bercut.calc;

public class BinaryMinusOperation extends AbstractBinaryOperation {

    public BinaryMinusOperation(double a, double b) {
        super(a, b);
    }

    @Override
    public String getOperationSymbol() {
        return "-";
    }

    @Override
    public double doProcess() {
        return getOperandA() - getOperandB();
    }
}
