package com.sda.exercises.oop.ex5;

/**
 * Create an abstract 3DShape class that extends the Shape class from the previous task.
 * Add an additional method calculateVolume(). Create Cone and Qube classes by extending the 3DShape class, properly implementing abstract methods.
 * Verify the solution correctness.
 */

public abstract class Shape3D  extends Shape implements Fillable{

    public abstract double calculateVolume();

    @Override
    public void fill(int water){
        if(water == calculateVolume()){
            System.out.println("To the brim");
        }else if(water > calculateVolume()){
            System.out.println("Overflow");
        }else {
            System.out.println("Not enough water to fill");
        }
    }

}
