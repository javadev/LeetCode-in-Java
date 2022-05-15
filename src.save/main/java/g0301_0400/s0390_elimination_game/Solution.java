package g0301_0400.s0390_elimination_game;

// #Medium #Math #Acceptance_46.4% #2022_03_16_Time_2_ms_(100.00%)_Space_41.3_MB_(71.55%)

public class Solution {
    public int lastRemaining(int n) {
        return n == 1 ? 1 : 2 * (n / 2 - lastRemaining(n / 2) + 1);
    }
}
