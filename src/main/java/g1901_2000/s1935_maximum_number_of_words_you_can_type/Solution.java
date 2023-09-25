package g1901_2000.s1935_maximum_number_of_words_you_can_type;

// #Easy #String #Hash_Table #2022_05_15_Time_2_ms_(95.06%)_Space_42.6_MB_(61.20%)

public class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count = 0;
        for (String word : words) {
            boolean broken = false;
            for (char c : word.toCharArray()) {
                if (brokenLetters.indexOf(c) != -1) {
                    broken = true;
                    break;
                }
            }
            if (!broken) {
                count++;
            }
        }
        return count;
    }
}
