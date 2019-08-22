package com.bercut.calc;

public class Main {
    public static void main(String[] args) throws Exception {
//        MathExpressionParser expression = parse(args[0]);
        MathExpressionParser expression = parse("44 + 22");
        Operation operation = OperationFactory.create(expression);
        double result = 0;
        result = operation.doProcess();
        System.out.println("Результат: " + result);
    }

    private static MathExpressionParser parse(String inputString) {
        return new MathExpressionParser(inputString);
    }
}
