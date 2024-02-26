package g2801_2900.s2870_minimum_number_of_operations_to_make_array_empty;

// #Medium #Array #Hash_Table #Greedy #Counting
// #2023_12_21_Time_6_ms_(98.16%)_Space_58.3_MB_(14.76%)

import java.util.Arrays;

public class Solution {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        int count;
        int min = 0;
        int current;
        int i = 0;
        while (i < nums.length) {
            current = nums[i];
            count = 0;
            while (i < nums.length && current == nums[i]) {
                count += 1;
                i++;
            }
            if (count == 1) {
                return -1;
            }
            min += (int) Math.ceil(count / (3 * 1.0));
        }
        return min;
    }
}
