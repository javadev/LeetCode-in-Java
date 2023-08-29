package g1101_1200.s1139_largest_1_bordered_square;

// #Medium #Array #Dynamic_Programming #Matrix #2023_06_01_Time_4_ms_(88.04%)_Space_44.7_MB_(17.39%)

public class Solution {
    public int largest1BorderedSquare(int[][] grid) {
        int[][] rightToLeft = new int[grid.length][];
        int[][] bottomToUp = new int[grid.length][];
        for (int i = 0; i < grid.length; i++) {
            rightToLeft[i] = grid[i].clone();
            bottomToUp[i] = grid[i].clone();
        }
        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = col - 2; j >= 0; j--) {
                if (grid[i][j] == 1) {
                    rightToLeft[i][j] = rightToLeft[i][j + 1] + 1;
                }
            }
        }
        for (int j = 0; j < col; j++) {
            for (int i = row - 2; i >= 0; i--) {
                if (grid[i][j] == 1) {
                    bottomToUp[i][j] = bottomToUp[i + 1][j] + 1;
                }
            }
        }
        int res = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int curLen = rightToLeft[i][j];
                for (int k = curLen; k >= 1; k--) {
                    if (bottomToUp[i][j] >= k
                            && rightToLeft[i + k - 1][j] >= k
                            && bottomToUp[i][j + k - 1] >= k) {
                        if (k > res) {
                            res = k;
                        }
                        break;
                    }
                }
            }
        }
        return res * res;
    }
}
