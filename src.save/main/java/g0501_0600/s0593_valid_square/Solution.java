package g0501_0600.s0593_valid_square;

// #Medium #Math #Geometry #2022_08_25_Time_1_ms_(97.24%)_Space_42.7_MB_(17.00%)

import java.util.Arrays;

public class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[] distancesSquared = new int[6];
        distancesSquared[0] = getDistanceSquared(p1, p2);
        distancesSquared[1] = getDistanceSquared(p1, p3);
        distancesSquared[2] = getDistanceSquared(p1, p4);
        distancesSquared[3] = getDistanceSquared(p2, p3);
        distancesSquared[4] = getDistanceSquared(p2, p4);
        distancesSquared[5] = getDistanceSquared(p3, p4);
        Arrays.sort(distancesSquared);
        if (distancesSquared[0] == 0) {
            return false;
        }
        if (distancesSquared[0] != distancesSquared[3]) {
            return false;
        }
        if (distancesSquared[4] != distancesSquared[5]) {
            return false;
        }
        return distancesSquared[5] == 2 * distancesSquared[0];
    }

    private int getDistanceSquared(int[] p1, int[] p2) {
        int deltaX = p2[0] - p1[0];
        int deltaY = p2[1] - p1[1];
        return deltaX * deltaX + deltaY * deltaY;
    }
}
