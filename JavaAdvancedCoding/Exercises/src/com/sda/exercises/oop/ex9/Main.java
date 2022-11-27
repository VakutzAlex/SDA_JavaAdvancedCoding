package com.sda.exercises.oop.ex9;

/**
 * Extend the ArrayList class by implementing the getEveryNthElement() method.
 * This method returns a list of elements and takes two parameters: the element index from which it starts and a number specifying which element to choose.
 * For the list: [a, b, c, d, e, f, g] and parameters: startIndex = 2 and skip = 3 it should return [c, g]
 */

public class Main {

    public static void main(String[] args) {
        SDA_ArrayList<String> listOfStr = new SDA_ArrayList<>();

        listOfStr.add("a");
        listOfStr.add("b");
        listOfStr.add("c");
        listOfStr.add("d");
        listOfStr.add("e");
        listOfStr.add("f");
        listOfStr.add("g");

        System.out.println(listOfStr.getEveryNthElement(2, 3));
    }
}
