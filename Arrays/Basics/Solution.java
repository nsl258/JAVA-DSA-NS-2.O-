public class Solution {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        // if(arr.length == 0) return;

        int first_ele = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first_ele;
        return arr;
    }
}