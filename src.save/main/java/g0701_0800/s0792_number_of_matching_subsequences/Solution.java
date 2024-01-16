package g0701_0800.s0792_number_of_matching_subsequences;

// #Medium #String #Hash_Table #Sorting #Trie #2022_03_26_Time_92_ms_(84.26%)_Space_118_MB_(25.03%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        List<Node>[] buckets = new ArrayList[26];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
        for (String word : words) {
            char start = word.charAt(0);
            buckets[start - 'a'].add(new Node(word, 0));
        }
        int result = 0;
        for (char c : s.toCharArray()) {
            List<Node> currBucket = buckets[c - 'a'];
            buckets[c - 'a'] = new ArrayList<>();
            for (Node node : currBucket) {
                node.index++;
                if (node.index == node.word.length()) {
                    result++;
                } else {
                    char start = node.word.charAt(node.index);
                    buckets[start - 'a'].add(node);
                }
            }
        }
        return result;
    }

    private static class Node {
        String word;
        int index;

        public Node(String word, int index) {
            this.word = word;
            this.index = index;
        }
    }
}
