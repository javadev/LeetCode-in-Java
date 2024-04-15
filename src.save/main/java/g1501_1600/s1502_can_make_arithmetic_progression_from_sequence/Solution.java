package g1501_1600.s1502_can_make_arithmetic_progression_from_sequence;

// #Easy #Array #Sorting #Programming_Skills_I_Day_4_Loop
// #2023_09_03_Time_2_ms_(90.55%)_Space_40.6_MB_(76.68%)

import java.util.Arrays;

public class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i + 1] - arr[i] != arr[i + 2] - arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
