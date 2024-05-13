package g1101_1200.s1131_maximum_of_absolute_value_expression;

// #Medium #Array #Math #2024_05_13_Time_1_ms_(100.00%)_Space_53_MB_(70.47%)

public class Solution {
    private int max(int[] a1, int[] a2, int k1, int k2, int k3) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < a1.length; i++) {
            result = Math.max(result, a1[i] * k1 + a2[i] * k2 + i * k3);
        }
        return result;
    }

    private int min(int[] a1, int[] a2, int k1, int k2, int k3) {
        return -max(a1, a2, -k1, -k2, -k3);
    }

    public int maxAbsValExpr(int[] a1, int[] a2) {
        if (a1 == null || a2 == null || a1.length == 0 || a2.length == 0) {
            return 0;
        }
        int result = 0;
        int[][] ksArray = {{1, 1, 1}, {1, 1, -1}, {1, -1, 1}, {1, -1, -1}};
        for (int[] ks : ksArray) {
            int max = max(a1, a2, ks[0], ks[1], ks[2]);
            int min = min(a1, a2, ks[0], ks[1], ks[2]);
            result = Math.max(result, max - min);
        }
        return result;
    }
}
