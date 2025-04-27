package g3501_3600.s3531_count_covered_buildings;

// #Medium #2025_04_27_Time_11_ms_(100.00%)_Space_111.25_MB_(18.45%)

import java.util.Arrays;

public class Solution {
    private int helper(int[][] buildings, int n) {
        int[] minRow = new int[n + 1];
        int[] maxRow = new int[n + 1];
        int[] minCol = new int[n + 1];
        int[] maxCol = new int[n + 1];
        Arrays.fill(minRow, n + 1);
        Arrays.fill(minCol, n + 1);
        for (int[] b : buildings) {
            int x = b[0];
            int y = b[1];
            minRow[x] = Math.min(minRow[x], y);
            maxRow[x] = Math.max(maxRow[x], y);
            minCol[y] = Math.min(minCol[y], x);
            maxCol[y] = Math.max(maxCol[y], x);
        }
        int ans = 0;
        for (int[] arr : buildings) {
            int x = arr[0];
            int y = arr[1];
            if (minRow[x] < y && maxRow[x] > y && minCol[y] < x && maxCol[y] > x) {
                ans++;
            }
        }
        return ans;
    }

    public int countCoveredBuildings(int n, int[][] buildings) {
        return helper(buildings, n);
    }
}
