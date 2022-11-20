package com.sda.exercises.oop.ex1;

/*
Implement the Validator interface, which will include a boolean validate(Parcel input) method in its declaration.
Create a Parcel class with the parameters: • int xLength • int yLength • int zLength • float weight • boolean isExpress
The validator should verify that the sum of the dimensions (x, y, z) does not exceed 300, whether each size is not less than 30,
whether the weight does not exceed 30.0 for isExpress = false or 15.0 for isExpress = true. In case of errors, it should inform the user about them.
*/

public class Parcel {

    private int length;
    private int width;
    private int height;
    private float weight;
    private boolean isExpress;

    public Parcel(int length, int width, int height, float weight, boolean isExpress) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", weight=" + weight +
                ", isExpress=" + isExpress +
                '}';
    }
}
