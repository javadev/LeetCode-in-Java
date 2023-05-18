package g1201_1300.s1217_minimum_cost_to_move_chips_to_the_same_position;

// #Easy #Array #Math #Greedy #2022_03_09_Time_0_ms_(100.00%)_Space_41.8_MB_(27.65%)

public class Solution {
    public int minCostToMoveChips(int[] position) {
        int chipsAtOddPosition = 0;
        int chipsAtEvenPosition = 0;
        for (int j : position) {
            if (j % 2 == 0) {
                chipsAtEvenPosition++;
            } else {
                chipsAtOddPosition++;
            }
        }
        return Math.min(chipsAtEvenPosition, chipsAtOddPosition);
    }
}
