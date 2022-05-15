package g1001_1100.s1018_binary_prefix_divisible_by_5;

// #Easy #Array #Acceptance_47.5% #2022_02_25_Time_3_ms_(84.58%)_Space_49.7_MB_(32.50%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> prefixesDivBy5(int[] a) {
        List<Boolean> result = new ArrayList<>(a.length);
        int remainder = 0;
        for (int j : a) {
            remainder = (j + (remainder << 1)) % 5;
            result.add(remainder == 0);
        }
        return result;
    }
}
