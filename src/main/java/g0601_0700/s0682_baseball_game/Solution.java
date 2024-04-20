package g0601_0700.s0682_baseball_game;

// #Easy #Array #Stack #Simulation #2022_03_22_Time_4_ms_(57.60%)_Space_42.7_MB_(24.43%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int calPoints(String[] ops) {
        List<Integer> resultList = new ArrayList<>(ops.length);
        for (String op : ops) {
            int size = resultList.size();
            if ("C".equals(op)) {
                resultList.remove(size - 1);
            } else if ("D".equals(op)) {
                resultList.add(resultList.get(size - 1) * 2);
            } else if ("+".equals(op)) {
                resultList.add(resultList.get(size - 1) + resultList.get(size - 2));
            } else {
                resultList.add(Integer.parseInt(op));
            }
        }
        return resultList.stream().reduce(0, Integer::sum);
    }
}
