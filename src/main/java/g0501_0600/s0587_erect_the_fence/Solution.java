package g0501_0600.s0587_erect_the_fence;

// #Hard #Array #Math #Geometry #2022_08_25_Time_12_ms_(90.91%)_Space_54.5_MB_(58.18%)

import java.util.Arrays;

public class Solution {
    private static final int MAX = 100;

    public int[][] outerTrees(int[][] trees) {
        int n = trees.length;
        if (n <= 2) {
            return trees;
        }
        radixSort2D(trees);
        int[][] st = new int[n * 2][];
        int idx = 0;
        for (int[] t : trees) {
            while (idx > 1 && polarOrder(st[idx - 2], st[idx - 1], t) < 0) {
                idx--;
            }
            st[idx++] = t;
        }
        for (int i = n - 1; i >= 0; i--) {
            while (idx > 1 && polarOrder(st[idx - 2], st[idx - 1], trees[i]) < 0) {
                idx--;
            }
            st[idx++] = trees[i];
        }
        return Arrays.stream(st, 0, idx).distinct().toArray(int[][]::new);
    }

    private void radixSort2D(int[][] trees) {
        int[][] aux = new int[trees.length][];
        for (int p = 1; p >= 0; p--) {
            int[] count = new int[MAX + 2];
            for (int[] t : trees) {
                count[t[p] + 1]++;
            }
            for (int c = 0; c <= MAX; c++) {
                count[c + 1] += count[c];
            }
            for (int[] t : trees) {
                aux[count[t[p]]++] = t;
            }
            System.arraycopy(aux, 0, trees, 0, trees.length);
        }
    }

    private int polarOrder(int[] p, int[] q, int[] r) {
        return (q[0] - p[0]) * (r[1] - q[1]) - (q[1] - p[1]) * (r[0] - q[0]);
    }
}
