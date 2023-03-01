package g1801_1900.s1840_maximum_building_height;

// #Hard #Array #Math #2022_05_07_Time_59_ms_(94.64%)_Space_93.4_MB_(98.21%)

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int maxBuilding(int n, int[][] restrictions) {
        if (restrictions.length == 0) {
            return n - 1;
        }
        int m = restrictions.length;
        Arrays.sort(restrictions, Comparator.comparingInt(a -> a[0]));
        for (int i = m - 2; i >= 0; i--) {
            restrictions[i][1] =
                    Math.min(
                            restrictions[i][1],
                            restrictions[i + 1][1] + restrictions[i + 1][0] - restrictions[i][0]);
        }
        int id = 1;
        int height = 0;
        int res = 0;
        for (int[] r : restrictions) {
            int currMax;
            if (r[1] >= height + r[0] - id) {
                currMax = height + r[0] - id;
                height = currMax;
            } else {
                currMax = (height + r[0] - id + r[1]) / 2;
                height = r[1];
            }
            id = r[0];
            res = Math.max(res, currMax);
        }
        if (id != n) {
            res = Math.max(res, height + n - id);
        }
        return res;
    }
}
