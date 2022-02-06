package g0801_0900.s0877_stone_game;

// #Medium #Array #Dynamic_Programming #Math #Game_Theory

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
