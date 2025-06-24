public class Left_Rotate_D_Place {
    public static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // To handle cases where d >= n

        reverse(arr, 0, d - 1); // Reverse first d elements
        reverse(arr, d, n - 1); // Reverse the remaining elements
        reverse(arr, 0, n - 1); // Reverse the whole array
    }

    // Utility function to reverse a portion of the array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}