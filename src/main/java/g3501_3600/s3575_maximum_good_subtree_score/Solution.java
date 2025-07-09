package g3501_3600.s3575_maximum_good_subtree_score;

// #Hard #Array #Dynamic_Programming #Depth_First_Search #Tree #Bit_Manipulation #Bitmask
// #2025_06_10_Time_92_ms_(98.73%)_Space_55.23_MB_(11.71%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unchecked")
public class Solution {
    private static final int DIGITS = 10;
    private static final int FULL = 1 << DIGITS;
    private static final long NEG = Long.MIN_VALUE / 4;
    private static final long MOD = (long) 1e9 + 7;
    private List<Integer>[] tree;
    private int[] val;
    private int[] mask;
    private boolean[] isOk;
    private long res = 0;

    public int goodSubtreeSum(int[] vals, int[] par) {
        int n = vals.length;
        val = vals;
        mask = new int[n];
        isOk = new boolean[n];
        for (int i = 0; i < n; i++) {
            int m = 0;
            int v = vals[i];
            boolean valid = true;
            while (v > 0) {
                int d = v % 10;
                if (((m >> d) & 1) == 1) {
                    valid = false;
                    break;
                }
                m |= 1 << d;
                v /= 10;
            }
            mask[i] = m;
            isOk[i] = valid;
        }
        tree = new ArrayList[n];
        Arrays.setAll(tree, ArrayList::new);
        int root = 0;
        for (int i = 1; i < n; i++) {
            tree[par[i]].add(i);
        }
        dfs(root);
        return (int) (res % MOD);
    }

    private long[] dfs(int u) {
        long[] dp = new long[FULL];
        Arrays.fill(dp, NEG);
        dp[0] = 0;
        if (isOk[u]) {
            dp[mask[u]] = val[u];
        }
        for (int v : tree[u]) {
            long[] child = dfs(v);
            long[] newDp = Arrays.copyOf(dp, FULL);
            for (int m1 = 0; m1 < FULL; m1++) {
                if (dp[m1] < 0) {
                    continue;
                }
                int remain = FULL - 1 - m1;
                for (int m2 = remain; m2 > 0; m2 = (m2 - 1) & remain) {
                    if (child[m2] < 0) {
                        continue;
                    }
                    int newM = m1 | m2;
                    newDp[newM] = Math.max(newDp[newM], dp[m1] + child[m2]);
                }
            }
            dp = newDp;
        }
        long best = 0;
        for (long v : dp) {
            best = Math.max(best, v);
        }
        res = (res + best) % MOD;
        return dp;
    }
}
