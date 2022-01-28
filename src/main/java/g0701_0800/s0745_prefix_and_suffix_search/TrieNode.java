package g0701_0800.s0745_prefix_and_suffix_search;

@SuppressWarnings("java:S1104")
class TrieNode {
    public TrieNode[] children;
    public int weight;

    TrieNode() {
        this.children = new TrieNode[27];
        this.weight = 0;
    }
}
