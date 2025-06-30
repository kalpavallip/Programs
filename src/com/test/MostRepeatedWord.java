package com.test;

import java.util.*;

public class MostRepeatedWord {

    public static void findMostRepeatedWord(String sentence) {
        // Convert to lowercase and remove punctuation
        sentence = sentence.toLowerCase().replaceAll("[^a-z\\s]", "");

        // Split sentence into words
        String[] words = sentence.split("\\s+");

        // Count word frequencies
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (word.isEmpty()) continue;
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Find most repeated word
        String mostRepeated = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostRepeated = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        // Print result
        System.out.println("Most repeated word: \"" + mostRepeated + "\" occurred " + maxCount + " times");
    }

    public static void main(String[] args) {
        String sentence = "Java is great. Java is powerful. Java is everywhere!";

        System.out.println("Input: " + sentence + "\n");
        findMostRepeatedWord(sentence);
    }
}
