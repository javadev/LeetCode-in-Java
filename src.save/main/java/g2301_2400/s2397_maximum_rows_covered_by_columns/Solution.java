package g2301_2400.s2397_maximum_rows_covered_by_columns;

// #Medium #Array #Matrix #Bit_Manipulation #Backtracking #Enumeration
// #2022_09_14_Time_1_ms_(100.00%)_Space_40.7_MB_(93.95%)

public class Solution {
    private int ans = 0;

    public int maximumRows(int[][] matrix, int numSelect) {
        dfs(matrix, /*colIndex=*/ 0, numSelect, /*mask=*/ 0);
        return ans;
    }

    private void dfs(int[][] matrix, int colIndex, int leftColsCount, int mask) {
        if (leftColsCount == 0) {
            ans = Math.max(ans, getAllZerosRowCount(matrix, mask));
            return;
        }
        if (colIndex == matrix[0].length) {
            return;
        }
        // choose this column
        dfs(matrix, colIndex + 1, leftColsCount - 1, mask | 1 << colIndex);
        // not choose this column
        dfs(matrix, colIndex + 1, leftColsCount, mask);
    }

    private int getAllZerosRowCount(int[][] matrix, int mask) {
        int count = 0;
        for (int[] row : matrix) {
            boolean isAllZeros = true;
            for (int i = 0; i < row.length; ++i) {
                if (row[i] == 1 && (mask >> i & 1) == 0) {
                    isAllZeros = false;
                    break;
                }
            }
            if (isAllZeros) {
                ++count;
            }
        }
        return count;
    }
}
