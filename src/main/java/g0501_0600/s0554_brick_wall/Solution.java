package g0501_0600.s0554_brick_wall;

// #Medium #Array #Hash_Table

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> map = new HashMap();
        for (List<Integer> row : wall) {
            int sum = 0;
            for (int i = 0; i < row.size() - 1; i++) {
                // NOTE: i < row.size()-1
                sum += row.get(i);
                if (map.containsKey(sum)) {
                    map.put(sum, map.get(sum) + 1);
                } else {
                    map.put(sum, 1);
                }
            }
        }
        int result = wall.size();
        for (int key : map.keySet()) {
            result = Math.min(result, wall.size() - map.get(key));
        }
        return result;
    }
}
