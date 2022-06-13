package g2201_2300.s2255_count_prefixes_of_a_given_string;

// #Easy #Array #String #2022_06_12_Time_1_ms_(94.82%)_Space_44.1_MB_(51.71%)

public class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for (String str : words) {
            if (s.indexOf(str) == 0) {
                ++count;
            }
        }
        return count;
    }
}
