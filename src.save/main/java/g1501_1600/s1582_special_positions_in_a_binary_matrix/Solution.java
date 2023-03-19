package g1501_1600.s1582_special_positions_in_a_binary_matrix;

// #Easy #Array #Matrix #2022_04_11_Time_2_ms_(82.12%)_Space_52.5_MB_(17.36%)

public class Solution {
    public int numSpecial(int[][] mat) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1 && isSpecial(mat, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isSpecial(int[][] mat, int row, int col) {
        for (int i = 0; i < mat.length; i++) {
            if (i != row && mat[i][col] == 1) {
                return false;
            }
        }
        for (int j = 0; j < mat[0].length; j++) {
            if (j != col && mat[row][j] == 1) {
                return false;
            }
        }
        return true;
    }
}
