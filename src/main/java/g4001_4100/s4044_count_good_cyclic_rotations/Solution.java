package g4001_4100.s4044_count_good_cyclic_rotations;

// #Medium #Array #Prefix_Sum #Sliding_Window #Senior #Weekly_Contest_518
// #2026_11_25_Time_3_ms_(98.00%)_Space_71.09_MB_(63.67%)

public class Solution {
    public int countGoodRotations(int[] nums) {
        long leftsum = 0;
        long rightsum = 0;
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n / 2; i++) {
            leftsum += nums[i];
            rightsum += nums[n - 1 - i];
        }
        int left = 0;
        int right = n / 2;
        while (right < n) {
            leftsum = leftsum - nums[left] + nums[right];
            rightsum = rightsum - nums[right] + nums[left];
            left++;
            right++;
            if (leftsum != rightsum) {
                count++;
            }
        }
        return count;
    }
}
