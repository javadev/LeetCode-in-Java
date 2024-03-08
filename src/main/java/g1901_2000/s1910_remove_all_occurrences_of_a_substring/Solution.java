package g1901_2000.s1910_remove_all_occurrences_of_a_substring;

// #Medium #String #2022_05_12_Time_11_ms_(39.18%)_Space_44.9_MB_(30.00%)

public class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            if (sb.length() >= part.length()
                    && sb.substring(sb.length() - part.length()).equals(part)) {
                sb.setLength(sb.length() - part.length());
            }
        }
        return sb.toString();
    }
}
