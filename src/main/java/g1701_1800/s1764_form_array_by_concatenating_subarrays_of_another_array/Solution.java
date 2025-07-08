package g1701_1800.s1764_form_array_by_concatenating_subarrays_of_another_array;

// #Medium #Array #Greedy #String_Matching #2022_07_12_Time_3_ms_(43.69%)_Space_45.5_MB_(69.90%)

import java.util.Arrays;

public class Solution {
    public boolean canChoose(int[][] groups, int[] nums) {
        int prev = 0;
        for (int[] group : groups) {
            int[] temp = new int[group.length];
            if (prev + group.length > nums.length) {
                return false;
            }
            int index = 0;
            int j;
            for (j = prev; j < prev + group.length; j++) {
                temp[index++] = nums[j];
            }
            if (Arrays.equals(temp, group)) {
                prev = j;
                continue;
            }
            int k;
            for (k = j; k < nums.length; k++) {
                int l;
                for (l = 0; l < temp.length - 1; l++) {
                    temp[l] = temp[l + 1];
                }
                temp[l] = nums[k];
                if (Arrays.equals(temp, group)) {
                    prev = k + 1;
                    break;
                }
            }
            if (k == nums.length) {
                return false;
            }
        }
        return true;
    }
}
