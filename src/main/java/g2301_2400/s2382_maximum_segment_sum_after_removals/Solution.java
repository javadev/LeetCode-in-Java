package g2301_2400.s2382_maximum_segment_sum_after_removals;

// #Hard #Array #Prefix_Sum #Union_Find #Ordered_Set
// #2022_08_25_Time_28_ms_(100.00%)_Space_139.3_MB_(42.86%)

import java.util.Arrays;

public class Solution {
    private static class UF {
        int[] root;
        long[] sum;

        public UF(int n) {
            this.root = new int[n];
            Arrays.fill(this.root, -1);
            this.sum = new long[n];
        }

        public void insert(int x, int value) {
            if (root[x] != -1 || sum[x] != 0) {
                return;
            }
            this.root[x] = x;
            this.sum[x] = value;
        }

        public int find(int x) {
            while (root[x] != x) {
                int fa = root[x];
                int ga = root[fa];
                root[x] = ga;
                x = fa;
            }
            return x;
        }

        public void union(int x, int y) {
            int rx = find(x);
            int ry = find(y);
            if (x == y) {
                return;
            }
            root[rx] = ry;
            sum[ry] += sum[rx];
        }

        public boolean has(int x) {
            return root[x] != -1 || sum[x] != 0;
        }
    }

    public long[] maximumSegmentSum(int[] nums, int[] removeQueries) {
        int n = removeQueries.length;
        long[] ret = new long[n];
        long max = 0L;
        UF uf = new UF(n);
        for (int i = n - 1; i >= 0; i--) {
            int u = removeQueries[i];
            uf.insert(u, nums[u]);
            for (int v = u - 1; v <= u + 1; v += 2) {
                if (v >= 0 && v < n && uf.has(v)) {
                    uf.union(v, u);
                }
            }
            ret[i] = max;
            int ru = uf.find(u);
            max = Math.max(max, uf.sum[ru]);
        }
        return ret;
    }
}
