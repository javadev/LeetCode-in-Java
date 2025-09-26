package g3601_3700.s3659_partition_array_into_k_distinct_groups;

// #Medium #Array #Hash_Table #Counting #Weekly_Contest_464
// #2025_09_26_Time_3_ms_(99.86%)_Space_56.50_MB_(99.38%)

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
