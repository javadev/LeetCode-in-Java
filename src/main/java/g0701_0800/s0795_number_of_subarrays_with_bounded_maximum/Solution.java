package g0701_0800.s0795_number_of_subarrays_with_bounded_maximum;

// #Medium #Array #Two_Pointers #2022_03_26_Time_2_ms_(100.00%)_Space_49.8_MB_(90.64%)

public class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int i = 0;
        int j = 0;
        int count = 0;
        int tempSum = 0;
        while (j < nums.length) {
            if (nums[j] > right) {
                tempSum = 0;
                i = ++j;
            } else if (nums[j] < left) {
                count += tempSum;
                j++;
            } else {
                tempSum = j - i + 1;
                count += tempSum;
                j++;
            }
        }
        return count;
    }
}
