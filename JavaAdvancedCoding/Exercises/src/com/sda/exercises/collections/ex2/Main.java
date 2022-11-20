package com.sda.exercises.collections.ex2;

/*
Ex 2 Create a method that takes a string list as a parameter, then returns that list sorted alphabetically from Z to A case-insensitive.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Andrei");
        list.add("bndrei");
        list.add("Vndrei");
        list.add("Zndrei");
        list.add("mndrei");

        System.out.println(orderedCaseList(list));

    }

    public static List<String> orderedCaseList(List<String> list) {
        return list.stream().sorted((o1, o2) -> o2.compareToIgnoreCase(o1)).collect(Collectors.toList());
    }
}
