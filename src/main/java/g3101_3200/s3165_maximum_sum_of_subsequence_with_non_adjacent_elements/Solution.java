package g3101_3200.s3165_maximum_sum_of_subsequence_with_non_adjacent_elements;

// #Hard #Array #Dynamic_Programming #Divide_and_Conquer #Segment_Tree
// #2024_06_02_Time_1927_ms_(87.75%)_Space_82.1_MB_(5.31%)

import java.util.stream.Stream;

public class Solution {
    private static final int MOD = 1_000_000_007;

    public int maximumSumSubsequence(int[] nums, int[][] queries) {
        int ans = 0;
        SegTree segTree = new SegTree(nums);
        for (int[] q : queries) {
            int idx = q[0];
            int val = q[1];
            segTree.update(idx, val);
            ans = (ans + segTree.getMax()) % MOD;
        }
        return ans;
    }
}

class SegTree {
    private static class Record {
        int takeFirstTakeLast;
        int takeFirstSkipLast;
        int skipFirstSkipLast;
        int skipFirstTakeLast;

        public Integer getMax() {
            return Stream.of(
                            this.takeFirstSkipLast,
                            this.takeFirstTakeLast,
                            this.skipFirstSkipLast,
                            this.skipFirstTakeLast)
                    .max(Integer::compare)
                    .orElse(null);
        }

        public Integer skipLast() {
            return Stream.of(this.takeFirstSkipLast, this.skipFirstSkipLast)
                    .max(Integer::compare)
                    .orElse(null);
        }

        public Integer takeLast() {
            return Stream.of(this.skipFirstTakeLast, this.takeFirstTakeLast)
                    .max(Integer::compare)
                    .orElse(null);
        }
    }

    private static Record[] seg;
    private final int[] nums;

    public SegTree(int[] nums) {
        this.nums = nums;
        seg = new Record[4 * nums.length];
        for (int i = 0; i < 4 * nums.length; ++i) {
            seg[i] = new Record();
        }
        build(0, nums.length - 1, 0);
    }

    private void build(int i, int j, int k) {
        if (i == j) {
            seg[k].takeFirstTakeLast = nums[i];
            return;
        }
        int mid = (i + j) >> 1;
        build(i, mid, 2 * k + 1);
        build(mid + 1, j, 2 * k + 2);
        merge(k);
    }

    // merge [2*k+1, 2*k+2] into k
    private static void merge(int k) {
        seg[k].takeFirstSkipLast =
                Math.max(
                        seg[2 * k + 1].takeFirstSkipLast + seg[2 * k + 2].skipLast(),
                        seg[2 * k + 1].takeFirstTakeLast + seg[2 * k + 2].skipFirstSkipLast);

        seg[k].takeFirstTakeLast =
                Math.max(
                        seg[2 * k + 1].takeFirstSkipLast + seg[2 * k + 2].takeLast(),
                        seg[2 * k + 1].takeFirstTakeLast + seg[2 * k + 2].skipFirstTakeLast);

        seg[k].skipFirstTakeLast =
                Math.max(
                        seg[2 * k + 1].skipFirstSkipLast + seg[2 * k + 2].takeLast(),
                        seg[2 * k + 1].skipFirstTakeLast + seg[2 * k + 2].skipFirstTakeLast);

        seg[k].skipFirstSkipLast =
                Math.max(
                        seg[2 * k + 1].skipFirstSkipLast + seg[2 * k + 2].skipLast(),
                        seg[2 * k + 1].skipFirstTakeLast + seg[2 * k + 2].skipFirstSkipLast);
    }

    // child -> parent
    public void update(int idx, int val) {
        int i = 0;
        int j = nums.length - 1;
        int k = 0;
        update(idx, val, k, i, j);
    }

    private static void update(int idx, int val, int k, int i, int j) {
        if (i == j) {
            seg[k].takeFirstTakeLast = val;
            return;
        }
        int mid = (i + j) >> 1;
        if (idx <= mid) {
            update(idx, val, 2 * k + 1, i, mid);
        } else {
            update(idx, val, 2 * k + 2, mid + 1, j);
        }
        merge(k);
    }

    public int getMax() {
        return seg[0].getMax();
    }
}
