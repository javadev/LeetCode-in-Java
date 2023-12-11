package g0001_0100.s0079_word_search;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Matrix #Backtracking
// #Algorithm_II_Day_11_Recursion_Backtracking #Big_O_Time_O(4^(m*n))_Space_O(m*n)
// #2023_08_11_Time_157_ms_(78.97%)_Space_40.5_MB_(84.41%)

public class Solution {
    private boolean backtrace(
            char[][] board, boolean[][] visited, String word, int index, int x, int y) {
        if (index == word.length()) {
            return true;
        }
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || visited[x][y]) {
            return false;
        }
        visited[x][y] = true;
        if (word.charAt(index) == board[x][y]) {
            boolean res =
                    backtrace(board, visited, word, index + 1, x, y + 1)
                            || backtrace(board, visited, word, index + 1, x, y - 1)
                            || backtrace(board, visited, word, index + 1, x + 1, y)
                            || backtrace(board, visited, word, index + 1, x - 1, y);
            if (!res) {
                visited[x][y] = false;
            }
            return res;
        } else {
            visited[x][y] = false;
            return false;
        }
    }

    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (backtrace(board, visited, word, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }
}
