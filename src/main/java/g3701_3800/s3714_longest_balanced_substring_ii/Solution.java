package g3701_3800.s3714_longest_balanced_substring_ii;

// #Medium #String #Hash_Table #Prefix_Sum #Weekly_Contest_471
// #2025_10_14_Time_208_ms_(97.43%)_Space_63.96_MB_(74.30%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static final char[] CHARS = {'a', 'b', 'c'};
    private static final long OFFSET = 100001L;
    private static final long MULTIPLIER = 200003L;

    public int longestBalanced(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int maxSameChar = findLongestSameCharSequence(s);
        int maxTwoChars = findLongestTwoCharBalanced(s);
        int maxThreeChars = findLongestThreeCharBalanced(s);
        return Math.max(maxSameChar, Math.max(maxTwoChars, maxThreeChars));
    }

    private int findLongestSameCharSequence(String s) {
        int maxLength = 1;
        int currentLength = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }
        return Math.max(maxLength, currentLength);
    }

    private int findLongestTwoCharBalanced(String s) {
        int maxLength = 0;
        for (int p = 0; p < CHARS.length; p++) {
            char firstChar = CHARS[p];
            char secondChar = CHARS[(p + 1) % CHARS.length];
            char excludedChar = CHARS[(p + 2) % CHARS.length];
            maxLength =
                    Math.max(
                            maxLength,
                            findBalancedInSegments(s, firstChar, secondChar, excludedChar));
        }
        return maxLength;
    }

    private int findBalancedInSegments(
            String s, char firstChar, char secondChar, char excludedChar) {
        int maxLength = 0;
        int index = 0;
        while (index < s.length()) {
            if (s.charAt(index) == excludedChar) {
                index++;
                continue;
            }
            int segmentStart = index;
            while (index < s.length() && s.charAt(index) != excludedChar) {
                index++;
            }
            int segmentEnd = index;
            if (segmentEnd - segmentStart >= 2) {
                maxLength =
                        Math.max(
                                maxLength,
                                findBalancedInRange(
                                        s, segmentStart, segmentEnd, firstChar, secondChar));
            }
        }
        return maxLength;
    }

    private int findBalancedInRange(String s, int start, int end, char firstChar, char secondChar) {
        Map<Integer, Integer> differenceMap = new HashMap<>();
        differenceMap.put(0, 0);

        int difference = 0;
        int maxLength = 0;

        for (int i = start; i < end; i++) {
            char currentChar = s.charAt(i);

            if (currentChar == firstChar) {
                difference++;
            } else if (currentChar == secondChar) {
                difference--;
            }

            int position = i - start + 1;

            if (differenceMap.containsKey(difference)) {
                maxLength = Math.max(maxLength, position - differenceMap.get(difference));
            } else {
                differenceMap.put(difference, position);
            }
        }
        return maxLength;
    }

    private int findLongestThreeCharBalanced(String s) {
        Map<Long, Integer> stateMap = new HashMap<>();
        int diff1 = 0;
        int diff2 = 0;
        stateMap.put(encodeState(diff1, diff2), 0);
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            switch (currentChar) {
                case 'a':
                    diff1++;
                    diff2++;
                    break;
                case 'b':
                    diff1--;
                    break;
                case 'c':
                    diff2--;
                    break;
                default:
                    break;
            }

            long stateKey = encodeState(diff1, diff2);

            if (stateMap.containsKey(stateKey)) {
                maxLength = Math.max(maxLength, (i + 1) - stateMap.get(stateKey));
            } else {
                stateMap.put(stateKey, i + 1);
            }
        }

        return maxLength;
    }

    /** Encodes two differences into a single long key for HashMap. */
    private long encodeState(int diff1, int diff2) {
        return (diff1 + OFFSET) * MULTIPLIER + (diff2 + OFFSET);
    }
}
