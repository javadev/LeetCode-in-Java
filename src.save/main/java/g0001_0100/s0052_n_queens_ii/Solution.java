package g0001_0100.s0052_n_queens_ii;

// #Hard #Backtracking #2023_08_11_Time_1_ms_(96.99%)_Space_39.8_MB_(38.70%)

public class Solution {
    public int totalNQueens(int n) {
        boolean[] row = new boolean[n];
        boolean[] col = new boolean[n];
        boolean[] diagonal = new boolean[n + n - 1];
        boolean[] antiDiagonal = new boolean[n + n - 1];
        return totalNQueens(n, 0, row, col, diagonal, antiDiagonal);
    }

    private int totalNQueens(
            int n,
            int r,
            boolean[] row,
            boolean[] col,
            boolean[] diagonal,
            boolean[] antiDiagonal) {
        if (r == n) {
            return 1;
        }
        int count = 0;
        for (int c = 0; c < n; c++) {
            if (!row[r] && !col[c] && !diagonal[r + c] && !antiDiagonal[r - c + n - 1]) {
                row[r] = col[c] = diagonal[r + c] = antiDiagonal[r - c + n - 1] = true;
                count += totalNQueens(n, r + 1, row, col, diagonal, antiDiagonal);
                row[r] = col[c] = diagonal[r + c] = antiDiagonal[r - c + n - 1] = false;
            }
        }
        return count;
    }
}
