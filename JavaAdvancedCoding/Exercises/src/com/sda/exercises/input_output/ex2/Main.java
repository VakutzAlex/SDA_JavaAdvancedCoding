package com.sda.exercises.input_output.ex2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Write a program that will count the occurrences of each word in a text file and then save the results in the form of a table in a new file.
 * 1. Read all lines from file
 * 2. Split each line into words
 * 3. Create map with no of occurrences with each word
 * 4. Write result in a new file
 */

public class Main {

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("C:\\Users\\Alex\\Desktop\\SDA\\Git\\JavaAdvancedCoding\\Exercises\\resources\\ex2.txt");

        if (Files.isDirectory(filePath)) {
            System.out.println("Given path is not a file, it is a directory");
            return;
        }

        if (!Files.exists(filePath)) {
            System.out.println("File does not exist");
            return;
        }

        List<String> originalFileContent = Files.readAllLines(filePath);

        Map<String, Integer> occurrencesNumber = new HashMap<>();

        for (String line : originalFileContent) {
            for (String word : line.split(" ")) {
                if (occurrencesNumber.containsKey(word)) {
                    occurrencesNumber.put(word, occurrencesNumber.get(word) + 1);
                } else {
                    occurrencesNumber.put(word, 1);
                }
            }
        }

        System.out.println(occurrencesNumber);

        Path writePath = Paths.get("C:\\Users\\Alex\\Desktop\\SDA\\Git\\JavaAdvancedCoding\\Exercises\\resources\\ex2_result.txt");

        List<String> newFileContent = new ArrayList<>();

        newFileContent.add("         Word                Number of Occurrences");
        for (Map.Entry<String, Integer> entry : occurrencesNumber.entrySet()) {
            newFileContent.add(String.format("%1$30s" , entry.getKey() + "               " + entry.getValue()));
        }

        Files.write(writePath, newFileContent);
    }
}
