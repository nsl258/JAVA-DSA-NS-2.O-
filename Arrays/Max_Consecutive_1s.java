public class Max_Consecutive_1s {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curr_Count = 0;
        int max_Count = 0;
        for (int i : nums) {
            if (i == 1) {
                curr_Count++;
                max_Count = Math.max(max_Count, curr_Count);
            } else {
                curr_Count = 0;
            }
        }
        return max_Count;
    }
}