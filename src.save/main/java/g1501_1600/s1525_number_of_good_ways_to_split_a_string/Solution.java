package g1501_1600.s1525_number_of_good_ways_to_split_a_string;

// #Medium #String #Dynamic_Programming #Bit_Manipulation
// #2022_04_09_Time_19_ms_(69.66%)_Space_48_MB_(46.20%)

import java.util.HashSet;

public class Solution {
    public int numSplits(String s) {
        HashSet<Character> hs = new HashSet<>();
        int[] dp1 = new int[s.length() - 1];
        int[] dp2 = new int[s.length() - 1];
        for (int i = 0; i < s.length() - 1; i++) {
            char ch = s.charAt(i);
            hs.add(ch);
            dp1[i] = hs.size();
        }
        HashSet<Character> hm = new HashSet<>();
        for (int i = s.length() - 1; i > 0; i--) {
            char ch = s.charAt(i);
            hm.add(ch);
            dp2[i - 1] = hm.size();
        }
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (dp1[i] == dp2[i]) {
                count++;
            }
        }
        return count;
    }
}
