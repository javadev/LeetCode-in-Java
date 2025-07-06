package g3601_3700.s3607_power_grid_maintenance;

// #Medium #2025_07_06_Time_74_ms_(97.09%)_Space_131.74_MB_(75.90%)

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

@SuppressWarnings("unchecked")
public class Solution {
    private static class UF {
        int[] par;
        PriorityQueue<Integer>[] pq;
        boolean[] active;

        UF(int n) {
            par = new int[n];
            pq = new PriorityQueue[n];
            active = new boolean[n];
            for (int i = 0; i < n; i++) {
                active[i] = true;
                par[i] = i;
                pq[i] = new PriorityQueue<>();
                pq[i].add(i);
            }
        }

        int find(int u) {
            if (par[u] == u) {
                return u;
            }
            return par[u] = find(par[u]);
        }

        void union(int u, int v) {
            int pu = find(u);
            int pv = find(v);
            if (pu == pv) {
                return;
            }
            if (pq[pu].size() > pq[pv].size()) {
                while (!pq[pv].isEmpty()) {
                    pq[pu].add(pq[pv].poll());
                }
                par[pv] = par[pu];
            } else {
                while (!pq[pu].isEmpty()) {
                    pq[pv].add(pq[pu].poll());
                }
                par[pu] = par[pv];
            }
        }

        void inactive(int u) {
            active[u] = false;
        }

        int check(int u) {
            if (active[u]) {
                return u;
            }
            int pu = find(u);
            while (!pq[pu].isEmpty() && !active[pq[pu].peek()]) {
                pq[pu].poll();
            }
            return !pq[pu].isEmpty() ? pq[pu].peek() : -2;
        }
    }

    public int[] processQueries(int c, int[][] connections, int[][] queries) {
        UF uf = new UF(c);
        for (int[] con : connections) {
            int u = con[0];
            int v = con[1];
            uf.union(u - 1, v - 1);
        }
        List<Integer> res = new ArrayList<>();
        for (int[] q : queries) {
            if (q[0] == 1) {
                res.add(uf.check(q[1] - 1) + 1);
            } else {
                uf.inactive(q[1] - 1);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
