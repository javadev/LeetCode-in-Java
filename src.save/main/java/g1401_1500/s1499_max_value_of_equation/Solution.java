package g1401_1500.s1499_max_value_of_equation;

// #Hard #Array #Heap_Priority_Queue #Sliding_Window #Queue #Monotonic_Queue
// #2022_03_21_Time_7_ms_(98.61%)_Space_105.2_MB_(79.40%)

public class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int res = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        int r = 0;
        int rMax = 0;
        for (int l = 0; l < points.length - 1; l++) {
            if (rMax == l) {
                max = Integer.MIN_VALUE;
                r = l + 1;
                rMax = r;
            }
            while (r < points.length && points[r][0] - points[l][0] <= k) {
                int v = points[r][0] + points[r][1];
                if (max < v) {
                    max = v;
                    rMax = r;
                }
                r++;
            }
            if (points[rMax][0] - points[l][0] <= k) {
                res =
                        Math.max(
                                res,
                                points[rMax][0] - points[l][0] + points[rMax][1] + points[l][1]);
            }
        }
        return res;
    }
}
