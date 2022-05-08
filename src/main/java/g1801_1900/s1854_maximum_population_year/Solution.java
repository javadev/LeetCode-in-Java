package g1801_1900.s1854_maximum_population_year;

// #Easy #Array #Counting #2022_05_08_Time_10_ms_(9.66%)_Space_43.8_MB_(6.38%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maximumPopulation(int[][] logs) {
        int maxCnt = 0;
        int earliest = logs[0][0];
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] people : logs) {
            for (int i = people[0]; i < people[1]; i++) {
                int val = map.getOrDefault(i, 0) + 1;
                map.put(i, val);
                if (maxCnt < val) {
                    maxCnt = val;
                    earliest = i;
                } else if (maxCnt == val) {
                    earliest = Math.min(earliest, i);
                }
            }
        }
        return earliest;
    }
}
