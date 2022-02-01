package g0501_0600.s0566_reshape_the_matrix;

// #Easy #Array #Matrix #Simulation

public class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if ((mat.length * mat[0].length) != r * c) {
            return mat;
        }
        int p = 0;
        int[] flatArr = new int[mat.length * mat[0].length];
        for (int[] ints : mat) {
            for (int anInt : ints) {
                flatArr[p++] = anInt;
            }
        }
        int[][] ansMat = new int[r][c];
        int k = 0;
        for (int i = 0; i < ansMat.length; i++) {
            for (int j = 0; j < ansMat[i].length; j++) {
                ansMat[i][j] = flatArr[k++];
            }
        }
        return ansMat;
    }
}
