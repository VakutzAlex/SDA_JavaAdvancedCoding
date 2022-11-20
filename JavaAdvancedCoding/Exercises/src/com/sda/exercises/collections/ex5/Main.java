package com.sda.exercises.collections.ex5;

/*
Create a Storage class that will have a private Map field, a public constructor, and methods:
addToStorage(String key, String value) → adding elements to the storage
printValues(String key) → displaying all elements under a given key
findValues(String value) → displaying all keys that have a given value
The Storage class should allow you to store multiple values under one key.
 */

public class Main {

    public static void main(String[] args) {
        Storage studentStorage = new Storage();

        studentStorage.addStorage("RO45", "Andrei");
        studentStorage.addStorage("RO45", "Alex");
        studentStorage.addStorage("RO45", "Larisa");
        studentStorage.addStorage("RO45", "Dumitru");

        studentStorage.addStorage("RO46", "Dumitru");
        studentStorage.addStorage("RO46", "Bogdan");
        studentStorage.addStorage("RO46", "Oana");

        studentStorage.printValues("RO45");
        studentStorage.printValues("RO46");
        studentStorage.printValues("RO47");

        System.out.println(studentStorage.findKeys("Alex"));
        System.out.println(studentStorage.findKeys("Dumitru"));
        System.out.println(studentStorage.findKeysWithStreams("Bogdan"));
        System.out.println(studentStorage.findKeysWithStreams("Ion"));
    }
}
