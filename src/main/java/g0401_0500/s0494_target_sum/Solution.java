package g0401_0500.s0494_target_sum;

// #Medium #Array #Dynamic_Programming #Backtracking #Big_O_Time_O(n*(sum+s))_Space_O(n*(sum+s))
// #2024_11_17_Time_4_ms_(92.28%)_Space_42.7_MB_(57.04%)

public class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int totalSum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }
        int sum = totalSum - target;
        if (sum < 0 || sum % 2 == 1) {
            return 0;
        }
        return solve(nums, sum / 2);
    }

    private int solve(int[] nums, int target) {
        int[] prev = new int[target + 1];
        if (nums[0] == 0) {
            prev[0] = 2;
        } else {
            prev[0] = 1;
        }
        if (nums[0] != 0 && nums[0] <= target) {
            prev[nums[0]] = 1;
        }
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int[] curr = new int[target + 1];
            for (int j = 0; j <= target; j++) {
                int taken = 0;
                if (j >= nums[i]) {
                    taken = prev[j - nums[i]];
                }
                int nonTaken = prev[j];
                curr[j] = taken + nonTaken;
            }
            prev = curr;
        }
        return prev[target];
    }
}
