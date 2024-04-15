package g2901_3000.s2943_maximize_area_of_square_hole_in_grid;

// #Medium #Array #Sorting #2024_01_04_Time_2_ms_(100.00%)_Space_43.2_MB_(70.48%)

import java.util.Arrays;

@SuppressWarnings("java:S1172")
public class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        int x = find(hBars);
        int y = find(vBars);
        int res = Math.min(x, y) + 1;
        return res * res;
    }

    private int find(int[] arr) {
        Arrays.sort(arr);
        int res = 1;
        int i = 0;
        int n = arr.length;
        while (i < n) {
            int count = 1;
            while (i + 1 < n && arr[i] + 1 == arr[i + 1]) {
                i++;
                count++;
            }
            i++;
            res = Math.max(res, count);
        }
        return res;
    }
}
