package g2201_2300.s2239_find_closest_number_to_zero;

// #Easy #Array #2022_06_10_Time_2_ms_(84.21%)_Space_50.9_MB_(41.29%)

public class Solution {
    public int findClosestNumber(int[] nums) {
        int mini = Integer.MAX_VALUE;
        int closestNum = 0;
        for (int n : nums) {
            if (mini > Math.abs(n)) {
                mini = Math.abs(n);
                closestNum = n;
            } else if (mini == Math.abs(n) && closestNum < n) {
                closestNum = n;
            }
        }
        return closestNum;
    }
}
