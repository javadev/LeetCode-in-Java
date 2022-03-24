package g0801_0900.s0850_rectangle_area_ii;

// #Hard #Array #Ordered_Set #Segment_Tree #Line_Sweep
// #2022_03_24_Time_4_ms_(97.00%)_Space_43.2_MB_(41.20%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int rectangleArea(int[][] rectangles) {
        List<int[]> memo = new ArrayList<>();
        for (int[] rectangle : rectangles) {
            helper(0, rectangle, memo);
        }

        long res = 0;
        final int mod = (int) (1e9 + 7);
        for (int[] m : memo) {
            res = (res + (long) (m[2] - m[0]) * (long) (m[3] - m[1])) % mod;
        }

        return (int) res;
    }

    private void helper(int id, int[] rectangle, List<int[]> memo) {
        if (id >= memo.size()) {
            memo.add(rectangle);
            return;
        }

        int[] cur = memo.get(id);

        if (rectangle[2] <= cur[0]
                || rectangle[0] >= cur[2]
                || rectangle[1] >= cur[3]
                || rectangle[3] <= cur[1]) {
            helper(id + 1, rectangle, memo);
            return;
        }

        if (rectangle[0] < cur[0]) {
            helper(id + 1, new int[] {rectangle[0], rectangle[1], cur[0], rectangle[3]}, memo);
        }

        if (rectangle[2] > cur[2]) {
            helper(id + 1, new int[] {cur[2], rectangle[1], rectangle[2], rectangle[3]}, memo);
        }

        if (rectangle[1] < cur[1]) {
            helper(
                    id + 1,
                    new int[] {
                        Math.max(rectangle[0], cur[0]),
                        rectangle[1],
                        Math.min(rectangle[2], cur[2]),
                        cur[1]
                    },
                    memo);
        }

        if (rectangle[3] > cur[3]) {
            helper(
                    id + 1,
                    new int[] {
                        Math.max(rectangle[0], cur[0]),
                        cur[3],
                        Math.min(rectangle[2], cur[2]),
                        rectangle[3]
                    },
                    memo);
        }
    }
}
