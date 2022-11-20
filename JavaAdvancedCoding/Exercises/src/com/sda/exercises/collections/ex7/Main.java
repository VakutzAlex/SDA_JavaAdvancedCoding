package com.sda.exercises.collections.ex7;

// Create a method that accepts TreeMap and prints the first and last EntrySet in the console.

import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        TreeMap<String, String> tree = new TreeMap<>();

        tree.put("key1", "val1");
        tree.put("key2", "val2");
        tree.put("key3", "val3");
        tree.put("key4", "val4");
        tree.put("key5", "val5");
        tree.put("key6", "val6");

        firstAndLastEntries(tree);
    }

    public static void firstAndLastEntries(TreeMap<String, String> input){
        System.out.println("First entry: " + input.firstEntry());
        System.out.println("Last entry: " + input.lastEntry());
    }
}
