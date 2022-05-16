package g1901_2000.s1997_first_day_where_you_have_been_in_all_the_rooms;

// #Medium #Array #Dynamic_Programming #2022_05_16_Time_12_ms_(92.96%)_Space_98.5_MB_(21.13%)

public class Solution {
    private static final int MOD = 1_000_000_007;

    public int firstDayBeenInAllRooms(int[] nextVisit) {
        int n = nextVisit.length;
        int[] ps = new int[n];
        ps[0] = 2;
        for (int i = 1; i < n - 1; i++) {
            int j = nextVisit[i];
            // if I arrive to room i with an odd number of visits, how many days will it take me to
            // move to i+1
            int days = 2 + (ps[i - 1] - (j == 0 ? 0 : ps[j - 1]));
            if (days < 0) {
                days += MOD;
            }
            if (days >= MOD) {
                days -= MOD;
            }
            ps[i] = ps[i - 1] + days;
            if (ps[i] >= MOD) {
                ps[i] -= MOD;
            }
        }
        return ps[n - 2];
    }
}
