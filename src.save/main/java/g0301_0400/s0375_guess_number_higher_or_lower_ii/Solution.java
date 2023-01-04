package g0301_0400.s0375_guess_number_higher_or_lower_ii;

// #Medium #Dynamic_Programming #Math #Game_Theory
// #2022_07_12_Time_2_ms_(100.00%)_Space_41.2_MB_(94.15%)

@SuppressWarnings("java:S135")
public class Solution {
    int[][] matrix;

    public int getMoneyAmount(int n) {
        matrix = new int[n + 1][n + 1];
        return get(1, n);
    }

    private int get(int min, int max) {
        if (max - min < 3) {
            return max - min <= 0 ? 0 : max - 1;
        }
        if (matrix[min][max] != 0) {
            return matrix[min][max];
        }
        int select = max - 3;
        int minRes = Integer.MAX_VALUE;
        int res;
        int end = min + ((max - min) >> 1) - 1;
        int cnt = 0;
        while (true) {
            res = select + Math.max(get(min, select - 1), get(select + 1, max));
            if (res > minRes) {
                cnt++;
                if (cnt >= 3) {
                    break;
                }
            }
            if (res < minRes) {
                minRes = res;
            }
            select--;
            if (select <= end) {
                break;
            }
        }
        matrix[min][max] = minRes;
        return minRes;
    }
}
