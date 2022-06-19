package g2201_2300.s2295_replace_elements_in_an_array;

// #Medium #Array #Hash_Table #Simulation #2022_06_16_Time_89_ms_(65.26%)_Space_170.7_MB_(17.18%)

import java.util.HashMap;

public class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int[] operation : operations) {
            int index = map.get(operation[0]);
            nums[index] = operation[1];
            map.put(operation[1], index);
        }
        return nums;
    }
}
