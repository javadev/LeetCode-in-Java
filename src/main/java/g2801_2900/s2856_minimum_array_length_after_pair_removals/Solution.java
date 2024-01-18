package g2801_2900.s2856_minimum_array_length_after_pair_removals;

// #Medium #Array #Hash_Table #Greedy #Binary_Search #Two_Pointers #Counting
// #2023_12_15_Time_5_ms_(97.63%)_Space_59.1_MB_(36.50%)

import java.util.List;

public class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
        int n = nums.size();
        int i = 0;
        int j;
        if (n % 2 == 0) {
            j = n / 2;
        } else {
            j = n / 2 + 1;
        }
        int count = 0;
        while (i < n / 2 && j < n) {
            if (nums.get(i) < nums.get(j)) {
                count += 2;
            }
            i++;
            j++;
        }
        return n - count;
    }
}
