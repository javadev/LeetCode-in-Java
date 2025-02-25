package g2601_2700.s2610_convert_an_array_into_a_2d_array_with_conditions;

// #Medium #Array #Hash_Table #2025_02_25_Time_1_ms_(100.00%)_Space_45.01_MB_(53.07%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        int[] freq = new int[n + 1];
        for (int num : nums) {
            if (res.size() < ++freq[num]) {
                res.add(new ArrayList<>());
            }
            res.get(freq[num] - 1).add(num);
        }
        return res;
    }
}
