package g2301_2400.s2367_number_of_arithmetic_triplets;

// #Easy #Array #Hash_Table #Two_Pointers #Enumeration
// #2022_08_14_Time_3_ms_(66.67%)_Space_42.1_MB_(25.00%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }
        int ans = 0;
        for (int x : nums) {
            if (set.contains(x - diff) && set.contains(x + diff)) {
                ans++;
            }
        }
        return ans;
    }
}
