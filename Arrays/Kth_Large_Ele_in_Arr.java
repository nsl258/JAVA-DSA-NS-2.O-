import java.util.*;

public class Kth_Large_Ele_in_Arr {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k)
                minHeap.poll(); // Remove smallest among top k
        }

        return minHeap.peek(); // kth largest element
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 5, 6, 4 };
        int k = 2;
        System.out.println(findKthLargest(nums, k)); // Output: 5
    }
}