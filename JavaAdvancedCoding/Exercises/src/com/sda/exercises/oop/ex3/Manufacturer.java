package com.sda.exercises.oop.ex3;

/*
Create a Manufacturer class that will contain fields: name, year of establishment, country.
Include all necessary methods and constructor parameters.
Implement the hashCode() and equals() methods.
Create a Car class that will contain fields: name, model, price, year of manufacture,
manufacturer list (Manufacturer), and engine type (represented as the enum class, e.g. V12, V8, V6, S6, S4, S3).
Include all necessary methods and constructor parameters. Implement the hashcode() and equals() methods
 */

import java.util.Objects;

public class Manufacturer {

    private String manufacturer;
    private String country;
    private int yearOfEstablishment;

    public Manufacturer(String manufacturer, String country, int yearOfEstablishment) {
        this.manufacturer = manufacturer;
        this.country = country;
        this.yearOfEstablishment = yearOfEstablishment;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getCountry() {
        return country;
    }

    public int getYearOfEstablishment() {
        return yearOfEstablishment;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setYearOfEstablishment(int yearOfEstablishment) {
        this.yearOfEstablishment = yearOfEstablishment;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "manufacturer='" + manufacturer + '\'' +
                ", country='" + country + '\'' +
                ", yearOfEstablishment=" + yearOfEstablishment +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return yearOfEstablishment == that.yearOfEstablishment && Objects.equals(manufacturer, that.manufacturer) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, country, yearOfEstablishment);
    }
}
