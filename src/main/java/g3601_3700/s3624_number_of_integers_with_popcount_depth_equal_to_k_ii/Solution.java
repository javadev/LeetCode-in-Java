package g3601_3700.s3624_number_of_integers_with_popcount_depth_equal_to_k_ii;

// #Hard #Array #Segment_Tree #Weekly_Contest_459
// #2025_07_22_Time_27_ms_(96.44%)_Space_125.92_MB_(24.76%)

import java.util.ArrayList;

public class Solution {
    private static final int[] DEPTH_TABLE = new int[65];

    static {
        DEPTH_TABLE[1] = 0;
        for (int i = 2; i <= 64; ++i) {
            DEPTH_TABLE[i] = 1 + DEPTH_TABLE[Integer.bitCount(i)];
        }
    }

    private int computeDepth(long number) {
        if (number == 1) {
            return 0;
        }
        return 1 + DEPTH_TABLE[Long.bitCount(number)];
    }

    public int[] popcountDepth(long[] nums, long[][] queries) {
        int len = nums.length;
        int maxDepth = 6;
        FenwickTree[] trees = new FenwickTree[maxDepth];
        for (int d = 0; d < maxDepth; ++d) {
            trees[d] = new FenwickTree();
            trees[d].build(len);
        }
        for (int i = 0; i < len; ++i) {
            int depth = computeDepth(nums[i]);
            if (depth < maxDepth) {
                trees[depth].update(i + 1, 1);
            }
        }
        ArrayList<Integer> ansList = new ArrayList<>();
        for (long[] query : queries) {
            int type = (int) query[0];
            if (type == 1) {
                int left = (int) query[1];
                int right = (int) query[2];
                int depth = (int) query[3];
                if (depth >= 0 && depth < maxDepth) {
                    ansList.add(trees[depth].queryRange(left + 1, right + 1));
                } else {
                    ansList.add(0);
                }
            } else if (type == 2) {
                int index = (int) query[1];
                long newVal = query[2];
                int oldDepth = computeDepth(nums[index]);
                if (oldDepth < maxDepth) {
                    trees[oldDepth].update(index + 1, -1);
                }
                nums[index] = newVal;
                int newDepth = computeDepth(newVal);
                if (newDepth < maxDepth) {
                    trees[newDepth].update(index + 1, 1);
                }
            }
        }
        int[] ansArray = new int[ansList.size()];
        for (int i = 0; i < ansList.size(); i++) {
            ansArray[i] = ansList.get(i);
        }
        return ansArray;
    }

    private static class FenwickTree {
        private int[] tree;
        private int size;

        public FenwickTree() {
            this.size = 0;
        }

        public void build(int n) {
            this.size = n;
            this.tree = new int[size + 1];
        }

        public void update(int index, int value) {
            while (index <= size) {
                tree[index] += value;
                index += index & (-index);
            }
        }

        public int query(int index) {
            int result = 0;
            while (index > 0) {
                result += tree[index];
                index -= index & (-index);
            }
            return result;
        }

        public int queryRange(int left, int right) {
            if (left > right) {
                return 0;
            }
            return query(right) - query(left - 1);
        }
    }
}
