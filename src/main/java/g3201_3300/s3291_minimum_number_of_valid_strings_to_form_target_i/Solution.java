package g3201_3300.s3291_minimum_number_of_valid_strings_to_form_target_i;

// #Medium #Array #String #Dynamic_Programming #Binary_Search #Trie #Segment_Tree #Hash_Function
// #String_Matching #Rolling_Hash #2024_09_16_Time_263_ms_(60.00%)_Space_56.9_MB_(20.00%)

public class Solution {
    public int minValidStrings(String[] words, String target) {
        TrieNode root = new TrieNode();
        for (String word : words) {
            insert(root, word);
        }
        int n = target.length();
        int[] dp = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = Integer.MAX_VALUE;
            TrieNode node = root;
            for (int j = i; j < n; j++) {
                int idx = target.charAt(j) - 'a';
                if (node.children[idx] == null) {
                    break;
                }
                if (j == n - 1) {
                    dp[i] = 1;
                } else if (dp[j + 1] >= 0) {
                    dp[i] = Math.min(dp[i], 1 + dp[j + 1]);
                }
                node = node.children[idx];
            }
            if (dp[i] == Integer.MAX_VALUE) {
                dp[i] = -1;
            }
        }
        return dp[0];
    }

    private void insert(TrieNode root, String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            if (node.children[c - 'a'] == null) {
                node.children[c - 'a'] = new TrieNode();
            }
            node = node.children[c - 'a'];
        }
    }

    private static class TrieNode {
        TrieNode[] children = new TrieNode[26];
    }
}
