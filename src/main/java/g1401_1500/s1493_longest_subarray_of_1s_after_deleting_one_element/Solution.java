package g1401_1500.s1493_longest_subarray_of_1s_after_deleting_one_element;

// #Medium #Dynamic_Programming #Math #Sliding_Window
// #2022_03_23_Time_2_ms_(87.25%)_Space_58.4_MB_(29.26%)

public class Solution {
    public int longestSubarray(int[] nums) {
        int s = 0;
        int e = 0;
        int max = Integer.MIN_VALUE;
        boolean extraZero = false;
        boolean allOne = true;
        while (e < nums.length) {
            if (nums[e] == 1) {
                e++;
            } else if (!extraZero) {
                allOne = false;
                extraZero = true;
                e++;
            } else {
                allOne = false;
                max = Math.max(max, e - s - 1);
                while (nums[s] != 0) {
                    s++;
                }
                s++;
                extraZero = false;
            }
        }
        if (nums[e - 1] == 1) {
            max = Math.max(max, e - s - 1);
        }
        if (allOne) {
            return nums.length - 1;
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}
