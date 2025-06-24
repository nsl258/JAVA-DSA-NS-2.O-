import java.util.ArrayList;
import java.util.List;

public class Major_Ele_n_By_3 {
    public List<Integer> majorityElement(int[] nums) {

        int count_1 = 0;
        int count_2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (count_1 == 0 && nums[i] != ele2) {
                count_1 = 1;
                ele1 = nums[i];
            } else if (count_2 == 0 && nums[i] != ele1) {
                count_2 = 1;
                ele2 = nums[i];
            } else if (ele1 == nums[i]) {
                count_1++;
            } else if (ele2 == nums[i]) {
                count_2++;
            } else {
                count_1--;
                count_2--;
            }
        }
        // Check max(ele1, ele2)

        int freq1 = 0;
        int freq2 = 0;

        for (int i : nums) {
            if (i == ele1)
                freq1++;
            if (i == ele2)
                freq2++;
        }
        List<Integer> res = new ArrayList<>();
        if (freq1 > nums.length / 3)
            res.add(ele1);
        if (freq2 > nums.length / 3)
            res.add(ele2);

        return res;
    }
}