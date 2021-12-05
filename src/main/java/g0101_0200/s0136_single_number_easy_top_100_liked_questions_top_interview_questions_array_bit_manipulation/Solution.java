package g0101_0200.s0136_single_number_easy_top_100_liked_questions_top_interview_questions_array_bit_manipulation;

public class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}
