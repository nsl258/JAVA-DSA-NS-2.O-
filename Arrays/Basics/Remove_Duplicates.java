class Solution {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return n;
        }
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }
}

/*
 * class Solution {
 * // Function to remove duplicates from the given array
 * public int removeDuplicates(int[] arr) {
 * 
 * Set<Integer> set = new LinkedHashSet<>();
 * 
 * for (int num : arr) {
 * set.add(num); // Add unique elements
 * }
 * 
 * int i = 0;
 * for (int num : set) {
 * arr[i++] = num; // Update original array with unique elements
 * }
 * 
 * return set.size();
 * }
 * }
 * 
 */