package g1201_1300.s1260_shift_2d_grid;

// #Easy #Array #Matrix #Simulation #Acceptance_68.1%
// #2022_03_13_Time_17_ms_(14.82%)_Space_54.2_MB_(47.71%)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int totalNumbers = m * n;
        int start = totalNumbers - k % totalNumbers;
        LinkedList<List<Integer>> result = new LinkedList<>();
        for (int i = start; i < totalNumbers + start; i++) {
            int moveIndex = i % totalNumbers;
            int moveRow = moveIndex / n;
            int moveColumn = moveIndex % n;
            if ((i - start) % n == 0) {
                result.add(new ArrayList<>());
            }
            result.peekLast().add(grid[moveRow][moveColumn]);
        }
        return result;
    }
}
