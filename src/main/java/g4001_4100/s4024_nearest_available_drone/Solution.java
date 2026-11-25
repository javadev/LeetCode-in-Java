package g4001_4100.s4024_nearest_available_drone;

// #Easy #Array #Enumeration #Mid_Level #Weekly_Contest_515
// #2026_11_25_Time_2_ms_(50.35%)_Space_45.70_MB_(93.36%)

public class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int ri = -1;

        for (int i = 0, l = drones.length, x = target[0], y = target[1], rv = Integer.MAX_VALUE, d;
                i < l;
                i++) {
            d = Math.abs(x - drones[i][0]) + Math.abs(y - drones[i][1]);

            if (d < rv && d <= drones[i][2]) {
                rv = d;
                ri = i;
            }
        }

        return ri;
    }
}
