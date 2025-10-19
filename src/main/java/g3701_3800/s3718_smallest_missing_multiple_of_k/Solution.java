package g3701_3800.s3718_smallest_missing_multiple_of_k;

// #Easy #Weekly_Contest_472 #2025_10_19_Time_3_ms_(_%)_Space_43.23_MB_(_%)

import java.util.Arrays;

public class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int x = k;
        for (int i : nums) {
            if (i == x) {
                x += k;
            }
        }
        return x;
    }
}
