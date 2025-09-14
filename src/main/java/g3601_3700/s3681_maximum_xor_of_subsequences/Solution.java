package g3601_3700.s3681_maximum_xor_of_subsequences;

// #Hard #Biweekly_Contest_165 #2025_09_14_Time_29_ms_(100.00%)_Space_58.02_MB_(100.00%)

public class Solution {
    public int maxXorSubsequences(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int x = 0;
        while (true) {
            int y = 0;
            for (int v : nums) {
                if (v > y) {
                    y = v;
                }
            }
            if (y == 0) {
                return x;
            }
            x = Math.max(x, x ^ y);
            for (int i = 0; i < n; i++) {
                int v = nums[i];
                nums[i] = Math.min(v, v ^ y);
            }
        }
    }
}
