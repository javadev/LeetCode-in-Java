package g2101_2200.s2185_counting_words_with_a_given_prefix;

// #Easy #Array #String #2022_06_08_Time_0_ms_(100.00%)_Space_43.9_MB_(15.40%)

public class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String s : words) {
            if (s.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
}
