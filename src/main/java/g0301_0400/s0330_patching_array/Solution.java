package g0301_0400.s0330_patching_array;

// #Hard #Array #Greedy #2022_07_09_Time_1_ms_(60.00%)_Space_44.3_MB_(27.06%)

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
