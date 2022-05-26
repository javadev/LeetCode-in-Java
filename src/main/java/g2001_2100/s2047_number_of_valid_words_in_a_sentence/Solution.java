package g2001_2100.s2047_number_of_valid_words_in_a_sentence;

// #Easy #String #2022_05_26_Time_19_ms_(42.57%)_Space_44.9_MB_(37.62%)

@SuppressWarnings("java:S135")
public class Solution {
    public int countValidWords(String sentence) {
        String[] tokens = sentence.split("\\s+");
        int count = 0;
        for (String token : tokens) {
            int hyphenCount = 0;
            int punctuationMarkCount = 0;
            boolean valid = true;
            if (token.isEmpty() || token.equals("")) {
                continue;
            }
            for (int i = 0; i < token.length(); i++) {
                if (token.charAt(i) == '-') {
                    hyphenCount++;
                    if (hyphenCount > 1
                            || i == 0
                            || i == token.length() - 1
                            || !Character.isAlphabetic(token.charAt(i - 1))
                            || !Character.isAlphabetic(token.charAt(i + 1))) {
                        valid = false;
                        break;
                    }
                } else if (token.charAt(i) == '!'
                        || token.charAt(i) == '.'
                        || token.charAt(i) == ',') {
                    punctuationMarkCount++;
                    if (punctuationMarkCount > 1 || i != token.length() - 1) {
                        valid = false;
                        break;
                    }
                } else if (Character.isDigit(token.charAt(i))) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                count++;
            }
        }
        return count;
    }
}
