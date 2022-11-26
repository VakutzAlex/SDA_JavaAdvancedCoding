package com.sda.exercises.oop.ex5;

/**
 * Create a Fillable interface with the fill() method. Implement the method in the 3DShape class from the previous task or separately in the Cone and Qube classes.
 * The fill() method should take a parameter, e.g. int, and check whether after the action of filling the figure:
 *  • will pour too much water into the figure and overflow,
 * • fill the figure with water to the brim,
 * • not pouring enough water. For each situation, it should write the status information in the console.
 * Use the calculateVolume() method.
 */

public interface Fillable {

    void fill(int water);
}
