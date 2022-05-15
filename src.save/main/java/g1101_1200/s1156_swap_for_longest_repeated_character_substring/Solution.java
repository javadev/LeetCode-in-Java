package g1101_1200.s1156_swap_for_longest_repeated_character_substring;

// #Medium #String #Sliding_Window #Acceptance_46.1%
// #2022_05_05_Time_12_ms_(47.37%)_Space_44.1_MB_(22.11%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private static class Pair {
        public char character;
        public int count;

        public Pair(char c, int count) {
            this.character = c;
            this.count = count;
        }
    }

    public int maxRepOpt1(String text) {
        List<Pair> pairs = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        // collect counts for each char-block
        for (int i = 0; i < text.length(); ) {
            char c = text.charAt(i);
            int count = 0;
            while (i < text.length() && text.charAt(i) == c) {
                count++;
                i++;
            }
            pairs.add(new Pair(c, count));
            map.put(c, map.getOrDefault(c, 0) + count);
        }
        int max = 0;
        // case 1, swap 1 item to the boundary of a consecutive cha-block to achieve possible max
        // length
        // we need total count to make sure whether a swap is possible!
        for (Pair p : pairs) {
            int totalCount = map.get(p.character);
            if (totalCount > p.count) {
                max = Math.max(max, p.count + 1);
            } else {
                max = Math.max(max, p.count);
            }
        }
        // case 2, find xxxxYxxxxx pattern
        // we need total count to make sure whether a swap is possible!
        for (int i = 1; i < pairs.size() - 1; i++) {
            if (pairs.get(i - 1).character == pairs.get(i + 1).character
                    && pairs.get(i).count == 1) {
                int totalCount = map.get(pairs.get(i - 1).character);
                int groupSum = pairs.get(i - 1).count + pairs.get(i + 1).count;
                if (totalCount > groupSum) {
                    max = Math.max(max, groupSum + 1);
                } else {
                    max = Math.max(max, groupSum);
                }
            }
        }
        return max;
    }
}
