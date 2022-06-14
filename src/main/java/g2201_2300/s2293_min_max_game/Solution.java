package g2201_2300.s2293_min_max_game;

// #Easy #Array #Simulation #2022_06_14_Time_1_ms_(90.39%)_Space_44_MB_(50.37%)

public class Solution {
    public int minMaxGame(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        int[] newNums = new int[n / 2];
        for (int i = 0; i < n / 2; i++) {
            if (i % 2 == 0) {
                newNums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
            } else {
                newNums[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
            }
        }
        return minMaxGame(newNums);
    }
}
