package g1601_1700.s1659_maximize_grid_happiness;

// #Hard #Dynamic_Programming #Bit_Manipulation #Bitmask #Memoization
// #2022_04_23_Time_95_ms_(75.00%)_Space_53.1_MB_(58.33%)

public class Solution {
    private int m;
    private int n;
    private int[][][][][] dp;
    private int notPlace = 0;
    private int intro = 1;
    private int extro = 2;
    private int mod;

    public int getMaxGridHappiness(int m, int n, int introvertsCount, int extrovertsCount) {
        this.m = m;
        this.n = n;
        int numOfState = (int) Math.pow(3, n);
        this.dp = new int[m][n][introvertsCount + 1][extrovertsCount + 1][numOfState];
        this.mod = numOfState / 3;
        return dfs(0, 0, introvertsCount, extrovertsCount, 0);
    }

    private int dfs(int x, int y, int ic, int ec, int state) {
        if (x == m) {
            return 0;
        } else if (y == n) {
            return dfs(x + 1, 0, ic, ec, state);
        }
        if (dp[x][y][ic][ec][state] != 0) {
            return dp[x][y][ic][ec][state];
        }
        // 1 - not place
        int max = dfs(x, y + 1, ic, ec, (state % mod) * 3);
        int up = state / mod;
        int left = state % 3;
        // 2 - place intro
        if (ic > 0) {
            int temp = 120;
            if (x > 0 && up != notPlace) {
                temp -= 30;
                temp += up == intro ? -30 : 20;
            }
            if (y > 0 && left != notPlace) {
                temp -= 30;
                temp += left == intro ? -30 : 20;
            }
            int nextState = state;
            nextState %= mod;
            nextState *= 3;
            nextState += intro;
            max = Math.max(max, temp + dfs(x, y + 1, ic - 1, ec, nextState));
        }
        // 3 - place extro
        if (ec > 0) {
            int temp = 40;
            if (x > 0 && up != notPlace) {
                temp += 20;
                temp += up == intro ? -30 : 20;
            }
            if (y > 0 && left != notPlace) {
                temp += 20;
                temp += left == intro ? -30 : 20;
            }
            int nextState = state;
            nextState %= mod;
            nextState *= 3;
            nextState += extro;
            max = Math.max(max, temp + dfs(x, y + 1, ic, ec - 1, nextState));
        }
        dp[x][y][ic][ec][state] = max;
        return max;
    }
}
