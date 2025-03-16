package g3101_3200.s3161_block_placement_queries;

// #Hard #Array #Binary_Search #Segment_Tree #Binary_Indexed_Tree
// #2025_03_16_Time_47_ms_(100.00%)_Space_144.38_MB_(56.41%)

import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Boolean> getResults(int[][] queries) {
        int m = queries.length;
        int[] pos = new int[m + 1];
        int size = 0;
        pos[size++] = 0;
        int max = 0;
        for (int[] q : queries) {
            max = Math.max(max, q[1]);
            if (q[0] == 1) {
                pos[size++] = q[1];
            }
        }
        Arrays.sort(pos, 0, size);
        max++;
        UnionFind left = new UnionFind(max + 1);
        UnionFind right = new UnionFind(max + 1);
        BIT bit = new BIT(max);
        initializePositions(size, pos, bit, left, right, max);
        return List.of(getBooleans(queries, m, size, left, right, bit));
    }

    private void initializePositions(
            int size, int[] pos, BIT bit, UnionFind left, UnionFind right, int max) {
        for (int i = 1; i < size; i++) {
            int pre = pos[i - 1];
            int cur = pos[i];
            bit.update(cur, cur - pre);
            for (int j = pre + 1; j < cur; j++) {
                left.parent[j] = pre;
                right.parent[j] = cur;
            }
        }
        for (int j = pos[size - 1] + 1; j < max; j++) {
            left.parent[j] = pos[size - 1];
            right.parent[j] = max;
        }
    }

    private Boolean[] getBooleans(
            int[][] queries, int m, int size, UnionFind left, UnionFind right, BIT bit) {
        Boolean[] ans = new Boolean[m - size + 1];
        int index = ans.length - 1;
        for (int i = m - 1; i >= 0; i--) {
            int[] q = queries[i];
            int x = q[1];
            int pre = left.find(x - 1);
            if (q[0] == 1) {
                int next = right.find(x + 1);
                left.parent[x] = pre;
                right.parent[x] = next;
                bit.update(next, next - pre);
            } else {
                int maxGap = Math.max(bit.query(pre), x - pre);
                ans[index--] = maxGap >= q[2];
            }
        }
        return ans;
    }

    private static final class BIT {
        int n;
        int[] tree;

        public BIT(int n) {
            this.n = n;
            tree = new int[n];
        }

        public void update(int i, int v) {
            while (i < n) {
                tree[i] = Math.max(tree[i], v);
                i += i & -i;
            }
        }

        public int query(int i) {
            int result = 0;
            while (i > 0) {
                result = Math.max(result, tree[i]);
                i &= i - 1;
            }
            return result;
        }
    }

    private static final class UnionFind {
        public int[] parent;

        public UnionFind(int n) {
            parent = new int[n];
            for (int i = 1; i < n; i++) {
                parent[i] = i;
            }
        }

        public int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }
    }
}
