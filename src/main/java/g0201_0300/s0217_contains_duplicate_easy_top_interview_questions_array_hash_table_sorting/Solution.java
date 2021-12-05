package g0201_0300.s0217_contains_duplicate_easy_top_interview_questions_array_hash_table_sorting;

import java.util.Arrays;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
