package g0001_0100.s0048_rotate_image_medium_top_100_liked_questions_top_interview_questions_array_math_matrix;

public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int[][] pos =
                        new int[][] {
                            {i, j}, {j, n - 1 - i}, {n - 1 - i, n - 1 - j}, {n - 1 - j, i}
                        };
                int t = matrix[pos[0][0]][pos[0][1]];
                for (int k = 1; k < pos.length; k++) {
                    int temp = matrix[pos[k][0]][pos[k][1]];
                    matrix[pos[k][0]][pos[k][1]] = t;
                    t = temp;
                }
                matrix[pos[0][0]][pos[0][1]] = t;
            }
        }
    }
}
