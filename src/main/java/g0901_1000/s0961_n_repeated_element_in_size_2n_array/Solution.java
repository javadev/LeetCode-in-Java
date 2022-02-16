package g0901_1000.s0961_n_repeated_element_in_size_2n_array;

// #Easy #Array #Hash_Table

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int num : A) {
            if (!set.add(num)) {
                return num;
            }
        }
        return -1;
    }
}
