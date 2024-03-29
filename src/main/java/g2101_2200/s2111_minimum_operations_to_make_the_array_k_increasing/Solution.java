package g2101_2200.s2111_minimum_operations_to_make_the_array_k_increasing;

// #Hard #Array #Binary_Search #2024_03_29_Time_12_ms_(100.00%)_Space_60.7_MB_(31.91%)

import java.util.Arrays;

public class Solution {
    public int kIncreasing(int[] arr, int k) {
        int n = arr.length;
        int res = 0;
        int[] dp = new int[n / k + 5];
        for (int i = 0; i < k; i++) {
            int lis = 0;
            Arrays.fill(dp, 0);
            for (int j = i; j < n; j += k) {
                int low = 0;
                int high = lis;
                while (low < high) {
                    int mid = (low + high) >> 1;
                    if (arr[j] < dp[mid]) {
                        high = mid;
                    } else {
                        low = mid + 1;
                    }
                }
                dp[low] = arr[j];
                if (high == lis) {
                    lis++;
                }
            }
            res += lis;
        }
        return n - res;
    }
}
