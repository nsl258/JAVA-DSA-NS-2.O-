class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int total_sum = n * (n + 1) / 2;

        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
        }
        return (total_sum - sum);
    }
}

// public class MissingNumberXOR {
// public static int findMissingNumber(int[] arr, int n) {
// int xor1 = 0; // XOR of 1 to n
// int xor2 = 0; // XOR of array elements

// for (int i = 1; i <= n; i++) {
// xor1 ^= i;
// }

// for (int num : arr) {
// xor2 ^= num;
// }

// return xor1 ^ xor2;
// }
// }