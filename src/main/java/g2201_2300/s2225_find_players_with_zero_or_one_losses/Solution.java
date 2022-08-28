package g2201_2300.s2225_find_players_with_zero_or_one_losses;

// #Medium #Array #Hash_Table #Sorting #Counting
// #2022_06_12_Time_96_ms_(87.03%)_Space_105.4_MB_(75.62%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];
            map.putIfAbsent(winner, 0);
            map.put(loser, map.getOrDefault(loser, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 0) {
                list1.add(entry.getKey());
            }
            if (entry.getValue() == 1) {
                list2.add(entry.getKey());
            }
        }
        Collections.sort(list1);
        Collections.sort(list2);
        res.add(list1);
        res.add(list2);
        return res;
    }
}
