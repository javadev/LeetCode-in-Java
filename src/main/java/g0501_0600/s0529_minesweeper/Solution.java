package g0501_0600.s0529_minesweeper;

// #Medium #Array #Depth_First_Search #Breadth_First_Search #Matrix
// #2022_07_28_Time_0_ms_(100.00%)_Space_42.6_MB_(85.88%)

public class Solution {
    private static final int[][] DIRECTION = {
        {1, 0}, {-1, 0}, {0, 1}, {0, -1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}
    };

    private int row;
    private int col;

    private void dfs(char[][] board, int row, int col) {
        if (row < 0 || row >= this.row || col < 0 || col >= this.col) {
            return;
        }
        if (board[row][col] == 'E') {
            int numOfMine = bfs(board, row, col);
            if (numOfMine != 0) {
                board[row][col] = (char) (numOfMine + '0');
                return;
            } else {
                board[row][col] = 'B';
            }
            for (int[] i : DIRECTION) {
                dfs(board, row + i[0], col + i[1]);
            }
        }
    }

    private int bfs(char[][] board, int row, int col) {
        int numOfMine = 0;

        for (int[] i : DIRECTION) {
            int newRow = row + i[0];
            int newCol = col + i[1];
            if (newRow >= 0
                    && newRow < this.row
                    && newCol >= 0
                    && newCol < this.col
                    && board[newRow][newCol] == 'M') {
                numOfMine++;
            }
        }

        return numOfMine;
    }

    public char[][] updateBoard(char[][] board, int[] c) {
        if (board[c[0]][c[1]] == 'M') {
            board[c[0]][c[1]] = 'X';
            return board;
        } else {
            row = board.length;
            col = board[0].length;
            dfs(board, c[0], c[1]);
        }
        return board;
    }
}
