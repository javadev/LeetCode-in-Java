package g0201_0300.s0212_word_search_ii;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    private Tree root;

    public List<String> findWords(char[][] board, String[] words) {
        if (board.length < 1 || board[0].length < 1) {
            return Collections.emptyList();
        }
        root = new Tree();
        for (String word : words) {
            Tree.addWord(root, word);
        }
        List<String> collected = new ArrayList<>();
        for (int i = 0; i != board.length; ++i) {
            for (int j = 0; j != board[0].length; ++j) {
                dfs(board, i, j, root, collected);
            }
        }
        return collected;
    }

    private void dfs(char[][] board, int i, int j, Tree cur, List<String> collected) {
        char c = board[i][j];
        if (c == '-') {
            return;
        }
        cur = cur.getChild(c);
        if (cur == null) {
            return;
        }
        if (cur.end != null) {
            String s = cur.end;
            collected.add(s);
            cur.end = null;
            if (cur.len() == 0) {
                Tree.deleteWord(root, s);
            }
        }
        board[i][j] = '-';
        if (i > 0) {
            dfs(board, i - 1, j, cur, collected);
        }
        if (i + 1 < board.length) {
            dfs(board, i + 1, j, cur, collected);
        }
        if (j > 0) {
            dfs(board, i, j - 1, cur, collected);
        }
        if (j + 1 < board[0].length) {
            dfs(board, i, j + 1, cur, collected);
        }
        board[i][j] = c;
    }

    static class Tree {
        private Tree[] children;
        public String end;
        private int length = 0;

        private Tree addChild(char c) {
            int i = c - 'a';
            if (children == null) {
                children = new Tree[26];
            }
            if (children[i] == null) {
                children[i] = new Tree();
                ++length;
            }
            return children[i];
        }

        public Tree getChild(char c) {
            return (children == null) ? null : children[c - 'a'];
        }

        public int len() {
            return length;
        }

        public static void addWord(Tree root, String word) {
            Tree t = root;
            for (char c : word.toCharArray()) {
                t = t.addChild(c);
            }
            t.end = word;
        }

        public static void deleteWord(Tree root, String word) {
            Tree toDelOn = root;
            char toDel = word.charAt(0);
            for (char c : word.toCharArray()) {
                if (root.length > 1) {
                    toDelOn = root;
                    toDel = c;
                }
                root = root.getChild(c);
                if (root == null) {
                    throw new IllegalArgumentException();
                }
            }
            toDelOn.children[toDel - 'a'] = null;
            --toDelOn.length;
            if (root.length != 0) {
                throw new IllegalArgumentException();
            }
        }
    }
}
