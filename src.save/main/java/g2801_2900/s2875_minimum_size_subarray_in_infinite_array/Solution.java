package g2801_2900.s2875_minimum_size_subarray_in_infinite_array;

// #Medium #Array #Hash_Table #Prefix_Sum #Sliding_Window
// #2023_12_22_Time_6_ms_(87.63%)_Space_55.1_MB_(54.84%)

public class Solution {
    public int minSizeSubarray(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum == 0) {
            return -1;
        }
        int result = (target / sum) * nums.length;
        sum = target % sum;
        int currentSum = 0;
        int min = nums.length;
        int start = 0;
        for (int i = 0; i < nums.length * 2; i++) {
            currentSum += nums[i % nums.length];
            while (currentSum > sum) {
                currentSum -= nums[start % nums.length];
                start++;
            }
            if (currentSum == sum) {
                min = Math.min(min, i - start + 1);
            }
        }
        if (min == nums.length) {
            return -1;
        }
        return result + min;
    }
}
