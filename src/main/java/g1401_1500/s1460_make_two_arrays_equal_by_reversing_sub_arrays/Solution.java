package g1401_1500.s1460_make_two_arrays_equal_by_reversing_sub_arrays;

// #Easy #Array #Hash_Table #Sorting #2022_06_23_Time_4_ms_(74.61%)_Space_45.8_MB_(56.42%)

import java.util.Arrays;

public class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int n = target.length;
        Arrays.sort(target);
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < target.length; i++) {
            if (target[i] == arr[i]) {
                count++;
            }
        }
        return count == n;
    }
}
