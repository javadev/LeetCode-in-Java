package s0059_spiral_matrix_ii;

public class Solution {
    public int[][] generateMatrix(int n) {
        int num = 1;
        int rStart = 0;
        int rEnd = n - 1;
        int cStart = 0;
        int cEnd = n - 1;
        int[][] spiral = new int[n][n];
        while (rStart <= rEnd && cStart <= cEnd) {
            for (int k = cStart; k <= cEnd; k++) {
                spiral[rStart][k] = num++;
            }
            rStart++;
            for (int k = rStart; k <= rEnd; k++) {
                spiral[k][cEnd] = num++;
            }
            cEnd--;
            if (rStart <= rEnd) {
                for (int k = cEnd; k >= cStart; k--) {
                    spiral[rEnd][k] = num++;
                }
            }
            rEnd--;
            if (cStart <= cEnd) {
                for (int k = rEnd; k >= rStart; k--) {
                    spiral[k][cStart] = num++;
                }
            }
            cStart++;
        }
        return spiral;
    }
}
