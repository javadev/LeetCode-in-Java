package g2301_2400.s2311_longest_binary_subsequence_less_than_or_equal_to_k;

// #Medium #String #Dynamic_Programming #Greedy #Memoization
// #2022_06_20_Time_1_ms_(100.00%)_Space_42.3_MB_(50.00%)

public class Solution {
    public int longestSubsequence(String s, int k) {
        int res = 0;
        int cost = 1;
        int n = s.length();
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '0' || cost <= k) {
                k -= cost * (s.charAt(i) - '0');
                ++res;
            }
            if (cost <= k) {
                cost *= 2;
            }
        }
        return res;
    }
}
