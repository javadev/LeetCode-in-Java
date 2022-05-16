package g1901_2000.s1941_check_if_all_characters_have_equal_number_of_occurrences;

// #Easy #String #Hash_Table #Counting #2022_05_16_Time_11_ms_(23.73%)_Space_42.6_MB_(36.57%)

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] counts = new int[26];
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            counts[c - 'a']++;
        }
        return Arrays.stream(counts).filter(i -> i != 0).boxed().collect(Collectors.toSet()).size()
                == 1;
    }
}
