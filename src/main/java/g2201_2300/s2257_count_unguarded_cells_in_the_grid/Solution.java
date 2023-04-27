package g2201_2300.s2257_count_unguarded_cells_in_the_grid;

// #Medium #Array #Matrix #Simulation #2022_06_13_Time_32_ms_(70.28%)_Space_128.9_MB_(30.77%)

public class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        char[][] matrix = new char[m][n];
        int result = 0;
        for (int i = 0; i <= guards.length - 1; i++) {
            int guardRow = guards[i][0];
            int guardCol = guards[i][1];
            matrix[guardRow][guardCol] = 'G';
        }
        for (int i = 0; i <= walls.length - 1; i++) {
            int wallRow = walls[i][0];
            int wallCol = walls[i][1];
            matrix[wallRow][wallCol] = 'W';
        }
        for (int i = 0; i <= guards.length - 1; i++) {
            int currentRow = guards[i][0];
            int currentCol = guards[i][1] - 1;
            extracted(matrix, currentRow, currentCol);
            currentRow = guards[i][0];
            currentCol = guards[i][1] + 1;
            extracted(n, matrix, currentRow, currentCol);
            currentRow = guards[i][0] - 1;
            currentCol = guards[i][1];
            extracted1(matrix, currentRow, currentCol);
            currentRow = guards[i][0] + 1;
            currentCol = guards[i][1];
            extracted1(m, matrix, currentRow, currentCol);
        }
        for (int i = 0; i <= m - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                if (matrix[i][j] != 'R' && matrix[i][j] != 'G' && matrix[i][j] != 'W') {
                    result++;
                }
            }
        }
        return result;
    }

    private void extracted1(int m, char[][] matrix, int currentRow, int currentCol) {
        while (currentRow <= m - 1) {
            if (matrix[currentRow][currentCol] != 'W' && matrix[currentRow][currentCol] != 'G') {
                matrix[currentRow][currentCol] = 'R';
            } else {
                break;
            }
            currentRow++;
        }
    }

    private void extracted1(char[][] matrix, int currentRow, int currentCol) {
        while (currentRow >= 0) {
            if (matrix[currentRow][currentCol] != 'W' && matrix[currentRow][currentCol] != 'G') {
                matrix[currentRow][currentCol] = 'R';
            } else {
                break;
            }
            currentRow--;
        }
    }

    private void extracted(int n, char[][] matrix, int currentRow, int currentCol) {
        while (currentCol <= n - 1) {
            if (matrix[currentRow][currentCol] != 'W' && matrix[currentRow][currentCol] != 'G') {
                matrix[currentRow][currentCol] = 'R';
            } else {
                break;
            }
            currentCol++;
        }
    }

    private void extracted(char[][] matrix, int currentRow, int currentCol) {
        while (currentCol >= 0) {
            if (matrix[currentRow][currentCol] != 'W' && matrix[currentRow][currentCol] != 'G') {
                matrix[currentRow][currentCol] = 'R';
            } else {
                break;
            }
            currentCol--;
        }
    }
}
