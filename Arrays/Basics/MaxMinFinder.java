class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return new Pair<>(min, max); // or (max, min) based on your requirement
    }
}

/*
 * 
 * 
 * 
 * public class MaxMinFinder {
 * public static void main(String[] args) {
 * int[] arr = { 5, 2, 8, 1, 9, 3 };
 * 
 * int max = arr[0];
 * int min = arr[0];
 * 
 * for (int i = 1; i < arr.length; i++) {
 * if (arr[i] > max) {
 * max = arr[i];
 * }
 * if (arr[i] < min) {
 * min = arr[i];
 * }
 * }
 * 
 * System.out.println("Maximum element: " + max);
 * System.out.println("Minimum element: " + min);
 * }
 * }
 */