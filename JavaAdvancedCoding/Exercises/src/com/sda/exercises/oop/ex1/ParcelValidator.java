package com.sda.exercises.oop.ex1;

import java.util.function.Predicate;

/*
Implement the Validator interface, which will include a boolean validate(Parcel input) method in its declaration.
Create a Parcel class with the parameters: • int xLength • int yLength • int zLength • float weight • boolean isExpress
The validator should verify that the sum of the dimensions (x, y, z) does not exceed 300, whether each size is not less than 30,
whether the weight does not exceed 30.0 for isExpress = false or 15.0 for isExpress = true. In case of errors, it should inform the user about them.
 */

public class ParcelValidator implements Predicate<Parcel> {

    @Override
    public boolean test(Parcel parcel) {
       int sum = parcel.getHeight()+ parcel.getLength()+ parcel.getWidth();

       if(sum > 300){
           System.out.println("The sum of dimensions exceeds 300");
           return false;
       }

       if(parcel.getLength() < 30){
           System.out.println("Length exceeded");
           return false;
       }

        if(parcel.getHeight() < 30){
            System.out.println("Height exceeded");
            return false;
        }

        if(parcel.getWidth() < 30){
            System.out.println("Width exceeded");
            return false;
        }

       if(parcel.getWeight() > 30 && parcel.isExpress() == false){
           System.out.println("Weight limit exceeded");
           return false;
       }

        if(parcel.getWeight() > 15 && parcel.isExpress() == true){
            System.out.println("Weight limit exceeded");
            return false;
        }

        return true;
    }
}
