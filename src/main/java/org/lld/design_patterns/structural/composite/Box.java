package org.lld.design_patterns.structural.composite;


import java.util.ArrayList;
import java.util.List;


class Main {
    public static void main(String[] args) {
        /**
         *
         * Composite Design Pattern
         * This Pattern is used for optimally making and linking objects in terms of structure
         * This can be used when we have Objects structure, which follow tree behaviour, or recursive behaviour.
         */

        Product p1 = new Product();
        Box box1 = new Box();

        List<Thing> things = new ArrayList<>();
        things.add(p1);
        things.add(box1);


        Thing thing = new Box(things);
        thing.getInfo();
    }
}


interface Thing {
    void getInfo();
}

class Product implements Thing {

    @Override
    public void getInfo() {
        System.out.println("This is a product");
    }
}

public class Box implements Thing {
    List<Thing> things;

    public Box(List<Thing> things) {
        this.things = things;
    }

    public Box() {
        this.things = new ArrayList<>();
    }

    @Override
    public void getInfo() {
        for (Thing thing : things) {
            thing.getInfo();
        }
    }
}

