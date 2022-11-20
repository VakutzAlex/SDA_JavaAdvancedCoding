package com.sda.exercises.collections.ex3;

/*
Create a method that takes the map as a parameter, where the key is string and the value number,
 and then prints each map element to the console in the format: Key: , Value: .
 There should be a comma at the end of every line except the last, and a period at the last.
 Example: Key: Java, Value: 18, Key: Python, Value: 1, … Key: PHP, Value: 0.
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("Java", 18);
        mapa.put("Python", 1);
        mapa.put("PHP", 0);

        printMap(mapa);
        printMapV2(mapa);
    }

    public static void printMap(HashMap<String, Integer> map) {
        Set<Map.Entry<String, Integer>> mapEntries = map.entrySet();

        for (Map.Entry<String, Integer> e : mapEntries) {
            System.out.println("Key: " + e.getKey() + " Element: " + e.getValue());
        }
    }

    public static void printMapV2(HashMap<String, Integer> map) {
        Set<Map.Entry<String, Integer>> mapEntries = map.entrySet();

        List<Map.Entry<String, Integer>> mapEntriesAsList = new ArrayList<>(mapEntries);

        for (int i = 0; i < mapEntriesAsList.size(); i++) {
            if (i == mapEntriesAsList.size() - 1) {
                System.out.println("Key: " + mapEntriesAsList.get(i).getKey() + " Element: " + mapEntriesAsList.get(i).getValue() + ".");
            } else {
                System.out.println("Key: " + mapEntriesAsList.get(i).getKey() + " Element: " + mapEntriesAsList.get(i).getValue() + ",");
            }
        }
    }
}
