package g0501_0600.s0524_longest_word_in_dictionary_through_deleting;

// #Medium #Array #String #Sorting #Two_Pointers

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private static class Pair {
        public String word;
        public int index;

        public Pair(String word, int index) {
            this.index = index;
            this.word = word;
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
            if (map.get(s.charAt(i)).size() > 0) {
                Deque<Pair> deque = map.get(s.charAt(i));
                int size = deque.size();
                for (int j = 0; j < size; j++) {
                    Pair pair = deque.pollLast();
                    assert pair != null;
                    if (pair.index == pair.word.length() - 1) {
                        if (maxLen < pair.word.length()) {
                            maxLen = pair.word.length();
                            res = pair.word;
                        } else if (maxLen == pair.word.length()) {
                            if (res.compareTo(pair.word) > 0) {
                                res = pair.word;
                            }
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
