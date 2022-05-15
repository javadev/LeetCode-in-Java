package g0801_0900.s0885_spiral_matrix_iii;

// #Medium #Array #Matrix #Simulation #Acceptance_72.5%
// #2022_03_28_Time_3_ms_(95.45%)_Space_64_MB_(42.42%)

@SuppressWarnings("java:S135")
public class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int y, int x) {
        int j;
        int i = 0;
        int moves = 0;
        int[][] result = new int[rows * cols][2];
        result[0][0] = y;
        result[0][1] = x;
        i++;
        while (i < result.length) {
            moves++;
            // Move right
            if (y < 0 || y >= rows) {
                x += moves;
            } else {
                for (j = 0; j < moves; j++) {
                    x++;
                    if (x >= 0 && x < cols && y >= 0 && y < rows) {
                        result[i][0] = y;
                        result[i][1] = x;
                        i++;
                    }
                }
            }
            if (i >= result.length) {
                break;
            }
            // Move down
            if (x < 0 || x >= cols) {
                y += moves;
            } else {
                for (j = 0; j < moves; j++) {
                    y++;
                    if (x >= 0 && x < cols && y >= 0 && y < rows) {
                        result[i][0] = y;
                        result[i][1] = x;
                        i++;
                    }
                }
            }
            if (i >= result.length) {
                break;
            }
            moves++;
            // Move left
            if (y < 0 || y >= rows) {
                x -= moves;
            } else {
                for (j = 0; j < moves; j++) {
                    x--;
                    if (x >= 0 && x < cols && y >= 0 && y < rows) {
                        result[i][0] = y;
                        result[i][1] = x;
                        i++;
                    }
                }
            }
            if (i >= result.length) {
                break;
            }
            // Move up
            if (x < 0 || x >= cols) {
                y -= moves;
            } else {
                for (j = 0; j < moves; j++) {
                    y--;
                    if (x >= 0 && x < cols && y >= 0 && y < rows) {
                        result[i][0] = y;
                        result[i][1] = x;
                        i++;
                    }
                }
            }
        }
        return result;
    }
}
