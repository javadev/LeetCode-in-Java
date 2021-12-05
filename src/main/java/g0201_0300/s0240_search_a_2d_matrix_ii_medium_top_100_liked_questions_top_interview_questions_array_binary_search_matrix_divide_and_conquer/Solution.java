package g0201_0300.s0240_search_a_2d_matrix_ii_medium_top_100_liked_questions_top_interview_questions_array_binary_search_matrix_divide_and_conquer;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;
        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return true;
            } else if (matrix[r][c] > target) {
                c--;
            } else {
                r++;
            }
        }
        return false;
    }
}
