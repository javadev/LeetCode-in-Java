package g2001_2100.s2062_count_vowel_substrings_of_a_string;

// #Easy #String #Hash_Table #2024_03_29_Time_1_ms_(99.82%)_Space_41.5_MB_(72.24%)

public class Solution {
    public int countVowelSubstrings(String word) {
        final int length = word.length();
        boolean[] vows = new boolean[128];
        vows['a'] = true;
        vows['e'] = true;
        vows['i'] = true;
        vows['o'] = true;
        vows['u'] = true;
        int[] counts = new int[128];
        int uniqVows = 0;
        int originalBegin = 0;
        int begin = 0;
        int result = 0;
        for (int i = 0; i < length; i++) {
            char ch = word.charAt(i);
            if (vows[ch]) {
                counts[ch]++;
                if (counts[ch] == 1) {
                    uniqVows++;
                }
                while (uniqVows == 5) {
                    uniqVows -= --counts[word.charAt(begin)] == 0 ? 1 : 0;
                    begin++;
                }
                result += begin - originalBegin;
            } else {
                if (uniqVows != 0) {
                    uniqVows = 0;
                    counts['a'] = 0;
                    counts['e'] = 0;
                    counts['i'] = 0;
                    counts['o'] = 0;
                    counts['u'] = 0;
                }
                originalBegin = begin = i + 1;
            }
        }
        return result;
    }
}
