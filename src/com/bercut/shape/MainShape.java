package com.bercut.shape;

import java.util.Arrays;

public class MainShape {
    public static void main(String[] args) throws InterruptedException {
        int i = 10;

        double maxSideLength;

        Figure[] figures = new Figure[i];

        for (int j = 0; j < figures.length; j++) {
            int figure = (int) (Math.random() * 3);

            System.out.println(figure);
            switch (figure) {
                case 0:
                    try {
                        double a = (Math.random() * 10);
                        double b = (Math.random() * 10);
                        double c = (Math.random() * 10);
                        figures[j] = new Triangle(a, b, c);
                    } catch (Exception exception) {
                        System.out.println(exception.getMessage());
                    }
                    break;
                case 1:
                    double a = (Math.random() * 10);
                    figures[j] = new Circle(a);
                    break;
                case 2:
                    double q = (Math.random() * 10);
                    double w = (Math.random() * 10);
                    figures[j] = new Rectangle(q, w);
                    break;
                default:
                    System.out.println("Вышли за диапазон фигур: " + figure);
            }
        }

        System.out.println(Arrays.toString(figures));

        Figure maxPerimeterFigure = getMaxPerimeter(figures);
        System.out.println("Максимальный периметр: " + maxPerimeterFigure.getPerimeter() + "У Фигуры: " + maxPerimeterFigure);


        Figure minPerimeterFigure = getMinPerimeter(figures);

        System.out.println("Минимальный периметр: " + minPerimeterFigure.getPerimeter() + "У Фигуры: " + minPerimeterFigure);
        Thread.sleep(40000);
    }


    static Figure getMaxPerimeter(Figure[] figures) {
        Figure maxPerimeterFigure = null;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i] != null) {
                if (maxPerimeterFigure == null || figures[i].getPerimeter() > maxPerimeterFigure.getPerimeter()) {
                    maxPerimeterFigure = figures[i];
                }
            }
        }

        return maxPerimeterFigure;
    }

    static Figure getMinPerimeter(Figure[] figures) {
        Figure minPerimeterFigure = null;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i] != null) {
                if (minPerimeterFigure == null || figures[i].getPerimeter() < minPerimeterFigure.getPerimeter()) {
                    minPerimeterFigure = figures[i];
                }
            }
        }

        return minPerimeterFigure;
    }
}
