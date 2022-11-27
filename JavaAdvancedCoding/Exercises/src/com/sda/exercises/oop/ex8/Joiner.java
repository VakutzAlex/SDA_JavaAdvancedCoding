package com.sda.exercises.oop.ex8;

import java.util.List;

/**
 * Design the Joiner class, which in the constructor will take a separator (string) and have a join() method that allows you to specify any number of T-type objects.
 * This method will return a string joining all passed elements by calling their toString() method and separating them with a separator.
 * eg. for Integers and separator "-" it should return: 1-2-3-4
 */

public class Joiner<T> {

    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(List<T> element) {
        String result = "";
        for (int i = 0; i < element.size(); i++) {
            result = result + element.get(i).toString();

            if(i!=element.size()-1){
                result = result + separator;
            }
        }
        return result;
    }
}
