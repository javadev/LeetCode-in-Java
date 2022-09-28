package g1901_2000.s1916_count_ways_to_build_rooms_in_an_ant_colony;

// #Hard #Dynamic_Programming #Math #Tree #Graph #Topological_Sort #Combinatorics
// #2022_05_14_Time_1527_ms_(34.38%)_Space_106_MB_(87.50%)

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unchecked")
public class Solution {
    private static final int MOD = 1000000007;
    private List<Integer>[] graph;
    private long[] fact;

    public int waysToBuildRooms(int[] prevRoom) {
        int n = prevRoom.length;
        graph = new ArrayList[n];
        Arrays.setAll(graph, e -> new ArrayList<>());
        fact = new long[prevRoom.length + 10];
        fact[0] = fact[1] = 1;
        for (int i = 2; i < fact.length; i++) {
            fact[i] = fact[i - 1] * i;
            fact[i] %= MOD;
        }
        for (int i = 1; i < prevRoom.length; i++) {
            int pre = prevRoom[i];
            graph[pre].add(i);
        }

        long[] res = dfs(0);
        return (int) (res[1] % MOD);
    }

    private long[] dfs(int root) {
        long[] res = new long[] {1, 0};
        int cnt = 0;
        List<long[]> list = new ArrayList<>();
        for (int next : graph[root]) {
            long[] v = dfs(next);
            cnt += (int) v[0];
            list.add(v);
        }
        res[0] += cnt;
        long com = 1;
        for (long[] p : list) {
            long choose = c(cnt, (int) (p[0]));
            cnt -= p[0];
            com = com * choose;
            com %= MOD;
            com = com * p[1];
            com %= MOD;
        }
        res[1] = com;
        return res;
    }

    private long c(int i, int j) {
        long mod = 1000000007;
        long prevRoom = fact[i];
        long b = ((fact[i - j] % mod) * (fact[j] % mod)) % mod;
        BigInteger value = BigInteger.valueOf(b);
        long binverse = value.modInverse(BigInteger.valueOf(mod)).longValue();
        return (prevRoom * (binverse % mod)) % mod;
    }
}
