package g2301_2400.s2352_equal_row_and_column_pairs;

// #Medium #Array #Hash_Table #Matrix #Simulation
// #2022_08_07_Time_7_ms_(98.94%)_Space_71.4_MB_(27.97%)

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int equalPairs(int[][] grid) {
        int[] tmpCol = new int[grid.length];
        Map<Integer, Integer> pairsMap = new HashMap<>();
        int pairsCounter = 0;
        for (int col = 0; col < grid[0].length; col++) {
            for (int row = 0; row < grid.length; row++) {
                tmpCol[row] = grid[row][col];
            }
            int hashCode = Arrays.hashCode(tmpCol);
            pairsMap.put(hashCode, pairsMap.getOrDefault(hashCode, 0) + 1);
        }
        for (int[] row : grid) {
            int hashCode = Arrays.hashCode(row);
            if (pairsMap.containsKey(hashCode)) {
                pairsCounter += pairsMap.get(hashCode);
            }
        }
        return pairsCounter;
    }
}
