package g0401_0500.s0452_minimum_number_of_arrows_to_burst_balloons;

// #Medium #Array #Sorting #Greedy

import java.util.Arrays;

public class Solution {
    public int findMinArrowShots(int[][] points) {
        int len = points.length, arrows = 1;
        Arrays.sort(
                points,
                (o1, o2) -> {
                    if (o1[1] < o2[1]) {
                        return -1;
                    } else if (o1[1] > o2[1]) {
                        return 1;
                    } else {
                        return 0;
                    }
                });

        int index = points[0][1];
        for (int i = 0; i < len; i++) {
            if (points[i][0] <= index) {
                continue;
            }
            arrows++;
            index = points[i][1];
        }
        return arrows;
    }
}
