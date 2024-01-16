package g2901_3000.s2965_find_missing_and_repeated_values;

// #Easy #Array #Hash_Table #Math #Matrix #2024_01_16_Time_1_ms_(100.00%)_Space_45.4_MB_(17.99%)

public class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int nSquare = grid.length * grid.length;
        int sum = nSquare * (nSquare + 1) / 2;
        boolean[] found = new boolean[nSquare + 1];
        int repeated = 1;
        for (int[] row : grid) {
            for (int n : row) {
                sum -= n;
                if (found[n]) {
                    repeated = n;
                }
                found[n] = true;
            }
        }
        return new int[] {repeated, sum + repeated};
    }
}
