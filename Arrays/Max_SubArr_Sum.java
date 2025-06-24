// Kadane's Algorithm

public class Max_SubArr_Sum {
    public static long maxSubarraySum(int[] arr, int n) {
        long maxSum = 0;
        long currentSum = 0;

        for (int i = 0; i < n; i++) {
            currentSum += arr[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum; // Always returns 0 or positive
    }
}