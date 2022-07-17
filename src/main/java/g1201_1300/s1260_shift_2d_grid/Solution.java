package g1201_1300.s1260_shift_2d_grid;

// #Easy #Array #Matrix #Simulation #2022_07_10_Time_6_ms_(89.10%)_Space_54.8_MB_(44.55%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        if (grid == null) {
            return Collections.emptyList();
        }
        int[] flat = new int[grid.length * grid[0].length];
        int index = 0;
        for (int[] ints : grid) {
            for (int j = 0; j < grid[0].length; ++j) {
                flat[index++] = ints[j];
            }
        }
        int mode = k % flat.length;
        int readingIndex = flat.length - mode;
        if (readingIndex == flat.length) {
            readingIndex = 0;
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < grid.length; ++i) {
            List<Integer> eachRow = new ArrayList<>();
            for (int j = 0; j < grid[0].length; ++j) {
                eachRow.add(flat[readingIndex++]);
                if (readingIndex == flat.length) {
                    readingIndex = 0;
                }
            }
            result.add(eachRow);
        }
        return result;
    }
}
