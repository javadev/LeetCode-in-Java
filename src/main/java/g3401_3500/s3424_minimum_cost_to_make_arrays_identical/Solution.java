package g3401_3500.s3424_minimum_cost_to_make_arrays_identical;

// #Medium #Array #Sorting #Greedy #2025_01_22_Time_60_(98.08%)_Space_57.68_(39.04%)

import java.util.Arrays;

public class Solution {
    public long minCost(int[] arr, int[] brr, long k) {
        long res1 = 0;
        long res2 = 0;
        for (int i = 0; i < arr.length; ++i) {
            res1 += Math.abs(arr[i] - brr[i]);
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
        for (int i = 0; i < arr.length; ++i) {
            res2 += Math.abs(arr[i] - brr[i]);
        }
        return Math.min(res1, res2 + k);
    }
}
