package g1901_2000.s1938_maximum_genetic_difference_query;

// #Hard #Array #Bit_Manipulation #Trie #2022_05_16_Time_174_ms_(100.00%)_Space_134.4_MB_(85.00%)

public class Solution {
    public int[] maxGeneticDifference(int[] parents, int[][] queries) {
        int n = parents.length;
        int[][] fd = new int[n][];
        for (int i = 0; i < n; i++) {
            fill(parents, n, fd, i);
        }
        int[] ret = new int[queries.length];
        for (int q = 0; q < queries.length; q++) {
            int cur = queries[q][0];
            int value = queries[q][1];
            for (int p = 30; p >= 0; p--) {
                int msk = 1 << p;
                if ((value & msk) != (cur & msk)) {
                    ret[q] |= msk;
                } else if (fd[cur][p] >= 0) {
                    ret[q] |= msk;
                    cur = fd[cur][p];
                }
            }
        }
        return ret;
    }

    private void fill(int[] parents, int n, int[][] fd, int i) {
        if (fd[i] == null) {
            fd[i] = new int[31];
            int a = parents[i];
            if (a >= 0) {
                fill(parents, n, fd, a);
            }
            for (int p = 30; p >= 0; p--) {
                if (a == -1) {
                    fd[i][p] = -1;
                } else {
                    if ((i & (1 << p)) == (a & (1 << p))) {
                        fd[i][p] = fd[a][p];
                    } else {
                        fd[i][p] = a;
                        a = fd[a][p];
                    }
                }
            }
        }
    }
}
