package g0301_0400.s0395_longest_substring_with_at_least_k_repeating_characters;

// #Medium #String #Hash_Table #Sliding_Window #Divide_and_Conquer
// #2022_07_15_Time_0_ms_(100.00%)_Space_42.4_MB_(47.47%)

public class Solution {
    public int longestSubstring(String s, int k) {
        return helper(s, k, 0, s.length());
    }

    private int helper(String s, int k, int start, int end) {
        if (end - start < k) {
            return 0;
        }
        int[] nums = new int[26];
        for (int i = start; i < end; i++) {
            nums[s.charAt(i) - 'a']++;
        }
        for (int i = start; i < end; i++) {
            if (nums[s.charAt(i) - 'a'] < k) {
                int j = i + 1;
                while (j < s.length() && nums[s.charAt(j) - 'a'] < k) {
                    j++;
                }
                return Math.max(helper(s, k, start, i), helper(s, k, j, end));
            }
        }
        return end - start;
    }
}
