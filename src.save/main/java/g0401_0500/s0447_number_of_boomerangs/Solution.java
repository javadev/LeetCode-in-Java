package g0401_0500.s0447_number_of_boomerangs;

// #Medium #Array #Hash_Table #Math #2022_06_03_Time_156_ms_(80.44%)_Space_109.2_MB_(69.17%)

import java.util.HashMap;

public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i == j) {
                    continue;
                }
                int dis = dist(points[i], points[j]);
                int prev = m.getOrDefault(dis, 0);
                if (prev >= 1) {
                    ans += prev * 2;
                }
                m.put(dis, prev + 1);
            }
            m.clear();
        }
        return ans;
    }

    private int dist(int[] d1, int[] d2) {
        return (d1[0] - d2[0]) * (d1[0] - d2[0]) + (d1[1] - d2[1]) * (d1[1] - d2[1]);
    }
}
