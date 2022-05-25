package g2001_2100.s2030_smallest_k_length_subsequence_with_occurrences_of_a_letter;

// #Hard #String #Greedy #Stack #Monotonic_Stack
// #2022_05_25_Time_131_ms_(64.46%)_Space_72.3_MB_(46.99%)

public class Solution {
    public String smallestSubsequence(String s, int k, char letter, int repetition) {
        int count = 0;
        for (char c : s.toCharArray()) {
            count += c == letter ? 1 : 0;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); count -= s.charAt(i++) == letter ? 1 : 0) {
            while (sb.length() + s.length() > i + k
                    && sb.length() > 0
                    && s.charAt(i) < sb.charAt(sb.length() - 1)
                    && (sb.charAt(sb.length() - 1) != letter || count != repetition)) {
                repetition += sb.charAt(sb.length() - 1) == letter ? 1 : 0;
                sb.setLength(sb.length() - 1);
            }
            if (k - sb.length() > Math.max(0, s.charAt(i) == letter ? 0 : repetition)) {
                sb.append(s.charAt(i));
                repetition -= s.charAt(i) == letter ? 1 : 0;
            }
        }
        return sb.toString();
    }
}
