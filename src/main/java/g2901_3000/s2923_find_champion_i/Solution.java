package g2901_3000.s2923_find_champion_i;

// #Easy #Array #Matrix #2023_12_29_Time_1_ms_(96.00%)_Space_45.2_MB_(6.05%)

public class Solution {
    public int findChampion(int[][] grid) {
        int champion = grid[1][0];
        for (int opponent = 2; opponent < grid.length; opponent++) {
            if (grid[opponent][champion] != 0) {
                champion = opponent;
            }
        }
        return champion;
    }
}
