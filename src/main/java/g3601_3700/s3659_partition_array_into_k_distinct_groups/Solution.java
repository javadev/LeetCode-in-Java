package g3601_3700.s3659_partition_array_into_k_distinct_groups;

// #Medium #Weekly_Contest_464 #2025_08_29_Time_2_ms_(100.00%)_Space_55.86_MB_(99.96%)

public class Solution {
    public boolean partitionArray(int[] nums, int k) {
        int n = nums.length;
        if (n % k != 0) {
            return false;
        }
        int max = 0;
        for (int x : nums) {
            max = Math.max(max, x);
        }
        int[] count = new int[max + 1];
        int limit = n / k;
        for (int x : nums) {
            if (++count[x] > limit) {
                return false;
            }
        }
        return true;
    }
}
