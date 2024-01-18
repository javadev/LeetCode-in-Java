package g0801_0900.s0824_goat_latin;

// #Easy #String #2022_03_23_Time_2_ms_(94.82%)_Space_42.6_MB_(46.17%)

public class Solution {
    public String toGoatLatin(String sentence) {
        String[] splits = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        StringBuilder a = new StringBuilder();
        for (String word : splits) {
            if (isVowel(word.charAt(0))) {
                sb.append(word).append("ma");
            } else {
                char firstChar = word.charAt(0);
                sb.append(word.substring(1)).append(firstChar).append("ma");
            }
            a.append("a");
            sb.append(a);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E'
                || c == 'I' || c == 'O' || c == 'U';
    }
}
