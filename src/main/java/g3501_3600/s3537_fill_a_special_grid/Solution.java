package g3501_3600.s3537_fill_a_special_grid;

// #Medium #Array #Matrix #Divide_and_Conquer
// #2025_05_06_Time_2_ms_(100.00%)_Space_87.14_MB_(16.42%)

public class Solution {
    public int[][] specialGrid(int n) {
        if (n == 0) {
            return new int[][] {{0}};
        }
        int len = (int) Math.pow(2, n);
        int[][] ans = new int[len][len];
        int[] num = new int[] {(int) Math.pow(2, 2D * n) - 1};
        backtrack(ans, len, len, 0, 0, num);
        return ans;
    }

    private void backtrack(int[][] ans, int m, int n, int x, int y, int[] num) {
        if (m == 2 && n == 2) {
            ans[x][y] = num[0];
            ans[x + 1][y] = num[0] - 1;
            ans[x + 1][y + 1] = num[0] - 2;
            ans[x][y + 1] = num[0] - 3;
            num[0] -= 4;
            return;
        }
        backtrack(ans, m / 2, n / 2, x, y, num);
        backtrack(ans, m / 2, n / 2, x + m / 2, y, num);
        backtrack(ans, m / 2, n / 2, x + m / 2, y + n / 2, num);
        backtrack(ans, m / 2, n / 2, x, y + n / 2, num);
    }
}
