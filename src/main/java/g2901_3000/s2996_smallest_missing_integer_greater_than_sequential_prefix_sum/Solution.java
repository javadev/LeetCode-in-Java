package g2901_3000.s2996_smallest_missing_integer_greater_than_sequential_prefix_sum;

// #Easy #Array #Hash_Table #Sorting #2024_01_17_Time_1_ms_(93.13%)_Space_42.2_MB_(58.31%)

import java.util.Arrays;

public class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum = sum + nums[i];
            } else {
                break;
            }
        }
        Arrays.sort(nums);
        for (int no : nums) {
            if (no == sum) {
                sum++;
            }
        }
        return sum;
    }
}
