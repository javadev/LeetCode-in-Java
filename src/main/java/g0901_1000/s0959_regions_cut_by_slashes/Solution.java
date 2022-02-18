package g0901_1000.s0959_regions_cut_by_slashes;

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Union_Find
// #2022_02_18_Time_9_ms_(39.29%)_Space_43.2_MB_(10.94%)

public class Solution {
    private int regions;
    private int[] parent;

    public int regionsBySlashes(String[] grid) {
        int n = grid.length;
        regions = n * n * 4;
        unionFind(regions);
        for (int row = 0; row < grid.length; ++row) {
            int col = 0;
            String str = grid[row];
            char[] ch = str.toCharArray();
            for (char c : ch) {
                int index = row * n * 4 + col * 4;
                if (c == '/') {
                    union(index, index + 3);
                    union(index + 1, index + 2);
                } else if (c == ' ') {
                    union(index, index + 1);
                    union(index + 1, index + 2);
                    union(index + 2, index + 3);

                } else {
                    union(index, index + 1);
                    union(index + 2, index + 3);
                    // ++i;
                }
                if (row != n - 1) {
                    union(index + 2, index + 4 * n);
                }
                if (col != n - 1) {
                    union(index + 1, index + 7);
                }
                ++col;
            }
        }
        return regions;
    }

    private void unionFind(int n) {
        parent = new int[n];
        for (int i = 0; i < n; ++i) {
            parent[i] = i;
        }
    }

    private void union(int p, int q) {
        if (connected(p, q)) {
            return;
        }
        --regions;
        int i = root(p);
        int j = root(q);
        if (i > j) {
            parent[i] = j;
        } else {
            parent[j] = i;
        }
    }

    private boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    private int root(int index) {
        while (index != parent[index]) {
            parent[index] = parent[parent[index]];
            index = parent[index];
        }
        return index;
    }
}
