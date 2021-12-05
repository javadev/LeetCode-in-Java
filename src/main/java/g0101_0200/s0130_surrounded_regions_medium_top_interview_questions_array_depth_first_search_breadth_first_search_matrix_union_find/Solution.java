package g0101_0200.s0130_surrounded_regions_medium_top_interview_questions_array_depth_first_search_breadth_first_search_matrix_union_find;

public class Solution {
    public void solve(char[][] board) {
        // Edge case, empty grid
        if (board.length == 0) {
            return;
        }
        // Traverse first and last rows ( boundaries)
        for (int i = 0; i < board[0].length; i++) {
            // first row
            if (board[0][i] == 'O') {
                dfs(board, 0, i); // It will covert O and all it's touching O's to #
            }
            // last row
            if (board[board.length - 1][i] == 'O') {
                dfs(board, board.length - 1, i); // Coverts O's to #'s (same thing as above)
            }
        }
        // Traverse first and last Column (boundaries)
        for (int i = 0; i < board.length; i++) {
            // first Column
            if (board[i][0] == 'O') {
                dfs(board, i, 0); // Converts O's to #'s
            }
            // last Column
            if (board[i][board[0].length - 1] == 'O') {
                dfs(board, i, board[0].length - 1); // Coverts O's to #'s
            }
        }
        // Traverse through entire matrix
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X'; // Convert O's to X's
                }
                if (board[i][j] == '#') {
                    board[i][j] = 'O'; // Convert #'s to O's
                }
            }
        }
    }

    void dfs(char[][] board, int row, int column) {
        if (row < 0
                || row >= board.length
                || column < 0
                || column >= board[0].length
                || board[row][column] != 'O') {
            return;
        }
        board[row][column] = '#';
        dfs(board, row + 1, column);
        dfs(board, row - 1, column);
        dfs(board, row, column + 1);
        dfs(board, row, column - 1);
    }
}
