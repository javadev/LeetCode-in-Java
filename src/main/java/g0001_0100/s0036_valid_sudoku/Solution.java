package g0001_0100.s0036_valid_sudoku;

// #Medium #Top_Interview_Questions #Array #Hash_Table #Matrix #Data_Structure_I_Day_5_Array
// #Top_Interview_150_Matrix #2025_03_04_Time_1_ms_(100.00%)_Space_44.50_MB_(57.83%)

public class Solution {
    private int j1;
    private int[] i1 = new int[9];
    private int[] b1 = new int[9];

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

    private boolean checkValid(char[][] board, int i, int j) {
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
