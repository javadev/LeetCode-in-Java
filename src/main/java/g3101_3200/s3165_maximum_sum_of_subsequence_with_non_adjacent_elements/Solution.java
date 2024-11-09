package g3101_3200.s3165_maximum_sum_of_subsequence_with_non_adjacent_elements;

// #Hard #Array #Dynamic_Programming #Divide_and_Conquer #Segment_Tree
// #2024_11_09_Time_64_ms_(100.00%)_Space_64.1_MB_(97.01%)

public class Solution {
    private static final int YY = 0;
    private static final int YN = 1;
    private static final int NY = 2;
    private static final int NN = 3;
    private static final int MOD = 1_000_000_007;

    public int maximumSumSubsequence(int[] nums, int[][] queries) {
        long[][] tree = build(nums);
        long result = 0;
        for (int i = 0; i < queries.length; ++i) {
            result += set(tree, queries[i][0], queries[i][1]);
            result %= MOD;
        }
        return (int) result;
    }

    private static long[][] build(int[] nums) {
        final int len = nums.length;
        int size = 1;
        while (size < len) {
            size <<= 1;
        }
        long[][] tree = new long[size * 2][4];
        for (int i = 0; i < len; ++i) {
            tree[size + i][YY] = nums[i];
        }
        for (int i = size - 1; i > 0; --i) {
            tree[i][YY] =
                    Math.max(
                            tree[2 * i][YY] + tree[2 * i + 1][NY],
                            tree[2 * i][YN] + Math.max(tree[2 * i + 1][YY], tree[2 * i + 1][NY]));
            tree[i][YN] =
                    Math.max(
                            tree[2 * i][YY] + tree[2 * i + 1][NN],
                            tree[2 * i][YN] + Math.max(tree[2 * i + 1][YN], tree[2 * i + 1][NN]));
            tree[i][NY] =
                    Math.max(
                            tree[2 * i][NY] + tree[2 * i + 1][NY],
                            tree[2 * i][NN] + Math.max(tree[2 * i + 1][YY], tree[2 * i + 1][NY]));
            tree[i][NN] =
                    Math.max(
                            tree[2 * i][NY] + tree[2 * i + 1][NN],
                            tree[2 * i][NN] + Math.max(tree[2 * i + 1][YN], tree[2 * i + 1][NN]));
        }
        return tree;
    }

    private static long set(long[][] tree, int idx, int val) {
        int size = tree.length / 2;
        tree[size + idx][YY] = val;
        for (int i = (size + idx) / 2; i > 0; i /= 2) {
            tree[i][YY] =
                    Math.max(
                            tree[2 * i][YY] + tree[2 * i + 1][NY],
                            tree[2 * i][YN] + Math.max(tree[2 * i + 1][YY], tree[2 * i + 1][NY]));
            tree[i][YN] =
                    Math.max(
                            tree[2 * i][YY] + tree[2 * i + 1][NN],
                            tree[2 * i][YN] + Math.max(tree[2 * i + 1][YN], tree[2 * i + 1][NN]));
            tree[i][NY] =
                    Math.max(
                            tree[2 * i][NY] + tree[2 * i + 1][NY],
                            tree[2 * i][NN] + Math.max(tree[2 * i + 1][YY], tree[2 * i + 1][NY]));
            tree[i][NN] =
                    Math.max(
                            tree[2 * i][NY] + tree[2 * i + 1][NN],
                            tree[2 * i][NN] + Math.max(tree[2 * i + 1][YN], tree[2 * i + 1][NN]));
        }
        return Math.max(tree[1][YY], Math.max(tree[1][YN], Math.max(tree[1][NY], tree[1][NN])));
    }
}
