package s0036_valid_sudoku;

public class Solution {
    int j1;
    int[] i1 = new int[9];
    int[] b1 = new int[9];

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                boolean res = checkValid(board, i, j);
                if (!res) {
                    return false;
                }
            }
        }
        return true;
    }

    boolean checkValid(char[][] board, int i, int j) {
        if (j == 0) {
            j1 = 0;
        }
        if (board[i][j] == '.') {
            return true;
        }
        int val = board[i][j] - '0';
        if (j1 == (j1 | (1 << (val - 1)))) {
            return false;
        }
        j1 |= 1 << (val - 1);
        if (i1[j] == (i1[j] | (1 << (val - 1)))) {
            return false;
        }
        i1[j] |= 1 << (val - 1);
        int b = (i / 3) * 3 + j / 3;
        if (b1[b] == (b1[b] | (1 << (val - 1)))) {
            return false;
        }
        b1[b] |= 1 << (val - 1);
        return true;
    }
}
