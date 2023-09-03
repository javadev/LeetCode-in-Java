package g1201_1300.s1252_cells_with_odd_values_in_a_matrix;

// #Easy #Array #Math #Simulation #2022_03_12_Time_1_ms_(87.47%)_Space_39.9_MB_(62.42%)

public class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int[][] matrix = new int[n][m];
        for (int[] index : indices) {
            addOneToRow(matrix, index[0]);
            addOneToColumn(matrix, index[1]);
        }
        int oddNumberCount = 0;
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (ints[j] % 2 != 0) {
                    oddNumberCount++;
                }
            }
        }
        return oddNumberCount;
    }

    private void addOneToColumn(int[][] matrix, int columnIndex) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][columnIndex] += 1;
        }
    }

    private void addOneToRow(int[][] matrix, int rowIndex) {
        for (int j = 0; j < matrix[0].length; j++) {
            matrix[rowIndex][j] += 1;
        }
    }
}
