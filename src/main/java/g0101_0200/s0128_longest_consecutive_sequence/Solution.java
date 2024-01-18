package g0101_0200.s0128_longest_consecutive_sequence;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Hash_Table #Union_Find
// #Big_O_Time_O(N_log_N)_Space_O(1) #2022_06_23_Time_18_ms_(91.05%)_Space_64.8_MB_(63.58%)

import java.util.Arrays;

@SuppressWarnings("java:S135")
public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        int thsMax = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i] + 1) {
                thsMax += 1;
                continue;
            }
            if (nums[i + 1] == nums[i]) {
                continue;
            }
            // Start of a new Sequene
            max = Math.max(max, thsMax);
            thsMax = 1;
        }
        return Math.max(max, thsMax);
    }
}
