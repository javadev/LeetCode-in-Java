package g0901_1000.s0930_binary_subarrays_with_sum;

// #Medium #Array #Hash_Table #Prefix_Sum #Sliding_Window
// #2022_03_29_Time_3_ms_(84.84%)_Space_56.9_MB_(44.53%)

public class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return goal == 0
                ? numSubarraysWithAtMostGoal(nums, 0)
                : numSubarraysWithAtMostGoal(nums, goal)
                        - numSubarraysWithAtMostGoal(nums, goal - 1);
    }

    private int numSubarraysWithAtMostGoal(int[] nums, int goal) {
        int windowSum = 0;
        int left = 0;
        int right = 0;
        int res = 0;
        while (right < nums.length) {
            windowSum += nums[right++];
            while (left < right && windowSum > goal) {
                windowSum -= nums[left++];
            }
            res += (right - left);
        }
        return res;
    }
}
