package g0001_0100.s0074_search_a_2d_matrix;

// #Medium #Array #Binary_Search #Matrix #Data_Structure_I_Day_5_Array #2022_02_19_Time_0_ms_(100.00%)_Space_41.8_MB_(34.53%)

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int endRow = matrix.length;
        int endCol = matrix[0].length;
        int targetRow = 0;
        boolean result = false;
        for (int i = 0; i < endRow; i++) {
            if (matrix[i][endCol - 1] >= target) {
                targetRow = i;
                break;
            }
        }
        for (int i = 0; i < endCol; i++) {
            if (matrix[targetRow][i] == target) {
                result = true;
                break;
            }
        }
        return result;
    }
}
