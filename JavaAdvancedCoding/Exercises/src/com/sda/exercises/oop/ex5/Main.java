package com.sda.exercises.oop.ex5;

public class Main {

    public static void main(String[] args) {
        Shape3D shape1 = new Qube(100);

        System.out.println("Perimeter: " + shape1.calculatePerimeter());
        System.out.println("Area: " + shape1.calculateArea());
        System.out.println("Volume: "  + shape1.calculateVolume());

        System.out.println("Fill status: " );
        shape1.fill((int)shape1.calculateVolume());
        System.out.println("Fill status: " );
        shape1.fill(10);
        System.out.println("Fill status: " );
        shape1.fill(100000000);
    }
}
