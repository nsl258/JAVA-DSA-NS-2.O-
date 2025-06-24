import java.util.*;

public class Peak_Ele {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (nums[mid] > nums[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}

// OR in ArrayList

public static int findPeakElement(ArrayList<Integer> arr) {
    // Write your code here.
    int low = 0;
    int high = arr.size() - 1;

    while (low < high) {
        int mid = (low + high) / 2;

        if (arr.get(mid) > arr.get(mid + 1)) {
            high = mid;
        } else {
            low = mid + 1;
        }
    }
    return low;
}