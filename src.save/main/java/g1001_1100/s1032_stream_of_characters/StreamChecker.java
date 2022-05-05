package g1001_1100.s1032_stream_of_characters;

// #Hard #Array #String #Design #Trie #Data_Stream
// #2022_02_27_Time_137_ms_(81.54%)_Space_148.2_MB_(53.37%)

public class StreamChecker {
    static class Node {
        Node[] child;
        boolean isEnd;

        Node() {
            child = new Node[26];
        }
    }

    private final StringBuilder sb;
    private final Node root;

    public void insert(String s) {
        Node curr = root;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (curr.child[c - 'a'] == null) {
                curr.child[c - 'a'] = new Node();
            }
            curr = curr.child[c - 'a'];
        }
        curr.isEnd = true;
    }

    public StreamChecker(String[] words) {
        root = new Node();
        sb = new StringBuilder();
        for (String s : words) {
            insert(s);
        }
    }

    public boolean query(char letter) {
        sb.append(letter);
        Node curr = root;
        for (int i = sb.length() - 1; i >= 0; i--) {
            char c = sb.charAt(i);
            if (curr.child[c - 'a'] == null) {
                return false;
            }
            if (curr.child[c - 'a'].isEnd) {
                return true;
            }
            curr = curr.child[c - 'a'];
        }
        return false;
    }
}

/*
 * Your StreamChecker object will be instantiated and called as such:
 * StreamChecker obj = new StreamChecker(words);
 * boolean param_1 = obj.query(letter);
 */
