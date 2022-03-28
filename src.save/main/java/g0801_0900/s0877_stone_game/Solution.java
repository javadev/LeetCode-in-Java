package g0801_0900.s0877_stone_game;

// #Medium #Array #Dynamic_Programming #Math #Game_Theory
// #2022_03_28_Time_0_ms_(100.00%)_Space_41.7_MB_(79.95%)

public class Solution {
    public boolean stoneGame(int[] piles) {
        int low = 0;
        int high = piles.length - 1;
        int alice = 0;
        int bob = 0;
        while (low < high) {
            alice += Math.max(piles[low], piles[high]);
            bob += Math.min(piles[low], piles[high]);
            low++;
            high--;
        }
        return alice > bob;
    }
}
