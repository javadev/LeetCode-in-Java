package g2101_2200.s2150_find_all_lonely_numbers_in_the_array;

// #Medium #Array #Hash_Table #Counting #2022_05_31_Time_93_ms_(70.66%)_Space_63.5_MB_(80.52%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i : nums) {
            m.put(i, m.getOrDefault(i, 0) + 1);
        }
        for (int i : nums) {
            if (m.get(i) == 1 && !m.containsKey(i - 1) && !m.containsKey(i + 1)) {
                ans.add(i);
            }
        }
        return ans;
    }
}
