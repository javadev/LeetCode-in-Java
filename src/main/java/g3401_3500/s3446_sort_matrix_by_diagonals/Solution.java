package g3401_3500.s3446_sort_matrix_by_diagonals;

// #Medium #2025_02_09_Time_9_ms_(100.00%)_Space_45.62_MB_(100.00%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("java:S5413")
public class Solution {
    public int[][] sortMatrix(int[][] matrix) {
        Map<Integer, List<Integer>> diagonalMap = new HashMap<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int key = i - j;
                diagonalMap.putIfAbsent(key, new ArrayList<>());
                diagonalMap.get(key).add(matrix[i][j]);
            }
        }
        for (Map.Entry<Integer, List<Integer>> entry : diagonalMap.entrySet()) {
            List<Integer> values = entry.getValue();
            if (entry.getKey() < 0) {
                Collections.sort(values);
            } else {
                values.sort(Collections.reverseOrder());
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int key = i - j;
                matrix[i][j] = diagonalMap.get(key).remove(0);
            }
        }
        return matrix;
    }
}
