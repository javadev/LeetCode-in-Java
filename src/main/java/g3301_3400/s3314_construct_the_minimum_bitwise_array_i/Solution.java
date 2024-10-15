package g3301_3400.s3314_construct_the_minimum_bitwise_array_i;

// #Easy #Array #Bit_Manipulation #2024_10_15_Time_3_ms_(92.32%)_Space_44.5_MB_(92.59%)

import java.util.List;

public class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int l = nums.size();
        int[] r = new int[l];
        for (int i = 0; i < l; i++) {
            r[i] = check(nums.get(i));
        }
        return r;
    }

    private int check(int v) {
        if (v % 2 == 0) {
            return -1;
        }
        for (int j = 1; j < v; j++) {
            if ((j | (j + 1)) == v) {
                return j;
            }
        }
        return -1;
    }
}
