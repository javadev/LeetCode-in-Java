package g3401_3500.s3487_maximum_unique_subarray_sum_after_deletion;

// #Easy #Array #Hash_Table #Greedy #2025_03_17_Time_2_ms_(100.00%)_Space_42.64_MB_(100.00%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int maxSum(int[] nums) {
        int sum = 0;
        Set<Integer> st = new HashSet<>();
        int mxNeg = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > 0) {
                st.add(num);
            } else {
                mxNeg = Math.max(mxNeg, num);
            }
        }
        for (int val : st) {
            sum += val;
        }
        if (!st.isEmpty()) {
            return sum;
        } else {
            return mxNeg;
        }
    }
}
