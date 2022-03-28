package g0801_0900.s0898_bitwise_ors_of_subarrays;

// #Medium #Array #Dynamic_Programming #Bit_Manipulation
// #2022_03_28_Time_151_ms_(97.74%)_Space_71.9_MB_(85.31%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
            for (int j = i - 1; j >= 0; j--) {
                if ((arr[i] | arr[j]) == arr[j]) {
                    break;
                }
                arr[j] |= arr[i];
                set.add(arr[j]);
            }
        }
        return set.size();
    }
}
