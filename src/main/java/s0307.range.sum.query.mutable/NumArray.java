package s0307.range.sum.query.mutable;

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
