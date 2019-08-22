package com.bercut.calc;

public class PowerOperation extends AbstractBinaryOperation{
    public PowerOperation(double a, double b) {
        super(a, b);
    }

    @Override
    public String getOperationSymbol() {
        return "^";
    }

    @Override
    public double doProcess() {
        return Math.pow(getOperandA(), getOperandB());
    }
}
