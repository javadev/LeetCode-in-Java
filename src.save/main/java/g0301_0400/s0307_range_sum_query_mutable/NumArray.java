package g0301_0400.s0307_range_sum_query_mutable;

// #Medium #Array #Design #Segment_Tree #Binary_Indexed_Tree #Acceptance_38.7%
// #2022_03_14_Time_61_ms_(98.40%)_Space_73.8_MB_(80.22%)

public class NumArray {
    private int[] nums;
    private int sum;

    public NumArray(int[] nums) {
        this.nums = nums;
        sum = 0;
        for (int num : nums) {
            sum += num;
        }
    }

    public void update(int index, int val) {
        sum -= nums[index] - val;
        nums[index] = val;
    }

    public int sumRange(int left, int right) {
        int sumRange = 0;
        if ((right - left) < nums.length / 2) {
            // Array to sum is less than half
            for (int i = left; i <= right; i++) {
                sumRange += nums[i];
            }
        } else {
            // Array to sum is more than half
            // Better to take total sum and substract the numbers not in range
            sumRange = sum;
            for (int i = 0; i < left; i++) {
                sumRange -= nums[i];
            }
            for (int i = right + 1; i < nums.length; i++) {
                sumRange -= nums[i];
            }
        }
        return sumRange;
    }
}
