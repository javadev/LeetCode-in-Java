package g3701_3800.s3718_smallest_missing_multiple_of_k;

// #Easy #Array #Hash_Table #Weekly_Contest_472
// #2025_10_22_Time_0_ms_(100.00%)_Space_42.84_MB_(99.24%)

public class Solution {
    public int missingMultiple(int[] nums, int k) {
        for (int i = 1; ; i++) {
            int curr = i * k;
            int j;
            for (j = 0; j < nums.length; j++) {
                if (nums[j] == curr) {
                    break;
                }
            }
            if (j == nums.length) {
                return curr;
            }
        }
    }
}
