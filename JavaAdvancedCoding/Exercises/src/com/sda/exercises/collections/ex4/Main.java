package com.sda.exercises.collections.ex4;

/*
Write a program which creates a concordance of characters occurring in a string (i.e., which characters occur where in a string).
Read the string from the command line.
Ex: {d=[9], o=[4, 6], r=[7], W=[5], H=[0], l=[2, 3, 8], e=[1]}
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(concordanceOfCharacters("Hello world"));

    }

    public static HashMap<Character, List<Integer>> concordanceOfCharacters(String input) {
        HashMap<Character, List<Integer>> valueByKey = new HashMap<>();

        for (int i = 0; i < input.toCharArray().length; i++) {
            char currentChar = input.toCharArray()[i];
            if (valueByKey.containsKey(currentChar)) {
                List<Integer> indexList = valueByKey.get(currentChar);
                indexList.add(i);
                valueByKey.put(currentChar, indexList);
            } else {
                List<Integer> indexList = new ArrayList<>();
                indexList.add(i);
                valueByKey.put(currentChar, indexList);
            }
        }

        return valueByKey;
    }
}
