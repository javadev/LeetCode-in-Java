package g3001_3100.s3043_find_the_length_of_the_longest_common_prefix;

// #Medium #Array #String #Hash_Table #Trie #2024_02_29_Time_27_ms_(99.94%)_Space_55.6_MB_(78.30%)

public class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Trie trie = new Trie();
        for (int num : arr2) {
            trie.addWord(String.valueOf(num));
        }
        int longest = 0;
        String val;
        for (int num : arr1) {
            val = String.valueOf(num);
            if (val.length() > longest) {
                longest = Math.max(longest, trie.findLongestPrefix(val));
            }
        }
        return longest;
    }

    private static class Trie {
        TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public void addWord(String word) {
            TrieNode first = root;
            int codePoint;
            for (int i = 0; i < word.length(); i++) {
                codePoint = word.charAt(i) - '0';
                if (first.nodes[codePoint] == null) {
                    first.nodes[codePoint] = new TrieNode();
                }
                first = first.nodes[codePoint];
            }
        }

        public int findLongestPrefix(String word) {
            TrieNode first = root;
            int i = 0;
            int codePoint;
            while (i < word.length()) {
                codePoint = word.charAt(i) - '0';
                if (first.nodes[codePoint] == null) {
                    return i;
                }
                first = first.nodes[codePoint];
                i++;
            }
            return i;
        }
    }

    private static class TrieNode {
        TrieNode[] nodes;

        public TrieNode() {
            nodes = new TrieNode[10];
        }
    }
}
