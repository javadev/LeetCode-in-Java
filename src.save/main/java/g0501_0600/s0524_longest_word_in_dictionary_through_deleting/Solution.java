package g0501_0600.s0524_longest_word_in_dictionary_through_deleting;

// #Medium #Array #String #Sorting #Two_Pointers
// #2022_07_28_Time_19_ms_(89.67%)_Space_51.3_MB_(53.71%)

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private static class Pair {
        private String word;
        private int index;

        public Pair(String word, int index) {
            this.index = index;
            this.word = word;
        }

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }
    }

    public String findLongestWord(String s, List<String> dictionary) {
        Map<Character, Deque<Pair>> map = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            map.put(c, new ArrayDeque<>());
        }

        for (String word : dictionary) {
            map.get(word.charAt(0)).offerFirst(new Pair(word, 0));
        }
        int maxLen = 0;
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (!map.get(s.charAt(i)).isEmpty()) {
                Deque<Pair> deque = map.get(s.charAt(i));
                int size = deque.size();
                for (int j = 0; j < size; j++) {
                    Pair pair = deque.pollLast();
                    assert pair != null;
                    if (pair.index == pair.word.length() - 1) {
                        if (maxLen < pair.word.length()) {
                            maxLen = pair.word.length();
                            res = pair.word;
                        } else if (maxLen == pair.word.length() && res.compareTo(pair.word) > 0) {
                            res = pair.word;
                        }
                    } else {
                        pair.index++;
                        map.get(pair.word.charAt(pair.index)).offerFirst(pair);
                    }
                }
            }
        }
        return res;
    }
}
