package g1301_1400.s1365_how_many_numbers_are_smaller_than_the_current_number;

// #Easy #Array #Hash_Table #Sorting #Counting #2022_03_21_Time_26_ms_(6.46%)_Space_45_MB_(18.09%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int[] tmp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(tmp);
        List<Integer> list = new ArrayList<>();
        for (int i : tmp) {
            list.add(i);
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = list.indexOf(nums[i]);
        }
        return result;
    }
}
