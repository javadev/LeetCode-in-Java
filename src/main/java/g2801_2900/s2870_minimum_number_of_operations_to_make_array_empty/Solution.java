package g2801_2900.s2870_minimum_number_of_operations_to_make_array_empty;

// #Medium #Array #Hash_Table #Greedy #Counting
// #2023_12_21_Time_6_ms_(98.16%)_Space_58.3_MB_(14.76%)

import java.util.Arrays;

public class Solution {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        int count, min = 0, current;
        for (int i = 0; i < nums.length; i++) {
            current = nums[i];
            count = 0;
            while (i < nums.length && current == nums[i]) {
                count += 1;
                i++;
            }
            if (count == 1) {
                return -1;
            }
            min += Math.ceil(count / (3 * 1.0));
            i--;
        }
        return min;
    }
}
