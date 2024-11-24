package g3301_3400.s3364_minimum_positive_sum_subarray;

// #Easy #2024_11_24_Time_28_ms_(100.00%)_Space_44.7_MB_(100.00%)

import java.util.List;

public class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int size = nums.size();
        int res = -1;
        for (int s = l; s <= r; s++) {
            for (int i = 0; i <= size - s; i++) {
                int sum = 0;
                for (int j = i; j < i + s; j++) {
                    sum += nums.get(j);
                }
                if (sum > 0) {
                    if (res == -1 || res > sum) {
                        res = sum;
                    }
                }
            }
        }
        return res;
    }
}
