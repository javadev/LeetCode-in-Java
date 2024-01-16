package g1001_1100.s1001_grid_illumination;

// #Hard #Array #Hash_Table #2023_04_26_Time_82_ms_(89.13%)_Space_57.5_MB_(89.13%)

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
        Map<Integer, Integer> rowIlluminations = new HashMap<>();
        Map<Integer, Integer> colIlluminations = new HashMap<>();
        Map<Integer, Integer> posDiagIlluminations = new HashMap<>();
        Map<Integer, Integer> negDiagIlluminations = new HashMap<>();
        Set<Long> lampPlacements = new HashSet<>();
        for (int[] lamp : lamps) {
            int row = lamp[0];
            int col = lamp[1];
            long key = row;
            key = key * n + col;
            if (lampPlacements.contains(key)) {
                continue;
            }
            incr(rowIlluminations, row);
            incr(colIlluminations, col);
            incr(posDiagIlluminations, row + col);
            incr(negDiagIlluminations, row + (n - 1 - col));
            lampPlacements.add(key);
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < ans.length; i++) {
            int row = queries[i][0];
            int col = queries[i][1];
            if (rowIlluminations.containsKey(row)
                    || colIlluminations.containsKey(col)
                    || posDiagIlluminations.containsKey(row + col)
                    || negDiagIlluminations.containsKey(row + (n - 1 - col))) {
                ans[i] = 1;
            }
            int topRow = Math.max(0, row - 1);
            int bottomRow = Math.min(n - 1, row + 1);
            int leftCol = Math.max(0, col - 1);
            int rightCol = Math.min(n - 1, col + 1);
            for (int r = topRow; r <= bottomRow; r++) {
                for (int c = leftCol; c <= rightCol; c++) {
                    long key = r;
                    key = key * n + c;
                    if (lampPlacements.contains(key)) {
                        decr(rowIlluminations, r);
                        decr(colIlluminations, c);
                        decr(posDiagIlluminations, r + c);
                        decr(negDiagIlluminations, r + (n - 1 - c));
                        lampPlacements.remove(key);
                    }
                }
            }
        }
        return ans;
    }

    private void incr(Map<Integer, Integer> map, int key) {
        map.put(key, map.getOrDefault(key, 0) + 1);
    }

    private void decr(Map<Integer, Integer> map, int key) {
        int v = map.get(key);
        if (map.get(key) == 1) {
            map.remove(key);
        } else {
            map.put(key, v - 1);
        }
    }
}
