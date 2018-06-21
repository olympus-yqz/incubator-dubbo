package com.alibaba.dubbo.demo.knowledge.pattern.decorator;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();

        System.out.println(beverage.getDescription() + " : $" + beverage.cost());
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        beverage = new Soy(beverage);

        System.out.println(beverage.getDescription() + " : $" + beverage.cost());
    }
}
