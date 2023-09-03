package g1201_1300.s1238_circular_permutation_in_binary_representation;

// #Medium #Math #Bit_Manipulation #Backtracking
// #2022_03_12_Time_4_ms_(100.00%)_Space_49.9_MB_(90.59%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> circularPermutation(int n, int start) {

        List<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < (1 << n); i++) {
            l1.add(start ^ (i ^ (i >> 1)));
        }
        return l1;
    }
}
