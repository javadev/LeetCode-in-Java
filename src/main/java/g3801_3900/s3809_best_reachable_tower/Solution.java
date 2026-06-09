package g3801_3900.s3809_best_reachable_tower;

// #Medium #Array #Senior #Biweekly_Contest_174
// #2026_06_09_Time_3_ms_(70.30%)_Space_219.56_MB_(26.73%)

public class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int bestX = -1;
        int bestY = -1;
        int bestQ = -1;
        int cx = center[0];
        int cy = center[1];
        for (int[] t : towers) {
            int x = t[0];
            int y = t[1];
            int q = t[2];
            long dx = Math.abs((long) x - cx);
            long dy = Math.abs((long) y - cy);
            if (dx + dy <= radius
                    && (q > bestQ
                            || (q == bestQ
                                    && (bestX == -1 || x < bestX || (x == bestX && y < bestY))))) {
                bestQ = q;
                bestX = x;
                bestY = y;
            }
        }
        return bestQ == -1 ? new int[] {-1, -1} : new int[] {bestX, bestY};
    }
}
