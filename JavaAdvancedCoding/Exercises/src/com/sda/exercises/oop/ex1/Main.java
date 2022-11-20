package com.sda.exercises.oop.ex1;

/*
Implement the Validator interface, which will include a boolean validate(Parcel input) method in its declaration.
Create a Parcel class with the parameters: • int xLength • int yLength • int zLength • float weight • boolean isExpress
The validator should verify that the sum of the dimensions (x, y, z) does not exceed 300, whether each size is not less than 30,
whether the weight does not exceed 30.0 for isExpress = false or 15.0 for isExpress = true. In case of errors, it should inform the user about them.
 */

import javax.xml.validation.Validator;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Parcel> parcels = new ArrayList<>();

        parcels.add(new Parcel(10,15,20,29, false));
        parcels.add(new Parcel(10,15,20,14, true));
        parcels.add(new Parcel(100,150,200,29, true));
        parcels.add(new Parcel(32,35,200,32, false));
        parcels.add(new Parcel(32,35,200,14, true));
        parcels.add(new Parcel(32,35,200,22, false));

        parcels.stream().filter(new ParcelValidator())
                .forEach(parcel -> System.out.println(parcel));
    }
}
