package g0201_0300.s0240_search_a_2d_matrix_ii;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Binary_Search #Matrix
// #Divide_and_Conquer #Acceptance_48.5% #Data_Structure_II_Day_4_Array #Binary_Search_II_Day_8
// #2022_03_14_Time_9_ms_(71.40%)_Space_57.3_MB_(49.27%)

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
