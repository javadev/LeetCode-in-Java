package g3501_3600.s3544_subtree_inversion_sum;

// #Hard #Array #Dynamic_Programming #Depth_First_Search #Tree
// #2025_05_13_Time_159_ms_(89.47%)_Space_154.99_MB_(71.05%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private long[] totalSum;
    private int[] nums;
    private List<List<Integer>> nei;
    private int k;

    private long getTotalSum(int p, int cur) {
        long res = nums[cur];
        for (int c : nei.get(cur)) {
            if (c == p) {
                continue;
            }
            res += getTotalSum(cur, c);
        }
        totalSum[cur] = res;
        return res;
    }

    private void add(long[][] a, long[][] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] += b[i][j];
            }
        }
    }

    private long[][] getMaxInc(int p, int cur) {
        long[][] ret = new long[3][k];
        for (int c : nei.get(cur)) {
            if (c == p) {
                continue;
            }
            add(ret, getMaxInc(cur, c));
        }
        long maxCandWithoutInv = nums[cur] + ret[2][0];
        long maxCandWithInv = -(totalSum[cur] - ret[0][k - 1]) - ret[1][k - 1];
        long minCandWithoutInv = nums[cur] + ret[1][0];
        long minCandWithInv = -(totalSum[cur] - ret[0][k - 1]) - ret[2][k - 1];
        long[][] res = new long[3][k];
        for (int i = 0; i < k - 1; i++) {
            res[0][i + 1] = ret[0][i];
            res[1][i + 1] = ret[1][i];
            res[2][i + 1] = ret[2][i];
        }
        res[0][0] = totalSum[cur];
        res[1][0] =
                Math.min(
                        Math.min(maxCandWithoutInv, maxCandWithInv),
                        Math.min(minCandWithoutInv, minCandWithInv));
        res[2][0] =
                Math.max(
                        Math.max(maxCandWithoutInv, maxCandWithInv),
                        Math.max(minCandWithoutInv, minCandWithInv));
        return res;
    }

    public long subtreeInversionSum(int[][] edges, int[] nums, int k) {
        totalSum = new long[nums.length];
        this.nums = nums;
        nei = new ArrayList<>();
        this.k = k;
        for (int i = 0; i < nums.length; i++) {
            nei.add(new ArrayList<>());
        }
        for (int[] e : edges) {
            nei.get(e[0]).add(e[1]);
            nei.get(e[1]).add(e[0]);
        }
        getTotalSum(-1, 0);
        long[][] res = getMaxInc(-1, 0);
        return res[2][0];
    }
}
