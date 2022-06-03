package g2101_2200.s2131_longest_palindrome_by_concatenating_two_letter_words;

// #Medium #Array #String #Hash_Table #Greedy #Counting
// #2022_06_03_Time_73_ms_(76.60%)_Space_104.8_MB_(58.28%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> counter = new HashMap<>();
        for (String word : words) counter.put(word, counter.getOrDefault(word, 0) + 1);
        int pairPalindrome = 0;
        int selfPalindrome = 0;
        for (String word : counter.keySet()) {
            if (isPalindrome(word)) {
                int count = counter.get(word);
                if (count % 2 == 1 && selfPalindrome % 2 == 0) {
                    selfPalindrome += count;
                } else {
                    selfPalindrome += count - count % 2;
                }
            } else {
                String palindrome = palindrome(word);
                Integer count = counter.get(palindrome);
                if (count != null) {
                    pairPalindrome += Math.min(count, counter.get(word));
                }
            }
        }
        return 2 * (selfPalindrome + pairPalindrome);
    }

    private boolean isPalindrome(String word) {
        return word.charAt(1) == word.charAt(0);
    }

    private String palindrome(String word) {
        return String.valueOf(new char[] {word.charAt(1), word.charAt(0)});
    }
}
