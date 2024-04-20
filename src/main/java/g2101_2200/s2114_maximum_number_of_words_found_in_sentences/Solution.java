package g2101_2200.s2114_maximum_number_of_words_found_in_sentences;

// #Easy #Array #String #2022_06_01_Time_4_ms_(69.59%)_Space_42.8_MB_(67.52%)

public class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence : sentences) {
            max = Math.max(max, countWords(sentence));
        }
        return max;
    }

    private int countWords(String s) {
        int start = 0;
        int wc = 0;
        while (start < s.length()) {
            int end = start;
            while (end < s.length() && Character.isLetter(s.charAt(end))) {
                end++;
            }
            wc++;
            start = ++end;
        }
        return wc;
    }
}
