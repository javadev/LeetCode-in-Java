package g2701_2800.s2729_check_if_the_number_is_fascinating;

// #Easy #Hash_Table #Math #2023_09_19_Time_1_ms_(96.07%)_Space_40.3_MB_(46.53%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isFascinating(int n) {
        Set<Integer> set = new HashSet<>();
        return add(set, n) && add(set, 2 * n) && add(set, 3 * n);
    }

    private boolean add(Set<Integer> set, int cur) {
        while (cur > 0) {
            int digit = cur % 10;
            if (digit == 0 || set.contains(digit)) {
                return false;
            }
            set.add(digit);
            cur /= 10;
        }
        return true;
    }
}
