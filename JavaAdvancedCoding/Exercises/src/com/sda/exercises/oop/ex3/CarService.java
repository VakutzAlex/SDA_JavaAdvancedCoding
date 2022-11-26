package com.sda.exercises.oop.ex3;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Create a CarService class that will contain a list of cars and implement the following methods:
 * 1. adding cars to the list,
 * 2. removing a car from the list,
 * 3. returning a list of all cars,
 * 4. returning cars with a V12 engine,
 * 5. returning cars produced before 1999,
 * 6. returning the most expensive car,
 * 7. returning the cheapest car
 * 8. returning the car with at least 3 manufacturers,
 * 9. returning a list of all cars sorted according to the passed parameter: ascending / descending,
 * 10. checking if a specific car is on the list,
 * 11. returning a list of cars manufactured by a specific manufacturer,
 * 12. returning the list of cars manufactured by the manufacturer with the year of establishment <,>, <=,> =, =,! = from the given.
 */

public class CarService {

    private final Set<Car> cars = new HashSet<>();

    // Add single car
    public void addCar(Car car) {
        cars.add(car);
    }

    // Add multiple cars
    public void addCars(Set<Car> cars) {
        this.cars.addAll(cars);
    }

    // Remove single car
    public void removeCar(Car car) {
        cars.remove(car);
    }

    // Remove multiple car
    public void removeCar(List<Car> cars) {
        this.cars.removeAll(cars);
    }

    public List<Car> getAllCars() {
        return new ArrayList<>(cars);
    }

    public List<Car> getAllV12Cars() {
        List<Car> v12 = new ArrayList<>();
        for (Car e : cars) {
            if (e.getEngineTypes() == EngineTypes.V12) {
                v12.add(e);
            }
        }
        return v12;
    }

    public List<Car> getAllV12CarsStream() {
        return cars.stream()
                .filter(car -> car.getEngineTypes() == EngineTypes.V12)
                .collect(Collectors.toList());
    }

    public List<Car> carBefore1999() {
        return cars.stream()
                .filter(car -> car.getYearOfManufacture() < 1999)
                .collect(Collectors.toList());
    }

    public Car mostExpensiveCar() {
        Car mostExpensiveCar = null;
        for (Car e : cars) {
            if (mostExpensiveCar.getPrice() < e.getPrice()) {
                mostExpensiveCar.setPrice(e.getPrice());
            }
        }
        return mostExpensiveCar;
    }

    public Optional<Car> mostExpensiveCarStream() {
        return cars.stream()
                .max((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
    }

    public Car cheapestCarStream() {
        return cars.stream()
                .min((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()))
                .get();
    }

    public List<Car> threeManufacturersCar() {
        return cars.stream().filter(car -> car.getManufacturerList().size() >= 3).collect(Collectors.toList());
    }

    public List<Car> getAllCarsSortedByPrice(boolean ascending) {
        return cars.stream().sorted((c1, c2) -> {
            if (ascending) {
                return Double.compare(c1.getPrice(), c2.getPrice());
            } else {
                return Double.compare(c2.getPrice(), c1.getYearOfManufacture());
            }
        }).collect(Collectors.toList());
    }

    public boolean checkForCar(Car car) {
        return cars.contains(car);
    }

    public List<Car> getCarsBySpecificManufacture(Manufacturer manufacture) {
        return cars.stream().filter(car -> car.getManufacturerList().contains(manufacture)).collect(Collectors.toList());
    }

    public List<Car> getCarByYearOfEstablishment(String operator, int year) {
        return cars.stream()
                .filter(car -> {
                    switch (operator) {
                        case ">": {
                            return car.getManufacturerList().stream()
                                    .anyMatch(manufacture -> manufacture.getYearOfEstablishment() > year);
                        }
                        case "<": {
                            return car.getManufacturerList().stream()
                                    .anyMatch(manufacture -> manufacture.getYearOfEstablishment() < year);
                        }
                        case ">=": {
                            return car.getManufacturerList().stream()
                                    .anyMatch(manufacture -> manufacture.getYearOfEstablishment() >= year);
                        }
                        case "<=": {
                            return car.getManufacturerList().stream()
                                    .anyMatch(manufacture -> manufacture.getYearOfEstablishment() <= year);
                        }
                        case "==": {
                            return car.getManufacturerList().stream()
                                    .anyMatch(manufacture -> manufacture.getYearOfEstablishment() == year);
                        }
                        case "!=": {
                            return car.getManufacturerList().stream()
                                    .anyMatch(manufacture -> manufacture.getYearOfEstablishment() != year);
                        }
                        default: {
                            throw new IllegalStateException("Invalid operator " + operator);
                        }
                    }
                })
                .collect(Collectors.toList());
    }

    public List<String> getAllModels(){
        return cars.stream()
                .map(car -> car.getModel())
                .distinct()
                .collect(Collectors.toList());
    }

}
