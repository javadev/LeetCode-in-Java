package g0201_0300.s0209_minimum_size_subarray_sum;

// #Medium #Array #Binary_Search #Prefix_Sum #Sliding_Window #Algorithm_II_Day_5_Sliding_Window
// #Binary_Search_II_Day_1 #Top_Interview_150_Sliding_Window
// #2025_03_09_Time_1_ms_(99.76%)_Space_58.08_MB_(66.32%)

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while (j < nums.length) {
            sum += nums[j];
            if (sum >= target) {
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
            }
            j++;
        }
        if (min == Integer.MAX_VALUE) {
            return 0;
        }
        return min;
    }
}
