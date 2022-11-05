package g0701_0800.s0720_longest_word_in_dictionary;

// #Medium #Array #String #Hash_Table #Sorting #Trie
// #2022_03_24_Time_13_ms_(84.66%)_Space_53.7_MB_(38.25%)

public class Solution {
    private final Node root = new Node();
    private String longestWord = "";

    private static class Node {
        Node[] children;
        String str;

        public Node() {
            this.children = new Node[26];
            this.str = null;
        }

        public void insert(Node curr, String word) {
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (curr.children[ch - 'a'] == null) {
                    curr.children[ch - 'a'] = new Node();
                }
                curr = curr.children[ch - 'a'];
            }
            curr.str = word;
        }
    }

    public String longestWord(String[] words) {
        for (String word : words) {
            root.insert(root, word);
        }
        dfs(root);
        return longestWord;
    }

    private void dfs(Node curr) {
        for (int i = 0; i < 26; i++) {
            if (curr.children[i] != null && curr.children[i].str != null) {
                if (curr.children[i].str.length() > longestWord.length()) {
                    longestWord = curr.children[i].str;
                }
                dfs(curr.children[i]);
            }
        }
    }
}
