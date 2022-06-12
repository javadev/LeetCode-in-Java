package g2201_2300.s2210_count_hills_and_valleys_in_an_array;

// #Easy #Array #2022_06_12_Time_0_ms_(100.00%)_Space_41.8_MB_(60.16%)

public class Solution {
    public int countHillValley(int[] nums) {
        int left = nums[0];
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if ((left > nums[i] && nums[i + 1] > nums[i])
                    || (left < nums[i] && nums[i + 1] < nums[i])) {
                count++;
                left = nums[i];
            }
        }
        return count;
    }
}
