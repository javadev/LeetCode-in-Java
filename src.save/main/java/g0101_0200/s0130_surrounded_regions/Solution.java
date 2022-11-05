package g0101_0200.s0130_surrounded_regions;

// #Medium #Top_Interview_Questions #Array #Depth_First_Search #Breadth_First_Search #Matrix
// #Union_Find #Algorithm_II_Day_8_Breadth_First_Search_Depth_First_Search
// #2022_06_23_Time_2_ms_(84.66%)_Space_51.4_MB_(62.38%)

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
                // It will covert O and all it's touching O's to #
                dfs(board, 0, i);
            }
            // last row
            if (board[board.length - 1][i] == 'O') {
                // Coverts O's to #'s (same thing as above)
                dfs(board, board.length - 1, i);
            }
        }
        // Traverse first and last Column (boundaries)
        for (int i = 0; i < board.length; i++) {
            // first Column
            if (board[i][0] == 'O') {
                // Converts O's to #'s
                dfs(board, i, 0);
            }
            // last Column
            if (board[i][board[0].length - 1] == 'O') {
                // Coverts O's to #'s
                dfs(board, i, board[0].length - 1);
            }
        }
        // Traverse through entire matrix
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O') {
                    // Convert O's to X's
                    board[i][j] = 'X';
                }
                if (board[i][j] == '#') {
                    // Convert #'s to O's
                    board[i][j] = 'O';
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
