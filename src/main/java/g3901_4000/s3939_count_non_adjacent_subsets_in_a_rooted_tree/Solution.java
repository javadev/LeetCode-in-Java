package g3901_4000.s3939_count_non_adjacent_subsets_in_a_rooted_tree;

// #Hard #Array #Dynamic_Programming #Tree #Senior_Staff #Biweekly_Contest_183 #Depth_First_Search
// #2026_09_29_Time_83_ms_(94.12%)_Space_49.60_MB_(29.41%)

import java.util.Arrays;

public class Solution {
    private static final int MOD = 1000000007;

    public int countValidSubsets(int[] parent, int[] nums, int k) {
        int n = parent.length;
        int[] h = new int[n];
        int[] to = new int[n - 1];
        int[] nx = new int[n - 1];
        buildTree(parent, h, to, nx);
        long[][][] dp = new long[n][2][k];
        dfs(0, h, to, nx, nums, k, dp);
        return getResult(dp);
    }

    private void buildTree(int[] parent, int[] h, int[] to, int[] nx) {
        Arrays.fill(h, -1);
        int idx = 0;
        for (int i = 1; i < parent.length; i++) {
            to[idx] = i;
            nx[idx] = h[parent[i]];
            h[parent[i]] = idx++;
        }
    }

    private void dfs(int u, int[] h, int[] to, int[] nx, int[] nums, int k, long[][][] dp) {
        initializeDp(u, nums, k, dp);
        for (int e = h[u]; e != -1; e = nx[e]) {
            int v = to[e];
            dfs(v, h, to, nx, nums, k, dp);
            mergeChild(dp[u], dp[v], k);
        }
    }

    private void initializeDp(int u, int[] nums, int k, long[][][] dp) {
        dp[u][0][0] = 1;
        dp[u][1][nums[u] % k] = 1;
    }

    private void mergeChild(long[][] current, long[][] child, int k) {
        long[][] next = new long[2][k];
        mergeExcludedState(current[0], child, next[0], k);
        mergeSelectedState(current[1], child[0], next[1], k);
        copyState(next, current, k);
    }

    private void mergeExcludedState(long[] current, long[][] child, long[] next, int k) {
        for (int a = 0; a < k; a++) {
            if (current[a] != 0) {
                mergeWithChildStates(current[a], child[0], child[1], next, a, k);
            }
        }
    }

    private void mergeSelectedState(long[] current, long[] childExcluded, long[] next, int k) {
        for (int a = 0; a < k; a++) {
            if (current[a] != 0) {
                mergeWithSingleChildState(current[a], childExcluded, next, a, k);
            }
        }
    }

    private void mergeWithChildStates(
            long currentWays,
            long[] childExcluded,
            long[] childSelected,
            long[] next,
            int currentMod,
            int k) {
        for (int childMod = 0; childMod < k; childMod++) {
            long childWays = (childExcluded[childMod] + childSelected[childMod]) % MOD;
            addWays(next, currentMod, childMod, currentWays, childWays, k);
        }
    }

    private void mergeWithSingleChildState(
            long currentWays, long[] child, long[] next, int currentMod, int k) {
        for (int childMod = 0; childMod < k; childMod++) {
            addWays(next, currentMod, childMod, currentWays, child[childMod], k);
        }
    }

    private void addWays(
            long[] target, int currentMod, int childMod, long currentWays, long childWays, int k) {
        if (childWays == 0) {
            return;
        }
        int newMod = (currentMod + childMod) % k;
        target[newMod] = (target[newMod] + currentWays * childWays) % MOD;
    }

    private void copyState(long[][] source, long[][] target, int k) {
        for (int state = 0; state < 2; state++) {
            if (k >= 0) {
                System.arraycopy(source[state], 0, target[state], 0, k);
            }
        }
    }

    private int getResult(long[][][] dp) {
        long result = dp[0][0][0] + dp[0][1][0];
        result %= MOD;
        result = (result - 1 + MOD) % MOD;
        return (int) result;
    }
}
