package org.lld.design_patterns.structural.prototype;

public abstract class Shape {

    protected int a;
    protected int b;
    protected int c;
    protected int d;

    public Shape(Shape shape) {
        this.a = shape.a;
        this.b = shape.b;
        this.c = shape.c;
        this.d = shape.d;
    }

    public Shape() {
    }

    public abstract Shape clone();
}

class Rectangle extends Shape {

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
    }

    public Rectangle(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rectangle{");
        sb.append("a=").append(a);
        sb.append(", b=").append(b);
        sb.append(", c=").append(c);
        sb.append(", d=").append(d);
        sb.append('}');
        return sb.toString();
    }
}

class Main {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(1,2,3,4);

        Shape shape2 = shape1.clone();

        System.out.println(shape1);
        System.out.println(shape2);
    }
}
