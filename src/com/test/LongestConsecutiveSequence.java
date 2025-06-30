package com.test;

import java.util.HashSet;

public class LongestConsecutiveSequence {
	

	    public static int longestConsecutive(int[] nums) {
	        if (nums.length == 0) return 0;

	        HashSet<Integer> numSet = new HashSet<>();
	        for (int num : nums) {
	            numSet.add(num);
	        }

	        int longestStreak = 0;

	        for (int num : numSet) {
	            // Check if it's the start of a sequence
	            if (!numSet.contains(num - 1)) {
	                int currentNum = num;
	                int currentStreak = 1;

	                while (numSet.contains(currentNum + 1)) {
	                    currentNum++;
	                    currentStreak++;
	                }

	                longestStreak = Math.max(longestStreak, currentStreak);
	            }
	        }

	        return longestStreak;
	    }

	    // Example usage
	    public static void main(String[] args) {
	        int[] arr = {100, 4, 200, 1, 3, 2};
	        System.out.println("Length of the longest consecutive sequence is: " + longestConsecutive(arr));
	    }
	}


	
	