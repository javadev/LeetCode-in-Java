package g2101_2200.s2164_sort_even_and_odd_indices_independently;

// #Easy #Array #Sorting #2022_06_05_Time_2_ms_(97.22%)_Space_42.7_MB_(82.78%)

import java.util.Arrays;

public class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int[] odd = new int[nums.length / 2];
        int[] even = new int[(nums.length + 1) / 2];
        int o = 0;
        int e = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even[e] = nums[i];
                ++e;
            } else {
                odd[o] = nums[i];
                ++o;
            }
        }
        Arrays.sort(odd);
        Arrays.sort(even);
        e = 0;
        o = odd.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = even[e];
                ++e;
            } else {
                nums[i] = odd[o];
                --o;
            }
        }
        return nums;
    }
}
