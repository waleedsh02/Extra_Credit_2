package org.example;

public class RatioCalc {
    public static double calculateRatio(int[] array) { // this allows us to check if the array has four elements
        if (array == null || array.length < 4) {
            throw new IllegalArgumentException(" Array should have at least 4 elements to be executed ");
        }
            // these variables allows us carry values so far...
        int greatest1 = Integer.MIN_VALUE;  // this is the greatest number
        int greatest2 = Integer.MIN_VALUE; // this is the second greatest number
        int least1 = Integer.MAX_VALUE; // this is the least number
        int least2 = Integer.MAX_VALUE; //  this is the second least number

        for (int num : array) { //  this iterates each number  in a given array
            // Update greatest 1 and 2
            if (num > greatest1) {
                greatest2 = greatest1; //  last number now becomes the greatest
                greatest1 = num; // new largest number
            } else if (num > greatest2) {
                greatest2 = num;
            }

            // Updating least1 and least2
            if (num < least1) {
                least2 = least1; // last least number now becomes the second  least number
                least1 = num;
            } else if (num < least2) {
                least2 = num;
            }
        }


        int sumLargest = greatest1 + greatest2;
        int sumSmallest = least1 + least2;

        // Calculating the ratio
        double ratio = (double) sumLargest / sumSmallest;

        return ratio;
    }
}


