package g3401_3500.s3485_longest_common_prefix_of_k_strings_after_removal;

// #Hard #2025_03_16_Time_390_ms_(100.00%)_Space_75.60_MB_(100.00%)

public class Solution {
    private static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        int count = 0;
        int bestPrefixLength = -1;
    }

    private TrieNode root;

    public int[] longestCommonPrefix(String[] words, int k) {
        int totalWords = words.length;
        int[] result = new int[totalWords];
        if (totalWords - 1 < k) {
            return result;
        }
        root = new TrieNode();
        for (String word : words) {
            // insert the word with increasing the count by 1 (prefix count)
            updateTrie(word, 1, k);
        }
        for (int i = 0; i < totalWords; i++) {
            // temp deletion of the word with count decreased by 1
            updateTrie(words[i], -1, k);
            result[i] = root.bestPrefixLength;
            // re-insertion of the word
            updateTrie(words[i], 1, k);
        }
        return result;
    }

    private void updateTrie(String word, int count, int k) {
        int wordLength = word.length();
        // used to store the path used during trie travesal to update the count and use the count
        TrieNode[] nodePath = new TrieNode[wordLength + 1];
        int[] depths = new int[wordLength + 1];
        nodePath[0] = root;
        depths[0] = 0;
        // trie insertion
        for (int i = 0; i < wordLength; i++) {
            int letterIndex = word.charAt(i) - 'a';
            if (nodePath[i].children[letterIndex] == null) {
                nodePath[i].children[letterIndex] = new TrieNode();
            }
            nodePath[i + 1] = nodePath[i].children[letterIndex];
            depths[i + 1] = depths[i] + 1;
        }
        // increase the count of each prefix
        for (TrieNode node : nodePath) {
            node.count += count;
        }
        // find the best prefix
        for (int i = nodePath.length - 1; i >= 0; i--) {
            TrieNode currentNode = nodePath[i];
            int candidate = (currentNode.count >= k ? depths[i] : -1);
            for (TrieNode childNode : currentNode.children) {
                if (childNode != null) {
                    candidate = Math.max(candidate, childNode.bestPrefixLength);
                }
            }
            currentNode.bestPrefixLength = candidate;
        }
    }
}
