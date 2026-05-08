package g3701_3800.s3768_minimum_inversion_count_in_subarrays_of_fixed_length;

// #Hard #Array #Sliding_Window #Segment_Tree #Senior_Staff #Biweekly_Contest_171
// #2026_05_08_Time_157_ms_(94.34%)_Space_125.70_MB_(100.00%)

import java.util.Arrays;

public class Solution {
    public long minInversionCount(int[] nums, int k) {
        int n = nums.length;
        // discretization of coordinates
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        for (int i = 0; i < n; i++) {
            nums[i] = Arrays.binarySearch(sorted, nums[i]) + 1;
        }
        BinaryIndexedTree bit = new BinaryIndexedTree(n);
        long invCount = 0L;
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            bit.add(nums[i], 1);
            invCount += Math.min(i + 1, k) - bit.presum(nums[i]);
            if (i < k - 1) {
                continue;
            }
            ans = Math.min(ans, invCount);
            invCount -= bit.presum(nums[i - k + 1] - 1);
            bit.add(nums[i - k + 1], -1);
        }
        return ans;
    }

    private class BinaryIndexedTree {
        private final int[] tree;

        public BinaryIndexedTree(int n) {
            tree = new int[n + 1];
        }

        public void add(int i, int val) {
            while (i < tree.length) {
                tree[i] += val;
                i += lowbit(i);
            }
        }

        public int presum(int i) {
            int sum = 0;
            while (i > 0) {
                sum += tree[i];
                i -= lowbit(i);
            }
            return sum;
        }

        private int lowbit(int n) {
            return n & (-n);
        }
    }
}
