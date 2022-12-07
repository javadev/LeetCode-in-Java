package g1501_1600.s1502_can_make_arithmetic_progression_from_sequence;

// #Easy #Array #Sorting #Programming_Skills_I_Day_4_Loop
// #2022_04_07_Time_4_ms_(14.13%)_Space_42.5_MB_(48.89%)

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
