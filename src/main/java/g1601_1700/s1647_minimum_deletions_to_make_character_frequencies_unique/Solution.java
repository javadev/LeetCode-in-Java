package g1601_1700.s1647_minimum_deletions_to_make_character_frequencies_unique;

// #Medium #String #Sorting #Greedy #2022_04_22_Time_8_ms_(100.00%)_Space_43.2_MB_(81.09%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int minDeletions(String s) {
        int cnt = 0;
        int[] freq = new int[26];
        Set<Integer> seen = new HashSet<>();
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0 && seen.contains(freq[i])) {
                freq[i]--;
                cnt++;
            }
            seen.add(freq[i]);
        }
        return cnt;
    }
}
