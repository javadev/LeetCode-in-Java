package g0701_0800.s0782_transform_to_chessboard;

// #Hard #Array #Math #Matrix #Bit_Manipulation
// #2022_03_26_Time_2_ms_(53.57%)_Space_45.1_MB_(42.86%)

public class Solution {
    public int movesToChessboard(int[][] board) {
        int n = board.length;
        int colToMove = 0;
        int rowToMove = 0;
        int rowOneCnt = 0;
        int colOneCnt = 0;
        for (int[] ints : board) {
            for (int j = 0; j < n; j++) {
                if (((board[0][0] ^ ints[0]) ^ (ints[j] ^ board[0][j])) == 1) {
                    return -1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            rowOneCnt += board[0][i];
            colOneCnt += board[i][0];
            if (board[i][0] == i % 2) {
                rowToMove++;
            }
            if (board[0][i] == i % 2) {
                colToMove++;
            }
        }
        if (rowOneCnt < n / 2 || rowOneCnt > (n + 1) / 2) {
            return -1;
        }
        if (colOneCnt < n / 2 || colOneCnt > (n + 1) / 2) {
            return -1;
        }
        if (n % 2 == 1) {
            // we cannot make it when ..ToMove is odd
            if (colToMove % 2 == 1) {
                colToMove = n - colToMove;
            }
            if (rowToMove % 2 == 1) {
                rowToMove = n - rowToMove;
            }
        } else {
            colToMove = Math.min(colToMove, n - colToMove);
            rowToMove = Math.min(rowToMove, n - rowToMove);
        }
        return (colToMove + rowToMove) / 2;
    }
}
