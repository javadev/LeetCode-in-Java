package g0501_0600.s0554_brick_wall;

// #Medium #Array #Hash_Table #2022_08_03_Time_12_ms_(87.69%)_Space_55.8_MB_(7.95%)

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> map = new HashMap<>();
        for (List<Integer> row : wall) {
            int sum = 0;
            for (int i = 0; i < row.size() - 1; i++) {
                sum += row.get(i);
                if (map.containsKey(sum)) {
                    map.put(sum, map.get(sum) + 1);
                } else {
                    map.put(sum, 1);
                }
            }
        }
        int result = wall.size();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result = Math.min(result, wall.size() - entry.getValue());
        }
        return result;
    }
}
