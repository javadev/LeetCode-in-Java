package g3101_3200.s3146_permutation_difference_between_two_strings;

// #Easy #String #Hash_Table #2024_05_15_Time_1_ms_(100.00%)_Space_42.4_MB_(84.38%)

import java.util.Arrays;

public class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] res = new int[26];
        Arrays.fill(res, -1);
        int sum = 0;
        for (int i = 0; i < s.length(); ++i) {
            res[s.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < t.length(); ++i) {
            sum += Math.abs(res[t.charAt(i) - 'a'] - i);
        }
        return sum;
    }
}
