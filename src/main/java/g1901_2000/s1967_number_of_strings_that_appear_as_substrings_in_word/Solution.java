package g1901_2000.s1967_number_of_strings_that_appear_as_substrings_in_word;

// #Easy #String #2022_05_21_Time_3_ms_(10.82%)_Space_42.7_MB_(41.34%)

import java.util.Arrays;

public class Solution {
    public int numOfStrings(String[] patterns, String word) {
        return (int) Arrays.stream(patterns).filter(p -> word.indexOf(p) != -1).count();
    }
}
