package g2501_2600.s2586_count_the_number_of_vowel_strings_in_range;

// #Easy #Array #String #2023_08_22_Time_1_ms_(100.00%)_Space_43.1_MB_(79.90%)

public class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))) {
                count++;
            }
        }
        return count;
    }

    private boolean isVowel(char ch) {
        String str = "aeiou";
        return str.indexOf(ch) != -1;
    }
}
