package g0801_0900.s0867_transpose_matrix;

// #Easy #Array #Matrix #Simulation #2022_03_27_Time_1_ms_(60.83%)_Space_48.6_MB_(49.55%)

public class Solution {
    public int[][] transpose(int[][] input) {
        int[][] output = new int[input[0].length][input.length];
        for (int i = 0, b = 0; i < input.length; i++, b++) {
            for (int j = 0, a = 0; j < input[0].length; j++, a++) {
                output[a][b] = input[i][j];
            }
        }
        return output;
    }
}
