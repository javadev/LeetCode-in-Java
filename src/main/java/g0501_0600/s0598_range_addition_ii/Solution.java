package g0501_0600.s0598_range_addition_ii;

// #Easy #Array #Math

public class Solution {
    /*
     * Since the incrementing starts from zero to op[0] and op[1], we only need to find the range that has the most overlaps.
     * Thus we keep finding the minimum of both x and y.
     */
    public int maxCount(int m, int n, int[][] ops) {
        int x = m;
        int y = n;
        for (int[] op : ops) {
            x = Math.min(x, op[0]);
            y = Math.min(y, op[1]);
        }
        return x * y;
    }
}
