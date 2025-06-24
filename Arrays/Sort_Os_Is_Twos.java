class Solution {
    public void sortColors(int[] nums) {
        int c0 = 0, c1 = 0, c2 = 0;

        // Count number of 0s, 1s, and 2s
        for (int num : nums) {
            if (num == 0) c0++;
            else if (num == 1) c1++;
            else c2++;
        }

        // Overwrite the array
        int i = 0;
        while (c0-- > 0) nums[i++] = 0;
        while (c1-- > 0) nums[i++] = 1;
        while (c2-- > 0) nums[i++] = 2;
    }
}