package g0801_0900.s0873_length_of_longest_fibonacci_subsequence;

// #Medium #Array #Hash_Table #Dynamic_Programming

public class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        if (arr == null || arr.length < 3) {
            return 0;
        }
        int len = arr.length;
        int[][] dp = new int[len][len];
        int ans = 0;
        for (int i = 2; i < len; i++) {
            int left = 0;
            int right = i - 1;
            while (left < right) {
                if (arr[left] + arr[right] < arr[i]) {
                    left++;
                } else if (arr[left] + arr[right] > arr[i]) {
                    right--;
                } else {
                    // dp[right][i] = Math.max(dp[right][i], dp[left][right] + 1);
                    dp[right][i] = dp[left][right] + 1;
                    ans = Math.max(ans, dp[right][i]);
                    left++;
                    right--;
                }
            }
        }
        return ans > 0 ? ans + 2 : 0;
    }
}
