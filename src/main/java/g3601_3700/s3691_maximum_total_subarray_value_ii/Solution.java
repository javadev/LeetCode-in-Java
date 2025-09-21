package g3601_3700.s3691_maximum_total_subarray_value_ii;

// #Hard #Weekly_Contest_468 #2025_09_21_Time_200_ms_(100.00%)_Space_68.71_MB_(100.00%)

import java.util.PriorityQueue;
import java.util.function.IntBinaryOperator;

public class Solution {
    private static class SparseTableOp {
        private final int[][] table;
        private final IntBinaryOperator op;

        public SparseTableOp(int[] arr, IntBinaryOperator op) {
            this.op = op;
            int n = arr.length;
            if (n == 0) {
                this.table = new int[0][0];
                return;
            }
            int maxLog = 31 - Integer.numberOfLeadingZeros(n);
            this.table = new int[n][maxLog + 1];
            for (int i = 0; i < n; i++) {
                table[i][0] = arr[i];
            }
            for (int j = 1; j <= maxLog; j++) {
                for (int i = 0; i + (1 << j) <= n; i++) {
                    table[i][j] = op.applyAsInt(table[i][j - 1], table[i + (1 << (j - 1))][j - 1]);
                }
            }
        }

        public int query(int left, int right) {
            if (left > right) {
                throw new IllegalArgumentException(
                        "Left index must not be greater than right index.");
            }
            int length = right - left + 1;
            int k = 31 - Integer.numberOfLeadingZeros(length);
            return op.applyAsInt(table[left][k], table[right - (1 << k) + 1][k]);
        }
    }

    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k == 0) {
            return 0;
        }
        // Create sparse tables for O(1) min and max range queries
        SparseTableOp smin = new SparseTableOp(nums, Math::min);
        SparseTableOp smax = new SparseTableOp(nums, Math::max);
        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(b[0], a[0]));
        for (int i = 0; i < n; i++) {
            long value = (long) smax.query(i, n - 1) - smin.query(i, n - 1);
            pq.offer(new long[] {value, i, n - 1});
        }
        long totalValue = 0;
        for (int i = 0; i < k; i++) {
            if (pq.isEmpty()) {
                break;
            }
            long[] top = pq.poll();
            long value = top[0];
            int start = (int) top[1];
            int end = (int) top[2];
            totalValue += value;
            if (end > start) {
                long nextValue = (long) smax.query(start, end - 1) - smin.query(start, end - 1);
                pq.offer(new long[] {nextValue, start, end - 1});
            }
        }
        return totalValue;
    }
}
