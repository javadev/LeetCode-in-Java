package g0201_0300.s0211_design_add_and_search_words_data_structure;

// #Medium #String #Depth_First_Search #Design #Trie #Acceptance_44.0%
// #2022_03_05_Time_403_ms_(18.89%)_Space_103.7_MB_(18.65%)

public class WordDictionary {

    private static class Node {
        char value;
        boolean isEnd;
        Node[] childs;

        Node(char value) {
            this.value = value;
            this.isEnd = false;
            this.childs = new Node[26];
        }

        Node getChild(char ch) {
            return this.childs[ch - 'a'];
        }

        boolean isChild(char ch) {
            return getChild(ch) != null;
        }

        void addChild(char ch) {
            this.childs[ch - 'a'] = new Node(ch);
        }
    }
    // dummy value
    private Node root = new Node('a');

    public WordDictionary() {
        // empty constructor
    }

    public void addWord(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!node.isChild(ch)) {
                node.addChild(ch);
            }
            node = node.getChild(ch);
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        return dfs(this.root, word, 0);
    }

    public boolean dfs(Node root, String word, int index) {
        if (root == null) {
            return false;
        }
        // if reached end of word
        if (index == word.length()) {
            return root.isEnd;
        }
        char ch = word.charAt(index);
        if (ch == '.') {
            for (Node child : root.childs) {
                boolean found = dfs(child, word, index + 1);
                if (found) {
                    return true;
                }
            }
            return false;
        }
        if (!root.isChild(ch)) {
            return false;
        }
        return dfs(root.getChild(ch), word, index + 1);
    }
}

/*
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
