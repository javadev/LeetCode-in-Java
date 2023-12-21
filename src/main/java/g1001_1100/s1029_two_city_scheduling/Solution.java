package g1001_1100.s1029_two_city_scheduling;

// #Medium #Array #Sorting #Greedy #2022_02_27_Time_1_ms_(97.54%)_Space_39.9_MB_(53.65%)

import java.util.Arrays;

public class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a, b) -> (a[0] - a[1] - (b[0] - b[1])));
        int cost = 0;
        for (int i = 0; i < costs.length; i++) {
            if (i < costs.length / 2) {
                cost += costs[i][0];
            } else {
                cost += costs[i][1];
            }
        }
        return cost;
    }
}
