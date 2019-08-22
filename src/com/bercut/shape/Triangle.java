package com.bercut.shape;

public class Triangle extends Figure implements Shape {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) throws Exception {
        if (a + b > c && a + c > b && b + c > a) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            throw new Exception("Такой треугольник существовать не может!");
        }
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
