package g3601_3700.s3644_maximum_k_to_sort_a_permutation;

// #Medium #Array #Bit_Manipulation #Weekly_Contest_462
// #2025_09_27_Time_1_ms_(100.00%)_Space_62.64_MB_(34.63%)

public class Solution {
    public int sortPermutation(int[] nums) {
        int n = nums.length;
        int res = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == i) {
                continue;
            }
            if (res == -1) {
                res = nums[i];
            } else {
                res &= nums[i];
            }
        }
        if (res == -1) {
            return 0;
        }
        return res;
    }
}
