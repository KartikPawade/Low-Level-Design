package org.lld.design_patterns.behavioural.decorator;

import java.util.Objects;

public class Store {
}

abstract class BasePizza {
    public abstract void cost();
}
//
//class Margherita extends BasePizza{
//
//
//    @Override
//    public void cost() {
//        System.out.println("200");
//    }
//}
//
//class Margherita extends BasePizza{


//    @Override
//    public void cost() {
//        System.out.println("200");
//    }
//}

abstract class PizzaDecorator extends BasePizza{
    BasePizza basePizza;
}





