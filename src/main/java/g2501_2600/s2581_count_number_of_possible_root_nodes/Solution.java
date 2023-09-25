package g2501_2600.s2581_count_number_of_possible_root_nodes;

// #Hard #Hash_Table #Dynamic_Programming #Depth_First_Search #Tree
// #2023_08_22_Time_38_ms_(100.00%)_Space_106.2_MB_(96.15%)

import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("unchecked")
public class Solution {
    public int rootCount(int[][] eg, int[][] gu, int k) {
        int n = eg.length + 1;
        List<Integer>[] g = new List[n];
        for (int i = 0; i < n; i++) {
            g[i] = new LinkedList<>();
        }
        for (int[] a : eg) {
            g[a[0]].add(a[1]);
            g[a[1]].add(a[0]);
        }
        int all = 0;
        int[] add = new int[n];
        int[] par = new int[n];
        dfs1(g, 0, -1, par);
        for (int[] a : gu) {
            if (par[a[1]] == a[0]) {
                all++;
                add[a[1]]--;
            } else {
                add[a[0]]++;
            }
        }
        dfs2(g, 0, -1, add);
        int ans = 0;
        for (int i : add) {
            if (i + all >= k) {
                ans++;
            }
        }
        return ans;
    }

    private void dfs1(List<Integer>[] g, int s, int p, int[] par) {
        par[s] = p;
        for (int i : g[s]) {
            if (i != p) {
                dfs1(g, i, s, par);
            }
        }
    }

    private void dfs2(List<Integer>[] g, int s, int p, int[] add) {
        for (int i : g[s]) {
            if (i != p) {
                add[i] += add[s];
                dfs2(g, i, s, add);
            }
        }
    }
}
