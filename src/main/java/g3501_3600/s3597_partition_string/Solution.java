package g3501_3600.s3597_partition_string;

// #Medium #2025_06_29_Time_27_ms_(99.70%)_Space_57.45_MB_(6.81%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static class Trie {
        public Trie[] trie = new Trie[26];
    }

    public List<String> partitionString(String s) {
        var trie = new Trie();
        var res = new ArrayList<String>();
        var node = trie;
        for (int i = 0, j = 0; i < s.length() && j < s.length(); ) {
            int idx = s.charAt(j) - 'a';
            if (node.trie[idx] == null) {
                res.add(s.substring(i, j + 1));
                node.trie[idx] = new Trie();
                i = j + 1;
                j = i;
                node = trie;
                continue;
            } else {
                node = node.trie[idx];
                j++;
            }
        }
        return res;
    }
}
