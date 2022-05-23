package g2001_2100.s2009_minimum_number_of_operations_to_make_array_continuous;

// #Hard #Array #Binary_Search #2022_05_24_Time_57_ms_(72.43%)_Space_78.2_MB_(65.41%)

import java.util.Arrays;

public class Solution {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int duplicates = 0;
        int maxContinuous = 0;
        int start = 0;
        int end = 0;
        while (end < n) {
            if (end > 0 && nums[end] == nums[end - 1]) {
                duplicates++;
            }
            while (nums[start] + n <= nums[end]) {
                start++;
                if (nums[start] == nums[start - 1]) {
                    duplicates--;
                }
            }
            maxContinuous = Math.max(maxContinuous, end - start + 1 - duplicates);
            end++;
        }
        return n - maxContinuous;
    }
}
