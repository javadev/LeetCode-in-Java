package g2401_2500.s2490_circular_sentence;

// #Easy #String #2023_01_27_Time_1_ms_(99.85%)_Space_42.6_MB_(55.63%)

public class Solution {
    public boolean isCircularSentence(String sentence) {
        char[] letters = sentence.toCharArray();
        int len = letters.length;
        for (int i = 0; i < len - 1; ++i) {
            if (letters[i] == ' ' && letters[i - 1] != letters[i + 1]) {
                return false;
            }
        }
        return letters[0] == letters[len - 1];
    }
}
