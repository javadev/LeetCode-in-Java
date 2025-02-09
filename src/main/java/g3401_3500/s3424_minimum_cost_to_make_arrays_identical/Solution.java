package g3401_3500.s3424_minimum_cost_to_make_arrays_identical;

// #Medium #Array #Sorting #Greedy #2025_01_23_Time_20_ms_(98.92%)_Space_57.80_MB_(28.30%)

import java.util.Arrays;

public class Solution {
    public long minCost(int[] arr, int[] brr, long k) {
        int n = arr.length;
        long sum1 = 0;
        long sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += Math.abs(arr[i] - brr[i]);
        }
        if (k < sum1) {
            Arrays.sort(arr);
            Arrays.sort(brr);
            sum2 = k;
            for (int i = 0; i < n; i++) {
                sum2 += Math.abs(arr[i] - brr[i]);
            }
        } else {
            return sum1;
        }
        return Math.min(sum1, sum2);
    }
}
