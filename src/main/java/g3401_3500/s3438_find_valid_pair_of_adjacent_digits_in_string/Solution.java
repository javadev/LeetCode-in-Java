package g3401_3500.s3438_find_valid_pair_of_adjacent_digits_in_string;

// #Easy #String #Hash_Table #Counting #2025_02_04_Time_1_(100.00%)_Space_42.83_(94.06%)

import java.util.Arrays;

public class Solution {
    String findValidPair(String s) {
        int[] t = new int[26];
        Arrays.fill(t, 0);
        for (int i = 0; i < s.length(); ++i) {
            t[s.charAt(i) - '0']++;
        }
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i - 1) == s.charAt(i)
                    || t[s.charAt(i - 1) - '0'] != s.charAt(i - 1) - '0'
                    || t[s.charAt(i) - '0'] != s.charAt(i) - '0') {
                continue;
            }
            return s.substring(i - 1, i + 1);
        }
        return "";
    }
}
