import java.util.*;

public class Three_Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            // Skip duplicate a's
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int a = nums[i];
            int left = i + 1, right = n - 1;

            while (left < right) {
                int b = nums[left], c = nums[right];
                int sum = a + b + c;

                if (sum == 0) {
                    res.add(Arrays.asList(a, b, c));
                    left++;
                    right--;

                    // Skip duplicate b's and c's
                    while (left < right && nums[left] == nums[left - 1])
                        left++;
                    while (left < right && nums[right] == nums[right + 1])
                        right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> result = threeSum(nums);
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}