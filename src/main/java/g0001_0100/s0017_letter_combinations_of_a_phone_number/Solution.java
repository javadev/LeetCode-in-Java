package g0001_0100.s0017_letter_combinations_of_a_phone_number;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #String #Hash_Table #Backtracking

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return Collections.emptyList();
        }
        List<String> words = new ArrayList<>();
        char[] word = new char[digits.length()];
        helper(digits, word, 0, words);
        return words;
    }

    private void helper(String digits, char[] word, int cur, List<String> words) {
        if (cur == digits.length()) {
            words.add(new String(word));
        } else {
            for (char ch : charsForDigit(digits.charAt(cur))) {
                word[cur] = ch;
                helper(digits, word, cur + 1, words);
            }
        }
    }

    private char[] charsForDigit(char digit) {
        switch (digit) {
            case '2':
                return new char[] {'a', 'b', 'c'};
            case '3':
                return new char[] {'d', 'e', 'f'};
            case '4':
                return new char[] {'g', 'h', 'i'};
            case '5':
                return new char[] {'j', 'k', 'l'};
            case '6':
                return new char[] {'m', 'n', 'o'};
            case '7':
                return new char[] {'p', 'q', 'r', 's'};
            case '8':
                return new char[] {'t', 'u', 'v'};
            case '9':
                return new char[] {'w', 'x', 'y', 'z'};
            default:
                return new char[] {};
        }
    }
}
