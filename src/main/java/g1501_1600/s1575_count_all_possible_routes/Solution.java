package g1501_1600.s1575_count_all_possible_routes;

// #Hard #Array #Dynamic_Programming #Memoization
// #2022_04_11_Time_111_ms_(72.26%)_Space_44.6_MB_(64.16%)

public class Solution {
    private static final int MOD = 1000000007;
    private Integer[][] cache;

    public int countRoutes(int[] locations, int start, int finish, int fuel) {
        this.cache = new Integer[locations.length][fuel + 1];
        return dfs(locations, start, finish, fuel);
    }

    private int dfs(int[] locations, int start, int finish, int fuel) {
        if (this.cache[start][fuel] == null) {
            int count = 0;
            if (start == finish) {
                count = (count + 1) % MOD;
            }
            for (int i = 0; i < locations.length; i++) {
                if (i != start && Math.abs(locations[start] - locations[i]) <= fuel) {
                    count =
                            count
                                    + dfs(
                                            locations,
                                            i,
                                            finish,
                                            fuel - Math.abs(locations[start] - locations[i]));
                    count = count % MOD;
                }
            }
            this.cache[start][fuel] = count;
        }
        return this.cache[start][fuel];
    }
}
