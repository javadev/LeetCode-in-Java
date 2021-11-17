package g0201_0300.s0209_minimum_size_subarray_sum;

@SuppressWarnings("java:S2589")
public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while (j < nums.length) {
            sum += nums[j];
            if (sum < target) {
                j++;
            } else if (sum >= target) {
                while (i <= j) {
                    if (sum - nums[i] >= target) {
                        sum = sum - nums[i];
                        i++;
                    } else {
                        break;
                    }
                }
                if (j - i + 1 < min) {
                    min = j - i + 1;
                }
                j++;
            }
        }
        if (min == Integer.MAX_VALUE) {
            return 0;
        }
        return min;
    }
}
