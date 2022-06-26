package g1801_1900.s1816_truncate_sentence;

// #Easy #Array #String #2022_05_03_Time_2_ms_(65.71%)_Space_42.9_MB_(30.34%)

public class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.substring(0, sb.toString().length() - 1);
    }
}
