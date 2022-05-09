package g1901_2000.s2000_reverse_prefix_of_word;

// #Easy #String #Two_Pointers #2022_05_09_Time_1_ms_(75.76%)_Space_42.6_MB_(28.07%)

public class Solution {
    public String reversePrefix(String word, char ch) {
        String temp = Character.toString(ch);
        StringBuilder sb = new StringBuilder();
        if (!word.contains(temp)) {
            return word;
        }
        for (int i = word.indexOf(ch); i >= 0; i--) {
            sb.append(word.charAt(i));
        }
        for (int i = word.indexOf(ch) + 1; i < word.length(); i++) {
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
}
