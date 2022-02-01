package g0701_0800.s0745_prefix_and_suffix_search;

// #Hard #String #Design #Trie

public class WordFilter {

    TrieNode root = new TrieNode();

    public WordFilter(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            for (int j = 0; j < s.length(); j++) {
                insert(s.substring(j) + '{' + s, i);
            }
        }
    }

    public void insert(String wd, int weight) {
        TrieNode node = root;
        for (char ch : wd.toCharArray()) {
            if (node.children[ch - 'a'] == null) {
                node.children[ch - 'a'] = new TrieNode();
            }
            node = node.children[ch - 'a'];
            node.weight = weight;
        }
    }

    public int f(String prefix, String suffix) {
        return startsWith(suffix + '{' + prefix);
    }

    public int startsWith(String pref) {
        TrieNode node = root;
        for (char ch : pref.toCharArray()) {
            if (node.children[ch - 'a'] == null) {
                return -1;
            }
            node = node.children[ch - 'a'];
        }
        return node.weight;
    }
}
