package com.sda.exercises.oop.ex8;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Joiner<Integer> joinerInt = new Joiner<>("-");

        System.out.println(joinerInt.join(List.of(1, 2, 3, 4, 5)));

        Joiner<String> joinerStr = new Joiner<>("*");

        System.out.println(joinerStr.join(List.of("a", "b", "c", "d", "e", "f")));
    }
}
