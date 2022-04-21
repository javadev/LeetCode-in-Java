package g1601_1700.s1646_get_maximum_in_generated_array;

// #Easy #Array #Dynamic_Programming #Simulation
// #2022_04_21_Time_0_ms_(100.00%)_Space_41.6_MB_(12.23%)

public class Solution {
    public int getMaximumGenerated(int n) {
        if (n == 0) {
            return 0;
        }
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        int max = 1;
        for (int i = 1; i <= n / 2; i++) {
            nums[(i * 2)] = nums[i];
            max = Math.max(max, nums[i]);
            if ((i * 2) + 1 <= n) {
                nums[(i * 2) + 1] = nums[i] + nums[i + 1];
                max = Math.max(max, nums[(i * 2) + 1]);
            }
        }
        return max;
    }
}
