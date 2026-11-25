package g4001_4100.s4024_nearest_available_drone;

// #Easy #Array #Enumeration #Mid_Level #Weekly_Contest_515
// #2026_11_25_Time_2_ms_(50.35%)_Space_45.70_MB_(93.36%)

public class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int min = Integer.MAX_VALUE;
        int idx = -1;
        for (int i = 0; i < drones.length; i++) {
            int[] d = drones[i];
            int dist = Math.abs(target[0] - d[0]) + Math.abs(target[1] - d[1]);
            if (dist <= d[2] && min > dist) {
                min = dist;
                idx = i;
            }
        }
        return idx;
    }
}
