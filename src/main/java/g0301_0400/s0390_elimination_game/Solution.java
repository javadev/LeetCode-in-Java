package g0301_0400.s0390_elimination_game;

// #Medium #Math

public class Solution {
    public int lastRemaining(int n) {
        return n == 1 ? 1 : 2 * (n / 2 - lastRemaining(n / 2) + 1);
    }
}
