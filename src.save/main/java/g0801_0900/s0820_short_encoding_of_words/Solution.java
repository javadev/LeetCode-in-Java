package g0801_0900.s0820_short_encoding_of_words;

// #Medium #Array #String #Hash_Table #Trie #2022_03_23_Time_35_ms_(49.44%)_Space_57.5_MB_(50.55%)

import java.util.Arrays;

public class Solution {
    private static class Node {
        Node[] nodes = new Node[26];
    }

    private boolean insert(Node node, String word) {
        Node current = node;
        int n = word.length();
        boolean flag = false;
        for (int i = n - 1; i >= 0; i--) {
            if (current.nodes[word.charAt(i) - 'a'] == null) {
                current.nodes[word.charAt(i) - 'a'] = new Node();
                flag = true;
            }
            current = current.nodes[word.charAt(i) - 'a'];
        }
        return flag;
    }

    public int minimumLengthEncoding(String[] words) {
        int out = 0;
        Arrays.sort(words, (a, b) -> b.length() - a.length());
        Node node = new Node();
        for (String word : words) {
            if (insert(node, word)) {
                out = out + word.length() + 1;
            }
        }
        return out;
    }
}
