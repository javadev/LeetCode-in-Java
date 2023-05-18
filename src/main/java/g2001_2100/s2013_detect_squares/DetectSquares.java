package g2001_2100.s2013_detect_squares;

// #Medium #Array #Hash_Table #Design #Counting
// #2022_05_24_Time_67_ms_(88.46%)_Space_46.1_MB_(96.15%)

import java.util.HashMap;
import java.util.Map;

public class DetectSquares {
    private static final int MUL = 1002;
    private final Map<Integer, int[]> map;

    public DetectSquares() {
        this.map = new HashMap<>();
    }

    public void add(int[] point) {
        int x = point[0];
        int y = point[1];
        int hash = x * MUL + y;
        if (map.containsKey(hash)) {
            map.get(hash)[2]++;
        } else {
            map.put(hash, new int[] {x, y, 1});
        }
    }

    public int count(int[] point) {
        int ans = 0;
        int x = point[0];
        int y = point[1];
        for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
            int[] diap = entry.getValue();
            int x1 = diap[0];
            int y1 = diap[1];
            int num = diap[2];
            if (Math.abs(x - x1) == Math.abs(y - y1) && x != x1 && y != y1) {
                int p1hash = x * MUL + y1;
                int p2hash = x1 * MUL + y;
                if (map.containsKey(p1hash) && map.containsKey(p2hash)) {
                    ans += map.get(p1hash)[2] * map.get(p2hash)[2] * num;
                }
            }
        }
        return ans;
    }
}
