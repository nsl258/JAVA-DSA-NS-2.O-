class Solution {
    public int SecondLargest(int[] arr) {
        // code here
        int sec_largest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                sec_largest = largest;
                largest = arr[i];
            } else if (arr[i] > sec_largest && arr[i] != largest) {
                sec_largest = arr[i];
            }
        }
        return (sec_largest == Integer.MIN_VALUE) ? -1 : sec_largest;
    }
}