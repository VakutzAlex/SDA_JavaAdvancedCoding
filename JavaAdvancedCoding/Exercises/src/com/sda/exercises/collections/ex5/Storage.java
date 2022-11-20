package com.sda.exercises.collections.ex5;

/*
Create a Storage class that will have a private Map field, a public constructor, and methods:
addToStorage(String key, String value) → adding elements to the storage
printValues(String key) → displaying all elements under a given key
findKeys(String value) → displaying all keys that have a given value
The Storage class should allow you to store multiple values under one key.
 */

import java.util.*;
import java.util.stream.Collectors;

public class Storage {

    private Map<String, List<String>> storageMap = new HashMap<>();

    public void addStorage(String key, String value) {
        if (storageMap.containsKey(key)) {
            List<String> stringList = storageMap.get(key);
            stringList.add(value);
            storageMap.put(key, stringList);
        } else {
            List<String> stringList = new ArrayList<>();
            stringList.add(value);
            storageMap.put(key, stringList);
        }
    }

    public void printValues(String key) {
        List<String> values = storageMap.get(key);

        if (values == null) {
            System.out.println("No values for key: " + key);
        } else {
            System.out.println("Values for key: " + key + " -> " + values);
        }
    }

    public Set<String> findKeys(String value) {
        Set<String> stringKey = new HashSet<>();

        for (Map.Entry<String, List<String>> entry : storageMap.entrySet()) {
            if (entry.getValue().contains(value)) {
                stringKey.add(entry.getKey());
            }
        }
        return stringKey;
    }

    public Set<String> findKeysWithStreams(String value) {
        return storageMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue().contains(value))
                .map(entry -> entry.getKey())
                .collect(Collectors.toSet());
    }
}
