package g2001_2100.s2087_minimum_cost_homecoming_of_a_robot_in_a_grid;

// #Medium #Array #Greedy #Matrix #2022_05_27_Time_2_ms_(79.89%)_Space_61.9_MB_(83.07%)

public class Solution {
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        int cost = 0;
        for (int i = Math.min(startPos[0], homePos[0]);
                i <= Math.max(startPos[0], homePos[0]);
                i++) {
            cost += rowCosts[i];
        }
        for (int j = Math.min(startPos[1], homePos[1]);
                j <= Math.max(startPos[1], homePos[1]);
                j++) {
            cost += colCosts[j];
        }
        return cost - rowCosts[startPos[0]] - colCosts[startPos[1]];
    }
}
