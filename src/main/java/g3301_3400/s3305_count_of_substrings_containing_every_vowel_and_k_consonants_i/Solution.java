package g3301_3400.s3305_count_of_substrings_containing_every_vowel_and_k_consonants_i;

// #Medium #2024_09_30_Time_1998_ms_(100.00%)_Space_45.5_MB_(50.00%)

import java.util.HashSet;

public class Solution {
    public int countOfSubstrings(String word, int k) {
        int possibleSubstring = 0;
        HashSet<Character> vowelContainer = new HashSet<>();
        String vowel = "aeiou";
        for (char ch : vowel.toCharArray()) {
            vowelContainer.add(ch);
        }
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                if (checkValid(word, i, j, vowelContainer, k)) {
                    possibleSubstring++;
                }
            }
        }
        return possibleSubstring;
    }

    private boolean checkValid(
            String word, int start, int end, HashSet<Character> vowelContainer, int limit) {
        HashSet<Character> duplicateCheck = new HashSet<>();
        int consonants = 0;
        for (int i = start; i <= end; i++) {
            if (!vowelContainer.contains(word.charAt(i))) {
                consonants++;
            } else {
                duplicateCheck.add(word.charAt(i));
            }
        }
        return duplicateCheck.size() == 5 && consonants == limit;
    }
}
