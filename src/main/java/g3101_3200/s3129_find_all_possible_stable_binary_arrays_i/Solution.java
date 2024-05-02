package g3101_3200.s3129_find_all_possible_stable_binary_arrays_i;

// #Medium #Dynamic_Programming #Prefix_Sum #2024_05_02_Time_3_ms_(100.00%)_Space_44.1_MB_(98.38%)

public class Solution {
    private static final int MODULUS = (int) 1e9 + 7;
    private static final long MOD_LONG = MODULUS;

    private int add(int x, int y) {
        return (x + y) % MODULUS;
    }

    private int subtract(int x, int y) {
        return (x + MODULUS - y) % MODULUS;
    }

    private int multiply(int x, int y) {
        return (int) ((long) x * y % MOD_LONG);
    }

    public int numberOfStableArrays(int zero, int one, int limit) {
        if (limit == 1) {
            return Math.max(2 - Math.abs(zero - one), 0);
        }
        int max = Math.max(zero, one);
        int min = Math.min(zero, one);
        int[][] lcn = new int[max + 1][max + 1];
        int[] row0 = lcn[0];
        int[] row1;
        int[] row2;
        row0[0] = 1;
        for (int s = 1, sLim = s - limit; s <= max; s++, sLim++) {
            row2 = sLim > 0 ? lcn[sLim - 1] : null;
            row1 = row0;
            row0 = lcn[s];
            int c;
            for (c = (s - 1) / limit + 1; c <= sLim; c++) {
                row0[c] = subtract(add(row1[c], row1[c - 1]), row2[c - 1]);
            }
            for (; c <= s; c++) {
                row0[c] = add(row1[c], row1[c - 1]);
            }
        }
        row1 = lcn[min];
        int result = 0;
        int s0 = add(min < max ? row0[min + 1] : 0, row0[min]);
        for (int c = min; c > 0; c--) {
            int s1 = s0;
            s0 = add(row0[c], row0[c - 1]);
            result = add(result, multiply(row1[c], add(s0, s1)));
        }
        return result;
    }
}
