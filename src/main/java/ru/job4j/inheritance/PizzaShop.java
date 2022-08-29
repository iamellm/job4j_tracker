package ru.job4j.inheritance;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        PizzaExtraCheese pizzaWithExtraCheese = new PizzaExtraCheese();
        PizzaExtraCheeseExtraTomato pizzaExtraCheeseExtraTomato = new PizzaExtraCheeseExtraTomato();
        System.out.println(pizza.name());
        System.out.println(pizzaWithExtraCheese.name());
        System.out.println(pizzaExtraCheeseExtraTomato.name());
    }
}
