package g1301_1400.s1347_minimum_number_of_steps_to_make_two_strings_anagram;

// #Medium #String #Hash_Table #Counting #2022_03_21_Time_13_ms_(76.34%)_Space_54.6_MB_(41.61%)

import java.util.Arrays;

public class Solution {
    public int minSteps(String s, String t) {
        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            if (counts[c - 'a'] > 0) {
                counts[c - 'a']--;
            }
        }
        return Arrays.stream(counts).sum();
    }
}
