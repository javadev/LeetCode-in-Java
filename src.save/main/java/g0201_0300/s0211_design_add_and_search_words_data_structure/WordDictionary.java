package g0201_0300.s0211_design_add_and_search_words_data_structure;

// #Medium #String #Depth_First_Search #Design #Trie
// #2023_01_06_Time_308_ms_(99.46%)_Space_284.7_MB_(13.25%)

public class WordDictionary {

    public WordDictionary() {
        // empty constructor
    }

    private static class Node {
        Node[] kids = new Node[26];
        boolean isTerminal;
    }

    private final Node[] root = new Node[26];

    public void addWord(String word) {
        int n = word.length();
        if (root[n] == null) {
            root[n] = new Node();
        }
        Node node = root[n];
        for (int i = 0; i < n; i++) {
            int c = word.charAt(i) - 'a';
            Node kid = node.kids[c];
            if (kid == null) {
                kid = new Node();
                node.kids[c] = kid;
            }
            node = kid;
        }
        node.isTerminal = true;
    }

    public boolean search(String word) {
        Node node = root[word.length()];
        return node != null && dfs(0, node, word);
    }

    private boolean dfs(int i, Node node, String word) {
        int len = word.length();
        if (i == len) {
            return false;
        }
        char c = word.charAt(i);
        if (c == '.') {
            for (Node kid : node.kids) {
                if (kid == null) {
                    continue;
                }
                if (i == len - 1 && kid.isTerminal || dfs(i + 1, kid, word)) {
                    return true;
                }
            }
            return false;
        }
        Node kid = node.kids[c - 'a'];
        if (kid == null) {
            return false;
        }
        if (i == len - 1) {
            return kid.isTerminal;
        }
        return dfs(i + 1, kid, word);
    }
}

/*
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
