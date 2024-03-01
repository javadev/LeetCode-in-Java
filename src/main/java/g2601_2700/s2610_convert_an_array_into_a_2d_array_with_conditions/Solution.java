package g2601_2700.s2610_convert_an_array_into_a_2d_array_with_conditions;

// #Medium #Array #Hash_Table #2023_08_30_Time_2_ms_(97.24%)_Space_43.9_MB_(80.58%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
            int idx = map.get(x);
            if (res.size() < idx) {
                res.add(new ArrayList<>());
            }
            res.get(idx - 1).add(x);
        }
        return res;
    }
}
