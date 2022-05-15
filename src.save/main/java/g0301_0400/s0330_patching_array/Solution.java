package g0301_0400.s0330_patching_array;

// #Hard #Array #Greedy #Acceptance_39.5% #2022_03_15_Time_0_ms_(100.00%)_Space_44.1_MB_(38.52%)

public class Solution {
    public int minPatches(int[] nums, int n) {
        int res = 0;
        long sum = 0;
        int i = 0;
        while (sum < n) {
            // required number
            long req = sum + 1;
            if (i < nums.length && nums[i] <= req) {
                sum += nums[i++];
            } else {
                sum += req;
                res++;
            }
        }
        return res;
    }
}
