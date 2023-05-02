package g2401_2500.s2442_count_number_of_distinct_integers_after_reverse_operations;

// #Medium #Array #Hash_Table #Math #2022_12_13_Time_73_ms_(96.81%)_Space_61.1_MB_(96.28%)

import java.util.HashSet;

public class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
            set.add(reverseInt(i));
        }
        return set.size();
    }

    private int reverseInt(int num) {
        int ret = 0;
        while (num != 0) {
            ret = (num % 10) + ret * 10;
            num /= 10;
        }
        return ret;
    }
}
