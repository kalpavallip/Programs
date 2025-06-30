package com.test;

public class ReverseWords {

    public static String reverseWords(String s) {
        // Trim leading/trailing spaces and split by one or more spaces using regex
        String[] words = s.trim().split("\\s+");

        StringBuilder reversed = new StringBuilder();

        // Reverse loop to append words
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "  the sky   is blue  ";
        String output = reverseWords(input);

        System.out.println("Original: \"" + input + "\"");
        System.out.println("Reversed: \"" + output + "\"");
    }
}
