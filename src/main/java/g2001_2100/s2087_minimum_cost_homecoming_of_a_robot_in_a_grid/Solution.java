package g2001_2100.s2087_minimum_cost_homecoming_of_a_robot_in_a_grid;

// #Medium #Array #Greedy #Matrix #2022_05_27_Time_1_ms_(98.94%)_Space_62.1_MB_(77.25%)

public class Solution {
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        int total = 0;
        // if home is to the down of start move, down till there
        if (homePos[0] > startPos[0]) {
            int i = startPos[0] + 1;
            while (i <= homePos[0]) {
                // adding cost while moving corresponding to the cell
                total += rowCosts[i];
                i++;
            }
            // else if home is up from the start, move up till there
        } else if (homePos[0] < startPos[0]) {
            int i = startPos[0] - 1;
            while (i >= homePos[0]) {
                // adding cost while moving corresponding to the cell
                total += rowCosts[i];
                i--;
            }
        }
        // if home is right to the start, move right till there
        if (homePos[1] > startPos[1]) {
            int i = startPos[1] + 1;
            while (i <= homePos[1]) {
                // adding cost while moving corresponding to the cell
                total += colCosts[i];
                i++;
            }
            // else if home is left to the start, move left till there
        } else if (homePos[1] < startPos[1]) {
            int i = startPos[1] - 1;
            while (i >= homePos[1]) {
                // adding cost while moving corresponding to the cell
                total += colCosts[i];
                i--;
            }
        }
        return total;
    }
}
