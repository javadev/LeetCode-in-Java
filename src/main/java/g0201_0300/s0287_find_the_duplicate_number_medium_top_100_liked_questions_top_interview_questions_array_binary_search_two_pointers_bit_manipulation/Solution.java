package g0201_0300.s0287_find_the_duplicate_number_medium_top_100_liked_questions_top_interview_questions_array_binary_search_two_pointers_bit_manipulation;

public class Solution {
    public int findDuplicate(int[] nums) {
        int[] arr = new int[nums.length + 1];
        for (int i = 0; i < nums.length; ++i) {
            arr[nums[i]] += 1;
            if (arr[nums[i]] == 2) {
                return nums[i];
            }
        }
        return 0;
    }
}
