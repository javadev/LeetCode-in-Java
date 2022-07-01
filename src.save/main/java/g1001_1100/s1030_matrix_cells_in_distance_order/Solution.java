package g1001_1100.s1030_matrix_cells_in_distance_order;

// #Easy #Array #Math #Sorting #Matrix #Geometry
// #2022_02_27_Time_15_ms_(69.74%)_Space_72.2_MB_(52.05%)

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        Map<Integer, List<int[]>> map = new TreeMap<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                map.computeIfAbsent(
                                Math.abs(i - rCenter) + Math.abs(j - cCenter),
                                k -> new ArrayList<>())
                        .add(new int[] {i, j});
            }
        }
        int[][] res = new int[rows * cols][];
        int i = 0;
        for (List<int[]> list : map.values()) {
            for (int[] each : list) {
                res[i++] = each;
            }
        }
        return res;
    }
}
