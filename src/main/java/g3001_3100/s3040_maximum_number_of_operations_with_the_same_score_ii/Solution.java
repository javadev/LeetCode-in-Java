package g3001_3100.s3040_maximum_number_of_operations_with_the_same_score_ii;

// #Medium #Array #Dynamic_Programming #Memoization
// #2024_03_04_Time_3_ms_(99.75%)_Space_44.6_MB_(99.29%)

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
    private int[] nums;

    private int maxOps = 1;

    private final Map<Pos, Integer> dp = new HashMap<>();

    private static class Pos {
        int start;
        int end;
        int sum;

        Pos(int start, int end, int sum) {
            this.start = start;
            this.end = end;
            this.sum = sum;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null) {
                return false;
            }
            if (!(o instanceof Pos)) {
                return false;
            }
            return start == ((Pos) o).start && end == ((Pos) o).end && sum == ((Pos) o).sum;
        }

        @Override
        public int hashCode() {
            return Objects.hash(start, end, sum);
        }
    }

    public int maxOperations(int[] nums) {
        this.nums = nums;
        var length = nums.length;

        maxOperations(2, length - 1, nums[0] + nums[1], 1);
        maxOperations(0, length - 3, nums[length - 2] + nums[length - 1], 1);
        maxOperations(1, length - 2, nums[0] + nums[length - 1], 1);

        return maxOps;
    }

    private void maxOperations(int start, int end, int sum, int nOps) {
        if (start >= end) {
            return;
        }

        if ((((end - start) / 2) + nOps) < maxOps) {
            return;
        }

        Pos pos = new Pos(start, end, sum);
        Integer posNops = dp.get(pos);
        if (posNops != null && posNops >= nOps) {
            return;
        }
        dp.put(pos, nOps);
        if (nums[start] + nums[start + 1] == sum) {
            maxOps = Math.max(maxOps, nOps + 1);
            maxOperations(start + 2, end, sum, nOps + 1);
        }
        if (nums[end - 1] + nums[end] == sum) {
            maxOps = Math.max(maxOps, nOps + 1);
            maxOperations(start, end - 2, sum, nOps + 1);
        }
        if (nums[start] + nums[end] == sum) {
            maxOps = Math.max(maxOps, nOps + 1);
            maxOperations(start + 1, end - 1, sum, nOps + 1);
        }
    }
}
