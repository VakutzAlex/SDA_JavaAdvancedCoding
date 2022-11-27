package com.sda.exercises.input_output.ex1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a program that will read any file and save it in the same folder.
 * The content and title of the new file should be reversed (from the back).
 */

public class Main {

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("C:\\Users\\Alex\\Desktop\\SDA\\Git\\JavaAdvancedCoding\\Exercises\\resources\\ex1.txt");

        if (Files.isDirectory(filePath)) {
            System.err.println("Given path is not a file, it is a directory");
        } else {
            List<String> result = Files.readAllLines(filePath);

            // System.out.println(result);

            List<String> reversedStringList = result.stream().map(s -> revString(s)).collect(Collectors.toList());

            List<String> finalList = new ArrayList<>();

            for (int i = reversedStringList.size() - 1; i >= 0; i--) {
                finalList.add(reversedStringList.get(i));
            }

            String newFileName = revStringChars(filePath.getFileName().toString());
            Path baseDirectory = filePath.getParent();
            Path newFilePath = baseDirectory.resolve(newFileName);
            Files.createFile(newFilePath);

            Files.write(newFilePath, finalList);

        }
    }

    public static String revString(String str) {
        String newString = "";
        String strSplit[] = str.split(" ");

        for (int i = strSplit.length - 1; i >= 0; i--) {
            newString = newString + strSplit[i] + " ";
        }

        return newString;
    }

    public static String revStringChars(String str) {
        String newString = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            newString = newString + str.charAt(i);
        }

        return newString;
    }
}
