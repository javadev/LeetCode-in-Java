package g0801_0900.s0824_goat_latin;

// #Easy #String

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
                sb.append(word.substring(1, word.length())).append(firstChar).append("ma");
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
