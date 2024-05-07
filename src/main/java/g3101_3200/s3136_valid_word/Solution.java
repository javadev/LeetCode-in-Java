package g3101_3200.s3136_valid_word;

// #Easy #String #2024_05_07_Time_1_ms_(99.39%)_Space_41.9_MB_(59.69%)

public class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }
        if (word.contains("@") || word.contains("#") || word.contains("$")) {
            return false;
        }
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        char[] consonants = {
            'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v',
            'w', 'x', 'y', 'z', 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q',
            'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'
        };
        boolean flag1 = false;
        boolean flag2 = false;
        for (char c : vowels) {
            if (word.indexOf(c) != -1) {
                flag1 = true;
                break;
            }
        }
        for (char c : consonants) {
            if (word.indexOf(c) != -1) {
                flag2 = true;
                break;
            }
        }
        return flag1 && flag2;
    }
}
