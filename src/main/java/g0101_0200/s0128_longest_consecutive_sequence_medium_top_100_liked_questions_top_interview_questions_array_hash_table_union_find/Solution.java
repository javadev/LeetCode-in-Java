package g0101_0200.s0128_longest_consecutive_sequence_medium_top_100_liked_questions_top_interview_questions_array_hash_table_union_find;

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
