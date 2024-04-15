package g0801_0900.s0852_peak_index_in_a_mountain_array;

// #Medium #Array #Binary_Search #Binary_Search_I_Day_2
// #2022_03_28_Time_0_ms_(100.00%)_Space_46.1_MB_(68.36%)

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
