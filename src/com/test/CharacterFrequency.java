package com.test;

import java.util.*;

public class CharacterFrequency {

    public static void analyzeString(String input) {
        // Use a LinkedHashMap to preserve insertion order (optional)
        Map<Character, Integer> freqMap = new HashMap<>();

        // Count frequency of each character (ignore spaces if needed)
        for (char c : input.toCharArray()) {
            if (c == ' ') continue; // skip spaces
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Find the most repeated character
        char mostRepeatedChar = '\0';
        int maxFreq = 0;
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                mostRepeatedChar = entry.getKey();
                maxFreq = entry.getValue();
            }
        }

        // Sort characters by frequency (descending)
        List<Map.Entry<Character, Integer>> sortedEntries = new ArrayList<>(freqMap.entrySet());
        sortedEntries.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Print results
        System.out.println("Most repeated character: '" + mostRepeatedChar + "' occurred " + maxFreq + " times\n");

        System.out.println("Character frequencies (descending order):");
        for (Map.Entry<Character, Integer> entry : sortedEntries) {
            System.out.println("'" + entry.getKey() + "' -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String input = "programming language";

        System.out.println("Input: \"" + input + "\"\n");
        analyzeString(input);
    }
}
