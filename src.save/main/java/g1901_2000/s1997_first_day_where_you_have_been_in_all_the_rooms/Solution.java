package g1901_2000.s1997_first_day_where_you_have_been_in_all_the_rooms;

// #Medium #Array #Dynamic_Programming #2022_05_16_Time_14_ms_(83.10%)_Space_98.2_MB_(22.53%)

public class Solution {
    public int firstDayBeenInAllRooms(int[] nextVisit) {
        int[] dp = new int[nextVisit.length];
        int m = 1000000007;
        for (int i = 1; i < dp.length; i++) {
            int steps = 2 * dp[i - 1] - dp[nextVisit[i - 1]] + 2;
            dp[i] = steps < 0 ? (steps + m) % m : steps % m;
        }
        return dp[dp.length - 1];
    }
}
