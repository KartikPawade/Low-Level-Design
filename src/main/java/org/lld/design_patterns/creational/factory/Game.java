package org.lld.design_patterns.creational.factory;


public class Game {
    /**
     * When we need objects base on some logic, that logic should be written all the places where we want it, to prevent this we use Factory Pattern
     */
    public static void main(String[] args) {
        Shape circleShape = ShapeFactory.getShape("Square");
        if (circleShape != null) {
            circleShape.hasShape();
        } else {
            System.out.println("No such shape present");
        }
    }
}

class ShapeFactory {
    public static Shape getShape(String shape) {
        return switch (shape) {
            case "circle" -> new Circle();
            case "Square" -> new Square();
            case "Rectangle" -> new Rectangle();
            default -> null;
        };
    }
}

interface Shape {
    void hasShape();
}

class Circle implements Shape {

    @Override
    public void hasShape() {
        System.out.println("Circle");
    }
}

class Square implements Shape {

    @Override
    public void hasShape() {
        System.out.println("SQUARE");
    }
}

class Rectangle implements Shape {
    @Override
    public void hasShape() {
        System.out.println("Rectangle");
    }
}


