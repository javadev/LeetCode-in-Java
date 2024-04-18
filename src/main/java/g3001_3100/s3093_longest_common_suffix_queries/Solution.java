package g3001_3100.s3093_longest_common_suffix_queries;

// #Hard #Array #String #Trie #2024_04_18_Time_39_ms_(93.67%)_Space_160.9_MB_(66.40%)

public class Solution {
    public int[] stringIndices(String[] wc, String[] wq) {
        int minLength = wc[0].length();
        int minIndex = 0;
        int n = wc.length;
        int m = wq.length;
        for (int i = 0; i < n; i++) {
            if (minLength > wc[i].length()) {
                minLength = wc[i].length();
                minIndex = i;
            }
        }
        Trie root = new Trie(minIndex);
        for (int i = 0; i < n; i++) {
            Trie curr = root;
            for (int j = wc[i].length() - 1; j >= 0; j--) {
                char ch = wc[i].charAt(j);
                if (curr.has(ch)) {
                    Trie next = curr.get(ch);
                    if (wc[next.index].length() > wc[i].length()) {
                        next.index = i;
                    }
                    curr = next;
                } else {
                    curr.put(ch, i);
                    curr = curr.get(ch);
                }
            }
        }
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            Trie curr = root;
            for (int j = wq[i].length() - 1; j >= 0; j--) {
                char ch = wq[i].charAt(j);
                if (curr.has(ch)) {
                    curr = curr.get(ch);
                } else {
                    break;
                }
            }
            ans[i] = curr.index;
        }

        return ans;
    }

    private static class Trie {
        Trie[] ch;
        int index;

        Trie(int index) {
            this.ch = new Trie[26];
            this.index = index;
        }

        Trie get(char ch) {
            return this.ch[ch - 'a'];
        }

        boolean has(char ch) {
            return this.ch[ch - 'a'] != null;
        }

        void put(char ch, int index) {
            this.ch[ch - 'a'] = new Trie(index);
        }
    }
}
