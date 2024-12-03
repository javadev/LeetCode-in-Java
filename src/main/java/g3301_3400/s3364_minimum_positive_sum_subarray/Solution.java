package g3301_3400.s3364_minimum_positive_sum_subarray;

// #Easy #Array #Prefix_Sum #Sliding_Window #2024_12_03_Time_1_ms_(100.00%)_Space_44.5_MB_(38.75%)

import java.util.List;

public class Solution {
    public int minimumSumSubarray(List<Integer> li, int l, int r) {
        int n = li.size();
        int min = Integer.MAX_VALUE;
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = a[i - 1] + li.get(i - 1);
        }
        for (int size = l; size <= r; size++) {
            for (int i = size - 1; i < n; i++) {
                int sum = a[i + 1] - a[i + 1 - size];
                if (sum > 0) {
                    min = Math.min(min, sum);
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
