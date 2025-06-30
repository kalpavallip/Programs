package com.test;

import java.io.*;
import java.util.*;

public class MostRepeatedWordFromFile {

    public static void findMostRepeatedWord(String filename) {
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = br.readLine()) != null) {
                // Normalize line: lowercase and remove punctuation except spaces
                line = line.toLowerCase().replaceAll("[^a-z\\s]", "");

                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (word.isEmpty()) continue;
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return;
        }

        // Find the most repeated word
        String mostRepeated = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostRepeated = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        if (mostRepeated.isEmpty()) {
            System.out.println("No words found in the file.");
        } else {
            System.out.println("Most repeated word: \"" + mostRepeated + "\" occurred " + maxCount + " times");
        }
    }

    public static void main(String[] args) {
        // Replace "input.txt" with your filename or pass as argument
        String filename = "C:\\Users\\anilk\\Desktop\\ramji2 interview questions.txt";

        findMostRepeatedWord(filename);
    }
}
