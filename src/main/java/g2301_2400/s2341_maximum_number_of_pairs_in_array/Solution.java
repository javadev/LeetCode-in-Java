package g2301_2400.s2341_maximum_number_of_pairs_in_array;

// #Easy #Array #Hash_Table #Sorting #2022_07_18_Time_2_ms_(80.00%)_Space_42.3_MB_(80.00%)

import java.util.Arrays;

public class Solution {
    public int[] numberOfPairs(int[] nums) {
        Arrays.sort(nums);
        int pairs = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                nums[i] = -1;
                nums[i - 1] = -1;
                pairs++;
            }
        }
        return new int[] {pairs, nums.length - (2 * pairs)};
    }
}
