package g2801_2900.s2801_count_stepping_numbers_in_range;

// #Hard #String #Dynamic_Programming #2023_09_25_Time_22_ms_(74.37%)_Space_44.5_MB_(24.69%)

public class Solution {
    private static final int MOD = (int) (1e9 + 7);
    private Integer[][][][] dp;

    public int countSteppingNumbers(String low, String high) {
        dp = new Integer[low.length() + 1][10][2][2];
        int count1 = solve(low, 0, 0, 1, 1);
        dp = new Integer[high.length() + 1][10][2][2];
        int count2 = solve(high, 0, 0, 1, 1);
        return (count2 - count1 + isStep(low) + MOD) % MOD;
    }

    private int solve(String s, int i, int prevDigit, int hasBound, int curIsZero) {
        if (i >= s.length()) {
            if (curIsZero == 1) {
                return 0;
            }
            return 1;
        }
        if (dp[i][prevDigit][hasBound][curIsZero] != null) {
            return dp[i][prevDigit][hasBound][curIsZero];
        }
        int count = 0;
        int limit = 9;
        if (hasBound == 1) {
            limit = s.charAt(i) - '0';
        }
        for (int digit = 0; digit <= limit; digit++) {
            int nextIsZero = (curIsZero == 1 && digit == 0) ? 1 : 0;
            int nextHasBound = (hasBound == 1 && digit == limit) ? 1 : 0;
            if (curIsZero == 1 || Math.abs(digit - prevDigit) == 1) {
                count = (count + solve(s, i + 1, digit, nextHasBound, nextIsZero)) % MOD;
            }
        }
        dp[i][prevDigit][hasBound][curIsZero] = count;
        return dp[i][prevDigit][hasBound][curIsZero];
    }

    private int isStep(String s) {
        boolean isValid = true;
        for (int i = 0; i < s.length() - 1; i++) {
            if (Math.abs(s.charAt(i + 1) - s.charAt(i)) != 1) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            return 1;
        }
        return 0;
    }
}
