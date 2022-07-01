package g2001_2100.s2057_smallest_index_with_equal_value;

// #Easy #Array #2022_05_26_Time_1_ms_(94.39%)_Space_46.9_MB_(19.23%)

public class Solution {
    public int smallestEqual(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i % 10 == nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
