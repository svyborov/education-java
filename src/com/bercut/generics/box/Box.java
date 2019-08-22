package com.bercut.generics.box;

public class Box<T> {
    private T item;

    void putItem(T newItem) {
        item = newItem;
    }

    T getItem() {
        return item;
    }

    void delete() {
        item = null;
    }

    @Override
    public String toString() {
        return "В коробке - " + item;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<> ();
        System.out.println(stringBox.toString());
        stringBox.putItem("Hello");
        System.out.println(stringBox.toString());
        stringBox.delete();
        System.out.println(stringBox.toString());


        Box<Integer> intBox = new Box<> ();
        intBox.putItem(123);

        System.out.println("Сожержимое коробок: ");
        System.out.println(stringBox);
        System.out.println(intBox);
//
//        System.out.println("Сожержимое коробок после свапа: ");
//        swapContent(stringBox, intBox);
//        System.out.println(stringBox);
//        System.out.println(intBox);


        System.out.println("Сумма элементов: " + sum(intBox, intBox));

    }


    public static double sum(Box<Integer>... box) {
        double sum = 0;
        for (Box<Integer> IntegerBox: box) {
            sum += IntegerBox.getItem();
        }

        return sum;
    }

    public static void swapContent(Box b1, Box b2) {
        Object tmp = b1.getItem();

        b1.putItem(b2.getItem());
        b2.putItem(tmp);

    }
}
