package com.sda.exercises.oop.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Create a Car class that will contain fields: name, model, price, year of manufacture,
 * manufacturer list (Manufacturer), and engine type (represented as the enum class, e.g. V12, V8, V6, S6, S4, S3).
 * Include all necessary methods and constructor parameters. Implement the hashcode() and equals() methods
 */

public class Car {
    private String name;
    private String model;
    private double price;
    private int yearOfManufacture;
    private List<Manufacturer> manufacturerList;
    private EngineTypes engineTypes;

    public Car(String name, String model, double price, int yearOfManufacture, List<Manufacturer> manufacturerList, EngineTypes engineTypes) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.manufacturerList = manufacturerList;
        this.engineTypes = engineTypes;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public List<Manufacturer> getManufacturerList() {
        return manufacturerList;
    }

    public EngineTypes getEngineTypes() {
        return engineTypes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setManufacturerList(List<Manufacturer> manufacturerList) {
        this.manufacturerList = manufacturerList;
    }

    public void setEngineTypes(EngineTypes engineTypes) {
        this.engineTypes = engineTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && yearOfManufacture == car.yearOfManufacture && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(manufacturerList, car.manufacturerList) && engineTypes == car.engineTypes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacture, manufacturerList, engineTypes);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", yearOfManufacture=" + yearOfManufacture +
                ", manufacturerList=" + manufacturerList +
                ", engineTypes=" + engineTypes +
                '}';
    }
}
