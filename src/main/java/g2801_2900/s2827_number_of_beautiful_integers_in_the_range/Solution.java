package g2801_2900.s2827_number_of_beautiful_integers_in_the_range;

// #Hard #Dynamic_Programming #Math #2023_12_11_Time_7_ms_(96.77%)_Space_43.4_MB_(67.74%)

import java.util.Arrays;

@SuppressWarnings("java:S107")
public class Solution {
    private int[][][][][] dp;
    private int maxLength;

    public int numberOfBeautifulIntegers(int low, int high, int k) {
        String num1 = String.valueOf(low);
        String num2 = String.valueOf(high);
        maxLength = Math.max(num1.length(), num2.length());
        dp = new int[4][maxLength][maxLength][maxLength][k];
        for (int[][][][] a : dp) {
            for (int[][][] b : a) {
                for (int[][] c : b) {
                    for (int[] d : c) {
                        Arrays.fill(d, -1);
                    }
                }
            }
        }
        return dp(num1, num2, 0, 3, 0, 0, 0, 0, k);
    }

    private int dp(
            String low, String high, int i, int mode, int odd, int even, int num, int rem, int k) {
        if (i == maxLength) {
            return num % k == 0 && odd == even ? 1 : 0;
        }
        if (dp[mode][i][odd][even][rem] != -1) {
            return dp[mode][i][odd][even][rem];
        }
        int res = 0;
        boolean lowLimit = mode % 2 == 1;
        boolean highLimit = mode / 2 == 1;
        int start = 0;
        int end = 9;
        if (lowLimit) {
            start = digitAt(low, i);
        }
        if (highLimit) {
            end = digitAt(high, i);
        }
        for (int j = start; j <= end; j++) {
            int newMode = 0;
            if (j == start && lowLimit) {
                newMode += 1;
            }
            if (j == end && highLimit) {
                newMode += 2;
            }
            int newEven = even;
            if (num != 0 || j != 0) {
                newEven += j % 2 == 0 ? 1 : 0;
            }
            int newOdd = odd + (j % 2 == 1 ? 1 : 0);
            res +=
                    dp(
                            low,
                            high,
                            i + 1,
                            newMode,
                            newOdd,
                            newEven,
                            num * 10 + j,
                            (num * 10 + j) % k,
                            k);
        }
        dp[mode][i][odd][even][rem] = res;
        return res;
    }

    private int digitAt(String num, int i) {
        int index = num.length() - maxLength + i;
        return index < 0 ? 0 : num.charAt(index) - '0';
    }
}
