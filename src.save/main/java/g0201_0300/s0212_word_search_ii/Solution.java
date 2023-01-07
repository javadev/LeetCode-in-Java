package g0201_0300.s0212_word_search_ii;

// #Hard #Top_Interview_Questions #Array #String #Matrix #Backtracking #Trie
// #2022_07_02_Time_21_ms_(99.42%)_Space_44.1_MB_(67.33%)

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
}
