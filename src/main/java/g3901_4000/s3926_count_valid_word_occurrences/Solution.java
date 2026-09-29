package g3901_4000.s3926_count_valid_word_occurrences;

// #Medium #Array #String #Hash_Table #Counting #Staff #Weekly_Contest_501
// #2026_09_29_Time_39_ms_(98.70%)_Space_189.00_MB_(5.19%)

public class Solution {
    public int[] countWordOccurrences(String[] chunks, String[] queries) {
        Trie trie = new Trie();
        trie.fill(chunks);
        int n = queries.length;
        int[] result = new int[n];
        for (int k = 0; k < n; k++) {
            result[k] = trie.count(queries[k]);
        }
        return result;
    }

    private static class Trie {
        private final Trie[] children = new Trie[27];
        private int count = 0;

        private void fill(String[] chunks) {
            Trie node = this;
            char last = '@';
            for (int j = 0; j < chunks.length; j++) {
                String chunk = chunks[j];
                for (int k = 0; k < chunk.length(); k++) {
                    char c = processCharacter(chunk, k, j, chunks, last);
                    node = addCharacter(node, c);
                    node = finalizeWordIfNeeded(node, c);
                    last = c;
                }
            }
            incrementCountIfNeeded(node);
        }

        private char processCharacter(
                String chunk, int index, int chunkIndex, String[] chunks, char last) {
            char c = chunk.charAt(index);
            if (c == '-') {
                char next = getNextCharacter(chunk, index, chunkIndex, chunks);
                if (!isLetter(last) || !isLetter(next)) {
                    return '@';
                }
            }
            return c;
        }

        private char getNextCharacter(String chunk, int index, int chunkIndex, String[] chunks) {
            if (index < chunk.length() - 1) {
                return chunk.charAt(index + 1);
            }
            if (chunkIndex < chunks.length - 1) {
                return chunks[chunkIndex + 1].charAt(0);
            }
            return '@';
        }

        private Trie addCharacter(Trie node, char c) {
            if (!isValidCharacter(c)) {
                return node;
            }
            int index = getIndex(c);
            if (node.children[index] == null) {
                node.children[index] = new Trie();
            }
            return node.children[index];
        }

        private Trie finalizeWordIfNeeded(Trie node, char c) {
            if (isValidCharacter(c)) {
                return node;
            }
            incrementCountIfNeeded(node);
            return this;
        }

        private void incrementCountIfNeeded(Trie node) {
            if (node != this) {
                node.count++;
            }
        }

        private static boolean isValidCharacter(char c) {
            return c == '-' || isLetter(c);
        }

        private int count(String s) {
            int n = s.length();
            Trie node = this;
            for (int k = 0; k < n; k++) {
                int i = getIndex(s.charAt(k));
                if (node.children[i] == null) {
                    return 0;
                }
                node = node.children[i];
            }
            return node.count;
        }

        private static int getIndex(char c) {
            return c == '-' ? 26 : c - 'a';
        }

        private static boolean isLetter(char c) {
            return 'a' <= c && c <= 'z';
        }
    }
}
