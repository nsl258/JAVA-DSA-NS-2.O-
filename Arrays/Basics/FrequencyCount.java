public class FrequencyCount {
    public static int countFrequency(int[] arr, int key) {
        int count = 0;
        for (int num : arr) {
            if (num == key) count++;
        }
        return count;
    }
}