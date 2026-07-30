package g3801_3900.s3858_minimum_bitwise_or_from_grid;

// #Medium #Array #Greedy #Matrix #Bit_Manipulation #Staff #Weekly_Contest_491
// #2026_07_27_Time_4_ms_(81.16%)_Space_136.60_MB_(59.42%)

public class Solution {
    public int minimumOR(int[][] grid) {
        int res = 0;
        for (int bi = 20; bi >= 0; --bi) {
            int b = 1 << bi;
            int mask = res | (b - 1);
            for (int[] r : grid) {
                boolean rowAllBad = true;
                for (int a : r) {
                    if ((a & mask) == a) {
                        rowAllBad = false;
                        break;
                    }
                }
                if (rowAllBad) {
                    res |= b;
                    break;
                }
            }
        }
        return res;
    }
}
