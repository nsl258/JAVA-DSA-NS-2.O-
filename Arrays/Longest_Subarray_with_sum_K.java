// Only Positive

class Longest_Subarray_with_sum_K {
    public static int longestSubarrayWithSumK(int[] a, long k) {
        // Write your code here
        int right = 0;
        int left = 0;
        int sum = 0;
        int max_len = 0;
        int n = a.length;

        while (right < n) {
            sum = sum + a[right];

            while (sum > k) {
                sum = sum - a[left];
                left++;
            }
            if (sum == k) {
                max_len = Math.max(max_len, right - left + 1);
            }
            right++;
        }
        return max_len;
    }
}

/*
 * public class Solution {
 * public static int longestSubarrayWithSumK(int[] a, long k) {
 * int left = 0, right = 0;
 * long sum = 0;
 * int max_len = 0;
 * int n = a.length;
 * 
 * while (right < n) {
 * sum += a[right];
 * 
 * while (sum > k && left <= right) {
 * sum -= a[left];
 * left++;
 * }
 * 
 * if (sum == k) {
 * max_len = Math.max(max_len, right - left + 1);
 * }
 * 
 * right++;
 * }
 * 
 * return max_len;
 * }
 * }
 */