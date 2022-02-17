package g0801_0900.s0852_peak_index_in_a_mountain_array;

// #Easy #Array #Binary_Search

public class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return -1;
    }
}
