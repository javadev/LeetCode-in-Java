package g0201_0300.s0300_longest_increasing_subsequence;

// #Medium #Top_100_Liked_Questions #Array #Dynamic_Programming #Binary_Search
// #Algorithm_II_Day_16_Dynamic_Programming #Binary_Search_II_Day_3 #Dynamic_Programming_I_Day_18
// #Udemy_Dynamic_Programming #Big_O_Time_O(n*log_n)_Space_O(n)
// #2022_07_06_Time_3_ms_(98.63%)_Space_44.3_MB_(60.27%)

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
