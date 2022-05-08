package g1801_1900.s1848_minimum_distance_to_the_target_element;

// #Easy #Array #2022_05_08_Time_1_ms_(58.33%)_Space_44.7_MB_(6.94%)

public class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int result = 0;
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && Math.abs(start - i) < minDiff) {
                minDiff = Math.abs(start - i);
                result = minDiff;
            }
        }
        return result;
    }
}
