package com.bercut.calc;

class MathExpressionParser {
    private double operandA;
    private double operandB;
    private String operationSymbol;
    MathExpressionParser(String inputString) {
        String[] inputArray = inputString.split(" ");
        this.operandA = Double.parseDouble(inputArray[0]);
        this.operandB = Double.parseDouble(inputArray[2]);
        this.operationSymbol = inputArray[1];
    }

    public double getOperand() {
        return this.operandA;
    }


    public double getSecondOperand() {
        return this.operandB;
    }

    public String getOperationSymbol() {
        return this.operationSymbol;
    }

}
