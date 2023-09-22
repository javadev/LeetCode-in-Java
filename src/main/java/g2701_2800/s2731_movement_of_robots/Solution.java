package g2701_2800.s2731_movement_of_robots;

// #Medium #Array #Sorting #Prefix_Sum #Brainteaser
// #2023_09_22_Time_9_ms_(100.00%)_Space_54.7_MB_(63.56%)

import java.util.Arrays;

public class Solution {
    public int sumDistance(int[] nums, String s, int d) {
        int n = nums.length;
        int mod = (int) (1e9 + 7);
        for (int i = 0; i < n; i++) {
            nums[i] += (s.charAt(i) == 'R') ? d : -d;
        }
        Arrays.sort(nums);
        long res = 0;
        for (int i = 0; i < n; i++) {
            res = (res + (1L + i + i - n) * nums[i]) % mod;
        }
        return (int) ((res + mod) % mod);
    }
}
