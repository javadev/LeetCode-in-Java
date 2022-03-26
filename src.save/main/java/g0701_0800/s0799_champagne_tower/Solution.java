package g0701_0800.s0799_champagne_tower;

// #Medium #Dynamic_Programming #2022_03_26_Time_4_ms_(92.45%)_Space_44.6_MB_(67.46%)

public class Solution {
    public double champagneTower(int poured, int queryRow, int queryGlass) {
        int curRow = 0;
        // first row
        double[] cur = new double[] {poured};
        // second row
        double[] next = new double[2];
        boolean spilled;
        do {
            spilled = false;
            for (int i = 0; i < cur.length; i++) {
                // spilling, put the excess into the next row.
                if (cur[i] > 1) {
                    double spilledAmount = cur[i] - 1;
                    cur[i] = 1;
                    next[i] += spilledAmount / 2;
                    next[i + 1] = spilledAmount / 2;
                    spilled = true;
                }
            }
            // got to the desired row, return the glass amount
            if (curRow == queryRow) {
                return cur[queryGlass];
            }
            cur = next;
            curRow++;
            next = new double[curRow + 2];
        } while (spilled);
        // spill did not happen to the desired row
        return 0;
    }
}
