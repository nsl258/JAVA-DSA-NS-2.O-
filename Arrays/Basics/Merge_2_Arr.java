class Solution {
    public int[] mergeArrays(int a[], int b[]) {
        int n1 = a.length;
        int n2 = b.length;
        int merged[] = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            merged[i] = a[i];
        }
        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = b[i];
        }

        return merged;
    }
}
