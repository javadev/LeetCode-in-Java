package g2201_2300.s2202_maximize_the_topmost_element_after_k_moves;

// #Medium #Array #Greedy #2022_06_10_Time_1_ms_(100.00%)_Space_84.7_MB_(16.00%)

public class Solution {
    public int maximumTop(int[] nums, int k) {
        int max = -1;
        int maxTravers = Math.min(k + 1, nums.length);
        if (nums.length == 1) {
            if (k % 2 == 0) {
                return nums[0];
            } else {
                return max;
            }
        }
        for (int i = 0; i < maxTravers; i++) {
            if (nums[i] > max && i != k - 1) {
                max = nums[i];
            }
        }
        return max;
    }
}
