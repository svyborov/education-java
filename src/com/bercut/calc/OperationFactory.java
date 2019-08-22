package com.bercut.calc;

public class OperationFactory {
    static Operation create(MathExpressionParser p) throws Exception {
        Operation operation;

        switch (p.getOperationSymbol()) {
            case ("+"):
                operation = new PlusOperation(p.getOperand(), p.getSecondOperand());
                break;
            case ("-"):
                operation = new BinaryMinusOperation(p.getOperand(), p.getSecondOperand());
                break;
            case ("^"):
                operation = new PowerOperation(p.getOperand(), p.getSecondOperand());
                break;
            default:
                throw new Exception("Не удалось определить операцию");
        }
        return operation;
    }
}
