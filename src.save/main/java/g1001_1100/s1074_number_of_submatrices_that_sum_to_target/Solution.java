package g1001_1100.s1074_number_of_submatrices_that_sum_to_target;

// #Hard #Array #Hash_Table #Matrix #Prefix_Sum
// #2022_02_26_Time_171_ms_(68.35%)_Space_117.8_MB_(5.54%)

import java.util.HashMap;

public class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        int cur;
        int res = 0;
        for (int i = 0; i < columns; i++) {
            for (int j = i; j < columns; j++) {
                sumMap.clear();
                sumMap.put(0, 1);
                cur = 0;
                for (int[] ints : matrix) {
                    cur += ints[j] - (i > 0 ? ints[i - 1] : 0);
                    res += sumMap.getOrDefault(cur - target, 0);
                    sumMap.put(cur, sumMap.getOrDefault(cur, 0) + 1);
                }
            }
        }
        return res;
    }
}
