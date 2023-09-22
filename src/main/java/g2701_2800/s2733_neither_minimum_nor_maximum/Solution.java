package g2701_2800.s2733_neither_minimum_nor_maximum;

// #Easy #Array #Sorting #2023_09_22_Time_4_ms_(99.76%)_Space_43.9_MB_(27.58%)

public class Solution {
    public int findNonMinOrMax(int[] nums) {
        int mn = 999;
        int mx = -1;
        for (int num : nums) {
            mn = Math.min(num, mn);
            mx = Math.max(num, mx);
        }
        for (int num : nums) {
            if (num != mn && num != mx) {
                return num;
            }
        }
        return -1;
    }
}
