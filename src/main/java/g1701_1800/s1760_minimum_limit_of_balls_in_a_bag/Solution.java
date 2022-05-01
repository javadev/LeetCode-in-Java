package g1701_1800.s1760_minimum_limit_of_balls_in_a_bag;

// #Medium #Array #Binary_Search #Binary_Search_II_Day_3
// #2022_05_01_Time_39_ms_(90.32%)_Space_54.2_MB_(72.22%)

public class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1;
        int right = 1_000_000_000;
        while (left < right) {
            int mid = (left + right) / 2;
            int count = 0;
            for (int num : nums) {
                count += (num - 1) / mid;
            }
            if (count > maxOperations) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
