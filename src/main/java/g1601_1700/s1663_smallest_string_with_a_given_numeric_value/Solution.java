package g1601_1700.s1663_smallest_string_with_a_given_numeric_value;

// #Medium #String #Greedy #2022_04_23_Time_22_ms_(75.05%)_Space_64.3_MB_(37.20%)

import java.util.Arrays;

public class Solution {
    public String getSmallestString(int n, int k) {
        char[] res = new char[n];
        Arrays.fill(res, 'a');
        k -= n;
        while (k > 0) {
            res[--n] += Math.min(25, k);
            k -= Math.min(25, k);
        }
        return String.valueOf(res);
    }
}
