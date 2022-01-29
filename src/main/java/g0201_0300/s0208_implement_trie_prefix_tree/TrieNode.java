package g0201_0300.s0208_implement_trie_prefix_tree;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #String #Hash_Table #Design #Trie

@SuppressWarnings("java:S1104")
public class TrieNode {
    // Initialize your data structure here.
    public TrieNode[] children;
    public boolean isWord;

    public TrieNode() {
        children = new TrieNode[26];
    }
}
