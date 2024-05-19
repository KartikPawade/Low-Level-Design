package org.lld.design_patterns.structural.decorator;

public class Store {
    /**
     * We use Decorator pattern to prevent class Explosion scenario, where some group of classes need multiple layer combination of other group of classes which results in too many combination.
     * So we use this pattern : Pizza -> cheese (mushroom ( Margeritha) )
     *
     * Here we create this result dynamically. without creating those class directly.
     */

    public static void main(String[] args) {

        BasePizza pizza = new ExtraCheese(new Mushroom(new Farmhouse()));
        System.out.println(pizza.cost());
    }
}

abstract class BasePizza {
    public abstract int cost();
}

class Margherita extends BasePizza {
    @Override
    public int cost() {
        return 200;
    }
}

class VegDelight extends BasePizza {
    @Override
    public int cost() {
        return 250;
    }
}

class Farmhouse extends BasePizza {
    @Override
    public int cost() {
        return 300;
    }
}

abstract class PizzaDecorator extends BasePizza {
    BasePizza basePizza;
}

class ExtraCheese extends PizzaDecorator {

    public ExtraCheese(BasePizza pizza){
        this.basePizza = pizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 50;
    }
}

class Mushroom extends PizzaDecorator {

    public Mushroom(BasePizza pizza){
        this.basePizza = pizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 60;
    }
}