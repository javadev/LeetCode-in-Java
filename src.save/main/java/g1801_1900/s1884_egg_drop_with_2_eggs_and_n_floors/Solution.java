package g1801_1900.s1884_egg_drop_with_2_eggs_and_n_floors;

// #Medium #Dynamic_Programming #Math #2022_05_10_Time_0_ms_(100.00%)_Space_39_MB_(97.33%)

public class Solution {
    public int twoEggDrop(int n) {
        // given x steps, the maximum floors I can test with two eggs
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            // move is i, previous move is i - 1,
            // we put egg on floor i, if egg breaks, we can check i - 1 floors with i - 1 moves
            // if egg does not break, we can check dp[i-1] floors having two eggs to with i - 1
            // moves
            dp[i] = 1 + i - 1 + dp[i - 1];
            if (dp[i] >= n) {
                return i;
            }
        }
        return 0;
    }
}
