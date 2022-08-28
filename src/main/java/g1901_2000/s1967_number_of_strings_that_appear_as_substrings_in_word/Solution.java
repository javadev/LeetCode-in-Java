package g1901_2000.s1967_number_of_strings_that_appear_as_substrings_in_word;

// #Easy #String #2022_06_19_Time_1_ms_(82.02%)_Space_42.5_MB_(54.47%)

public class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int res = 0;
        for (String p : patterns) {
            if (word.contains(p)) {
                res++;
            }
        }
        return res;
    }
}
