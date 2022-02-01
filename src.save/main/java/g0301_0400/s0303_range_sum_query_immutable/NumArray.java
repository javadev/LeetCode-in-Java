package g0301_0400.s0303_range_sum_query_immutable;

// #Easy #Array #Design #Prefix_Sum

public class NumArray {
    private int[] sums;

    public NumArray(int[] nums) {
        sums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                sums[i] = nums[i];
            } else {
                sums[i] = sums[i - 1] + nums[i];
            }
        }
    }

    public int sumRange(int i, int j) {
        if (i == 0) {
            return sums[j];
        }
        return sums[j] - sums[i - 1];
    }
}
