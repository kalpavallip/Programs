package com.test;

import java.util.Arrays;

public class MoveZerosToEnd {

    public static void moveZeros(int[] nums) {
        int insertPos = 0;  // position to insert the next non-zero

        // Move non-zero elements forward
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        // Fill remaining positions with zeros
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        System.out.println("Original array: " + Arrays.toString(arr));

        moveZeros(arr);

        System.out.println("After moving zeros: " + Arrays.toString(arr));
    }
}
