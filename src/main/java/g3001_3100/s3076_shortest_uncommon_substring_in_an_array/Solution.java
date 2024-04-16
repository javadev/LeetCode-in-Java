package g3001_3100.s3076_shortest_uncommon_substring_in_an_array;

// #Medium #Array #String #Hash_Table #Trie #2024_04_16_Time_9_ms_(99.97%)_Space_45.8_MB_(39.57%)

public class Solution {
    private final Trie root = new Trie();

    public String[] shortestSubstrings(String[] arr) {
        int n = arr.length;
        for (int k = 0; k < n; ++k) {
            String s = arr[k];
            char[] cs = s.toCharArray();
            int m = cs.length;
            for (int i = 0; i < m; ++i) {
                insert(cs, i, m, k);
            }
        }
        String[] ans = new String[n];
        for (int k = 0; k < n; ++k) {
            String s = arr[k];
            char[] cs = s.toCharArray();
            int m = cs.length;
            String result = "";
            int resultLen = m + 1;
            for (int i = 0; i < m; ++i) {
                int curLen = search(cs, i, Math.min(m, i + resultLen), k);
                if (curLen != -1) {
                    String sub = new String(cs, i, curLen);
                    if (curLen < resultLen || result.compareTo(sub) > 0) {
                        result = sub;
                        resultLen = curLen;
                    }
                }
            }
            ans[k] = result;
        }
        return ans;
    }

    private void insert(char[] cs, int start, int end, int wordIndex) {
        Trie curr = root;
        for (int i = start; i < end; ++i) {
            int index = cs[i] - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new Trie();
            }
            curr = curr.children[index];
            if (curr.wordIndex == -1 || curr.wordIndex == wordIndex) {
                curr.wordIndex = wordIndex;
            } else {
                curr.wordIndex = -2;
            }
        }
    }

    private int search(char[] cs, int start, int end, int wordIndex) {
        Trie cur = root;
        for (int i = start; i < end; i++) {
            int index = cs[i] - 'a';
            cur = cur.children[index];
            if (cur.wordIndex == wordIndex) {
                return i - start + 1;
            }
        }
        return -1;
    }

    private static class Trie {
        Trie[] children;
        int wordIndex;

        public Trie() {
            children = new Trie[26];
            wordIndex = -1;
        }
    }
}
