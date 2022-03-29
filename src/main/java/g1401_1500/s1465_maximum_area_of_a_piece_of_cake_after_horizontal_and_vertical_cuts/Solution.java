package g1401_1500.s1465_maximum_area_of_a_piece_of_cake_after_horizontal_and_vertical_cuts;

// #Medium #Array #Sorting #Greedy #2022_03_29_Time_21_ms_(35.40%)_Space_61.3_MB_(26.00%)

import java.util.Arrays;

public class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        long max_vertical = 0;

        max_vertical = Math.max(max_vertical, verticalCuts[0]);

        for (int i = 1; i < verticalCuts.length; i++) {
            int diff = (verticalCuts[i] - verticalCuts[i - 1]);

            max_vertical = Math.max(max_vertical, diff);
        }

        max_vertical = Math.max(max_vertical, w - verticalCuts[verticalCuts.length - 1]);

        long max_horizontal = 0;

        max_horizontal = Math.max(max_horizontal, horizontalCuts[0]);

        for (int i = 1; i < horizontalCuts.length; i++) {
            int diff = (horizontalCuts[i] - horizontalCuts[i - 1]);

            max_horizontal = Math.max(max_horizontal, diff);
        }

        max_horizontal = Math.max(max_horizontal, h - horizontalCuts[horizontalCuts.length - 1]);

        return (int) (max_vertical % 1000000007 * max_horizontal % 1000000007) % 1000000007;
    }
}
