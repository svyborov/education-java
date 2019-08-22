package com.bercut.coffee;

public class InvocationChain {
    public static void main(String[] args) {
        CoffeeMachine machine = CoffeeMachine.getInstance();
        CupOfCoffee cup = machine
                .addSugar()
                .removeSugar()
                .removeSugar()
                .addMilk()
                .pay(20)
                .boildCoffee();

        System.out.println("Количество чашек кофе: " + CupOfCoffee.instanceCount);

        machine.boildCoffee();
        machine.boildCoffee();
        machine.boildCoffee();
        System.out.println("Количество чашек кофе: " + CupOfCoffee.instanceCount);


        System.out.println(machine);
        cup.close();
        Joy joy = cup.drink();

        System.out.println("Количество чашек кофе: " + CupOfCoffee.instanceCount);

        cup.close();
        cup.close();
        cup.close();

    }
}


class CoffeeMachine {
    private int sugar = 3;
    private boolean milk = false;
    private int cash = 0;

    static CoffeeMachine getInstance() {
        return new CoffeeMachine();
    }

    public CoffeeMachine addSugar() {
        sugar++;
        return this;
    }

    public CoffeeMachine removeSugar() {
        sugar--;
        return this;
    }

    public CoffeeMachine addMilk() {
        milk = true;
        return this;
    }

    public CoffeeMachine pay(int money) {
        cash += money;
        return this;
    }

    public CupOfCoffee boildCoffee() {
        return new CupOfCoffee(sugar, milk);
    }

    @Override
    public String toString() {
        return "CoffeeMachine{" +
                "sugar=" + sugar +
                ", milk=" + milk +
                ", cash=" + cash +
                '}';
    }
}
