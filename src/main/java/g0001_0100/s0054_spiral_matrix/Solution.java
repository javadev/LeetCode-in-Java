package g0001_0100.s0054_spiral_matrix;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Matrix #Simulation
// #Programming_Skills_II_Day_8 #Level_2_Day_1_Implementation/Simulation #Udemy_2D_Arrays/Matrix
// #2023_08_11_Time_0_ms_(100.00%)_Space_41_MB_(9.67%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int r = 0;
        int c = 0;
        int bigR = matrix.length - 1;
        int bigC = matrix[0].length - 1;
        while (r <= bigR && c <= bigC) {
            for (int i = c; i <= bigC; i++) {
                list.add(matrix[r][i]);
            }
            r++;
            for (int i = r; i <= bigR; i++) {
                list.add(matrix[i][bigC]);
            }
            bigC--;
            for (int i = bigC; i >= c && r <= bigR; i--) {
                list.add(matrix[bigR][i]);
            }
            bigR--;
            for (int i = bigR; i >= r && c <= bigC; i--) {
                list.add(matrix[i][c]);
            }
            c++;
        }
        return list;
    }
}
