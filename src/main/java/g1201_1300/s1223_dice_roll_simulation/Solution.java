package g1201_1300.s1223_dice_roll_simulation;

// #Hard #Array #Dynamic_Programming #2022_03_12_Time_9_ms_(90.98%)_Space_41.1_MB_(86.47%)

public class Solution {
    private static final long MOD = 1000000007;

    public int dieSimulator(int n, int[] rollMax) {
        long[][] all = new long[6][15 + 1];
        long[] countsBySide = new long[6];
        long total = 0;
        long newTotal;
        int max;
        for (int j = 0; j < all.length; j++) {
            all[j][1] = 1;
            countsBySide[j] = 1;

            total = 6;
        }
        for (int i = 1; i < n; i++) {
            newTotal = total;
            for (int j = 0; j < all.length; j++) {
                all[j][0] = (total - countsBySide[j]) % MOD;
                max = rollMax[j];
                newTotal = (newTotal - all[j][max] + all[j][0]);
                countsBySide[j] = (total - all[j][max]) % MOD;
                System.arraycopy(all[j], 0, all[j], 1, max);
            }
            total = newTotal;
        }
        return (int) (total % MOD);
    }
}
