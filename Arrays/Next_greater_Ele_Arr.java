import java.util.*;

public class Next_greater_Ele_Arr {
    public static int[] nextGreaterElement(int[] arr, int n) {
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            // Remove all elements smaller than or equal to current
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If stack is empty, no greater element to the right
            result[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push current element to stack
            stack.push(arr[i]);
        }

        return result;
    }

}

// OR

public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    Map<Integer, Integer> nge = new HashMap<>();
    Stack<Integer> st = new Stack<>();

    for (int num : nums2) {
        while (!st.isEmpty() && st.peek() < num) {
            nge.put(st.pop(), num);
        }
        st.push(num);
    }

    while (!st.isEmpty()) {
        nge.put(st.pop(), -1);
    }

    int[] res = new int[nums1.length];
    for (int i = 0; i < nums1.length; i++) {
        res[i] = nge.get(nums1[i]);
    }

    return res;
}