class Solution {
    public void rotate(int[] arr) {
        int n = arr.length;
        int last = arr[n - 1]; // correct last element

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1]; // shift elements right
        }

        arr[0] = last; // put last at first position
    }
}
