package g1301_1400.s1351_count_negative_numbers_in_a_sorted_matrix;

// #Easy #Array #Binary_Search #Matrix #Binary_Search_I_Day_8
// #2022_03_21_Time_1_ms_(49.66%)_Space_49.3_MB_(36.56%)

public class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] row : grid) {
            for (int v : row) {
                if (v < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
