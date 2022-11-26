package com.sda.exercises.oop.ex4;

public class Main {

    public static void main(String[] args) {
        System.out.println("Price of Ferrari: " + Car.FERRARI.getPrice());
        System.out.println("Power of Ferrari: " + Car.FERRARI.getPrice());
        System.out.println("Is premium? " + Car.FERRARI.isPremium());
        System.out.println("Ferrari is faster than BMW? " + Car.FERRARI.isFasterThan(Car.BMW));
    }
}
