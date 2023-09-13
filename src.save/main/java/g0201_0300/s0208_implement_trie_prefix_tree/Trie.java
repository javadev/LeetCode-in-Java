package g0201_0300.s0208_implement_trie_prefix_tree;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #String #Hash_Table #Design #Trie
// #Level_2_Day_16_Design #Udemy_Trie_and_Heap
// #Big_O_Time_O(word.length())_or_O(prefix.length())_Space_O(N)
// #2022_06_28_Time_34_ms_(99.90%)_Space_51_MB_(94.92%)

@SuppressWarnings("java:S1104")
public class Trie {
    private TrieNode root;
    private boolean startWith;

    private static class TrieNode {
        // Initialize your data structure here.
        public TrieNode[] children;
        public boolean isWord;

        public TrieNode() {
            children = new TrieNode[26];
        }
    }

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        insert(word, root, 0);
    }

    private void insert(String word, TrieNode root, int idx) {
        if (idx == word.length()) {
            root.isWord = true;
            return;
        }
        int index = word.charAt(idx) - 'a';
        if (root.children[index] == null) {
            root.children[index] = new TrieNode();
        }
        insert(word, root.children[index], idx + 1);
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        return search(word, root, 0);
    }

    public boolean search(String word, TrieNode root, int idx) {
        if (idx == word.length()) {
            startWith = true;
            return root.isWord;
        }
        int index = word.charAt(idx) - 'a';
        if (root.children[index] == null) {
            startWith = false;
            return false;
        }
        return search(word, root.children[index], idx + 1);
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        search(prefix);
        return startWith;
    }
}
