package g2201_2300.s2249_count_lattice_points_inside_a_circle;

// #Medium #Array #Hash_Table #Math #Enumeration #Geometry
// #2022_06_13_Time_54_ms_(92.07%)_Space_41.4_MB_(91.10%)

public class Solution {
    public int countLatticePoints(int[][] circles) {
        int xMin = 200;
        int xMax = -1;
        int yMin = 200;
        int yMax = -1;
        for (int[] c : circles) {
            xMin = Math.min(xMin, c[0] - c[2]);
            xMax = Math.max(xMax, c[0] + c[2]);
            yMin = Math.min(yMin, c[1] - c[2]);
            yMax = Math.max(yMax, c[1] + c[2]);
        }
        int ans = 0;
        for (int x = xMin; x <= xMax; x++) {
            for (int y = yMin; y <= yMax; y++) {
                for (int[] c : circles) {
                    if ((c[0] - x) * (c[0] - x) + (c[1] - y) * (c[1] - y) <= c[2] * c[2]) {
                        ans++;
                        break;
                    }
                }
            }
        }
        return ans;
    }
}
