package com.sda.exercises.collections.ex1;

/*
Ex 1 - Create a method that takes a string list as a parameter, then returns the list sorted alphabetically from Z to A.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Andrei");
        list.add("Bndrei");
        list.add("Vndrei");
        list.add("Zndrei");

        System.out.println(sortList(list));
        System.out.println(sortListWithLambda(list));
        System.out.println(sortListWithStream(list));
    }

    public static List<String> sortList(List<String> list) {

        List<String> sortedList = new ArrayList<>();

        sortedList.addAll(list);

        sortedList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        return sortedList;
    }

    public static List<String> sortListWithLambda(List<String> list) {

        List<String> sortedList = new ArrayList<>();

        sortedList.addAll(list);

        sortedList.sort((o1,o2) -> {return o2.compareTo(o1);});

        return sortedList;
    }

    public static List<String> sortListWithStream(List<String> list) {

       return list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}
