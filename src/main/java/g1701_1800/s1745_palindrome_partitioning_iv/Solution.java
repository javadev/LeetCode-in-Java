package g1701_1800.s1745_palindrome_partitioning_iv;

// #Hard #String #Dynamic_Programming #2022_04_29_Time_10_ms_(100.00%)_Space_44_MB_(95.27%)

public class Solution {
    public boolean checkPartitioning(String s) {
        final int len = s.length();
        char[] ch = s.toCharArray();
        int[] dp = new int[len + 1];
        dp[0] = 0x01;
        for (int i = 0; i < len; i++) {
            for (int l : new int[] {i - 1, i}) {
                int r = i;
                while (l >= 0 && r < len && ch[l] == ch[r]) {
                    dp[r + 1] |= dp[l] << 1;
                    l--;
                    r++;
                }
            }
        }
        return (dp[len] & 0x08) == 0x08;
    }
}
