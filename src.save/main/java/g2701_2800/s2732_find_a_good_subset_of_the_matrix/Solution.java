package g2701_2800.s2732_find_a_good_subset_of_the_matrix;

// #Hard #Array #Greedy #Matrix #Bit_Manipulation
// #2023_09_22_Time_7_ms_(70.65%)_Space_57.2_MB_(5.43%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> goodSubsetofBinaryMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        if (m == 1 && sumArray(grid[0]) == 0) {
            return List.of(0);
        }
        Map<Integer, Integer> pos = new HashMap<>();
        for (int i = 0; i < m; i++) {
            for (int mask = 0; mask < (1 << n); mask++) {
                boolean valid = true;
                for (int j = 0; j < n; j++) {
                    if ((mask & (1 << j)) != 0 && grid[i][j] + 1 > 1) {
                        valid = false;
                        break;
                    }
                }
                if (valid && pos.containsKey(mask)) {
                    return List.of(pos.get(mask), i);
                }
            }
            int curr = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    curr = curr | (1 << j);
                }
            }
            pos.put(curr, i);
        }
        return new ArrayList<>();
    }

    private int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
