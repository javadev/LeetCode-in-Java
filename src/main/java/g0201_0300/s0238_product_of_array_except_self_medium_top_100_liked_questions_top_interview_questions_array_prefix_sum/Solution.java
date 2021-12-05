package g0201_0300.s0238_product_of_array_except_self_medium_top_100_liked_questions_top_interview_questions_array_prefix_sum;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            product = product * nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                ans[i] = product / nums[i];
            } else {
                int p = 1;
                for (int j = 0; j < nums.length; j++) {
                    if (j != i) {
                        p = p * nums[j];
                    }
                }
                ans[i] = p;
            }
        }
        return ans;
    }
}
