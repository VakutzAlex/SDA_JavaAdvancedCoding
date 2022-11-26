package com.sda.exercises.oop.ex3;

import java.sql.SQLOutput;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CarService service = new CarService();

        Manufacturer bmw = new Manufacturer("BMW", "Germany", 1916);
        Manufacturer dacia = new Manufacturer("Dacia", "Romania", 1921);
        Manufacturer audi1 = new Manufacturer("Audi", "Germany", 1970);
        Manufacturer audi2 = new Manufacturer("Audi", "Romania", 1945);
        Manufacturer audi3 = new Manufacturer("Audi", "Framce", 1980);

        Car car1 = new Car("A4", "Break", 2000, 1998, List.of(audi1, audi2, audi3), EngineTypes.V12);

        service.addCar(car1);

        Car car2 = new Car("Viper", "Sport", 35000, 2013, List.of(bmw, dacia), EngineTypes.V6);

        service.addCar(car2);

        Car car3 = new Car("Challenger", "Sport", 40000, 2015, List.of(bmw, dacia), EngineTypes.V6);

        service.addCar(car3);

        System.out.println("List of cars: \n" + service.getAllCars());
        System.out.println("V12 engine cars: \n" + service.getAllV12CarsStream());
        System.out.println("Cars before 1999: \n" + service.carBefore1999());
        System.out.println("Most expensive car: \n" + service.mostExpensiveCarStream());
        System.out.println("Cheapest car: \n" + service.cheapestCarStream());
        System.out.println("At least three manufacturer car: \n" + service.threeManufacturersCar());
        System.out.println("Cars ascending by price: \n" + service.getAllCarsSortedByPrice(true));
        System.out.println("Cars descending by price: \n" + service.getAllCarsSortedByPrice(false));
        Car car4 = new Car("A4", "Break", 2000, 1998, List.of(audi1, audi2, audi3), EngineTypes.V12);
        System.out.println("Check if car is in service: \n" + service.checkForCar(car4));
        Manufacturer dacia1 = new Manufacturer("Dacia", "Romania", 1921);
        System.out.println("All cars by manufacturer: \n" + service.getCarsBySpecificManufacture(dacia1));
        System.out.println("All cars by manufacturer with year of establishment > : \n" + service.getCarByYearOfEstablishment(">", 1900));
        System.out.println("All cars by manufacturer with year of establishment > : \n" + service.getCarByYearOfEstablishment("abc", 1999));
    }
}
