package g3501_3600.s3557_find_maximum_number_of_non_intersecting_substrings;

// #Medium #String #Hash_Table #Dynamic_Programming #Greedy
// #2025_05_27_Time_15_ms_(84.54%)_Space_45.82_MB_(91.39%)

import java.util.Arrays;

public class Solution {
    public int maxSubstrings(String s) {
        int[] prev = new int[26];
        int r = 0;
        Arrays.fill(prev, -1);
        for (int i = 0; i < s.length(); ++i) {
            int j = s.charAt(i) - 'a';
            if (prev[j] != -1 && i - prev[j] + 1 >= 4) {
                ++r;
                Arrays.fill(prev, -1);
            } else if (prev[j] == -1) {
                prev[j] = i;
            }
        }
        return r;
    }
}
