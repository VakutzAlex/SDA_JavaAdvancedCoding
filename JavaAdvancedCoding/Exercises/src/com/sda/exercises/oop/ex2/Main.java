package com.sda.exercises.oop.ex2;

public class Main {

    public static void main(String[] args) {

        Point2D c = new Point2D(10, 15);
        Point2D p = new Point2D(5, 10);
        Circle circle1 = new Circle(c, p);

        System.out.println("Circle radius:" + circle1.getRadius());
        System.out.println("Circle perimeter:" + circle1.getPerimeter());
        System.out.println("Circle area:" + circle1.getArea());
    }
}
