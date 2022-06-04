package g2101_2200.s2135_count_words_obtained_after_adding_a_letter;

// #Medium #Array #String #Hash_Table #Sorting #Bit_Manipulation
// #2022_06_04_Time_67_ms_(93.08%)_Space_63.2_MB_(89.53%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    private Set<Integer> set;

    private void preprocess(String[] words) {
        set = new HashSet<>();
        for (String word : words) {
            int bitMap = getBitMap(word);
            set.add(bitMap);
        }
    }

    private boolean matches(int bitMap) {
        return set.contains(bitMap);
    }

    private int getBitMap(String word) {
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            int position = word.charAt(i) - 'a';
            result |= (1 << position);
        }
        return result;
    }

    private int addBit(int bitMap, char c) {
        int position = c - 'a';
        bitMap |= (1 << position);
        return bitMap;
    }

    private int removeBit(int bitMap, char c) {
        int position = c - 'a';
        bitMap &= ~(1 << position);
        return bitMap;
    }

    public int wordCount(String[] startWords, String[] targetWords) {
        if (startWords == null || startWords.length == 0) {
            return 0;
        }
        if (targetWords == null || targetWords.length == 0) {
            return 0;
        }
        preprocess(startWords);
        int count = 0;
        for (String word : targetWords) {
            int bitMap = getBitMap(word);
            for (int i = 0; i < word.length(); i++) {
                bitMap = removeBit(bitMap, word.charAt(i));
                if (i > 0) {
                    bitMap = addBit(bitMap, word.charAt(i - 1));
                }
                if (matches(bitMap)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
