package com.sda.exercises.oop.ex5;

public class Qube extends Shape3D {

    private double length;

    public Qube(double length) {
        this.length = length;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * length;
    }

    @Override
    public double calculateArea() {
        return Math.pow(length, 2);
    }

    @Override
    public double calculateVolume() {
        return Math.pow(length, 3);
    }
}
