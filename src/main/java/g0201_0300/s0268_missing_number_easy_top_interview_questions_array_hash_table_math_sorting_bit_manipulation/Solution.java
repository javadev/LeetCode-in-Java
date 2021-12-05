package g0201_0300.s0268_missing_number_easy_top_interview_questions_array_hash_table_math_sorting_bit_manipulation;

public class Solution {
    public int missingNumber(int[] nums) {
        int a = nums.length;
        for (int i = 0; i < nums.length; i++) {
            a ^= i;
            a ^= nums[i];
        }
        return a;
    }
}
