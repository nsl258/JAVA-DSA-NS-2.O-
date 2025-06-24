class Solution {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return n;
        }
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }
}