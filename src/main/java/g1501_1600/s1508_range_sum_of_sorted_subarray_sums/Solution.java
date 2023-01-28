package g1501_1600.s1508_range_sum_of_sorted_subarray_sums;

// #Medium #Array #Sorting #Binary_Search #Two_Pointers #Binary_Search_II_Day_14
// #2022_04_09_Time_60_ms_(93.84%)_Space_47.8_MB_(87.32%)

import java.util.Arrays;

public class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int len = n * (n + 1) / 2;
        int[] arr = new int[len];
        int idx = 0;
        int prev = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                arr[idx] = prev + nums[j];
                prev = arr[idx];
                idx++;
            }
            prev = 0;
        }
        Arrays.sort(arr);
        int result = 0;
        int mod = 1000000007;
        for (int i = left - 1; i < right; i++) {
            result = (result + arr[i]) % mod;
        }
        return result;
    }
}
