package g1401_1500.s1473_paint_house_iii;

// #Hard #Array #Dynamic_Programming #2022_03_29_Time_26_ms_(89.13%)_Space_42.9_MB_(91.75%)

public class Solution {
    private int[][][] memo;
    private int[] houses;
    private int nColors;
    private int[][] cost;

    public int minCost(int[] houses, int[][] cost, int nColors, int tGroups) {
        this.cost = cost;
        this.houses = houses;
        this.memo = new int[houses.length][nColors + 1][tGroups + 1];
        this.nColors = nColors;

        int dp = dp(0, 0, tGroups);
        return dp == Integer.MAX_VALUE ? -1 : dp;
    }

    private int dp(int ithEl, int prevClr, int tGroups) {
        if (ithEl == houses.length) {
            return tGroups == 0 ? 0 : Integer.MAX_VALUE;
        }
        if (ithEl < houses.length && tGroups < 0) {
            return Integer.MAX_VALUE;
        }
        if (memo[ithEl][prevClr][tGroups] == 0) {
            int currC = houses[ithEl];
            int res = Integer.MAX_VALUE;
            if (currC != 0) {
                int grpLeft = currC == prevClr ? tGroups : tGroups - 1;
                res = dp(ithEl + 1, currC, grpLeft);
            } else {
                for (int clr = 1; clr <= nColors; clr++) {
                    int grpLeft = clr == prevClr ? tGroups : tGroups - 1;
                    int dp = dp(ithEl + 1, clr, grpLeft);
                    res =
                            Math.min(
                                    res,
                                    dp != Integer.MAX_VALUE
                                            ? cost[ithEl][clr - 1] + dp
                                            : Integer.MAX_VALUE);
                }
            }
            memo[ithEl][prevClr][tGroups] = res;
        }
        return memo[ithEl][prevClr][tGroups];
    }
}
