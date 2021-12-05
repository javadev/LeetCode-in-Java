package g0201_0300.s0300_longest_increasing_subsequence_medium_top_100_liked_questions_top_interview_questions_array_dynamic_programming_binary_search;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length + 1];
        // prefill the dp table
        for (int i = 1; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        int left = 1;
        int right = 1;
        for (int curr : nums) {
            int start = left;
            int end = right;
            // binary search, find the one that is lower than curr
            while (start + 1 < end) {
                int mid = start + (end - start) / 2;
                if (dp[mid] > curr) {
                    end = mid;
                } else {
                    start = mid;
                }
            }
            // update our dp table
            if (dp[start] > curr) {
                dp[start] = curr;
            } else if (curr > dp[start] && curr < dp[end]) {
                dp[end] = curr;
            } else if (curr > dp[end]) {
                dp[++end] = curr;
                right++;
            }
        }
        return right;
    }
}
