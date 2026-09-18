package g3801_3900.s3898_find_the_degree_of_each_vertex;

// #Easy #Array #Matrix #Mid_Level #Weekly_Contest_497 #Graph_Theory
// #2026_08_13_Time_1_ms_(100.00%)_Space_48.48_MB_(42.57%)

public class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] res = new int[matrix.length];
        int n1 = matrix.length;
        int n2 = matrix[0].length;
        for (int i = 0; i < n1; i++) {
            int sum = 0;
            for (int j = 0; j < n2; j++) {
                sum += matrix[i][j];
            }
            res[i] = sum;
        }
        return res;
    }
}
