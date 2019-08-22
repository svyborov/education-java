package com.bercut.coffee;

public class CupOfCoffee {
    private final int sugar;
    private final boolean milk;
    public static int instanceCount;

    public CupOfCoffee(int sugar, boolean milk) {
        this.sugar = sugar;
        this.milk = milk;
        instanceCount++;
    }

    public CupOfCoffee() {
        this(3, false);
    }

    public Joy drink() {
        return null;
    }

    public void close() {
        System.out.println("Чашка закрыта!");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Финализированная чашка. Всего осталось: " + --instanceCount);
        if (instanceCount == 0) {
            System.out.println("Все сваренные чашки кофе были выпиты");
        }
    }
}
