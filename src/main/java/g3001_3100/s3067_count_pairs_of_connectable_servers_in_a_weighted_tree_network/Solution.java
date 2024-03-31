package g3001_3100.s3067_count_pairs_of_connectable_servers_in_a_weighted_tree_network;

// #Medium #Array #Depth_First_Search #Tree #2024_03_31_Time_69_ms_(99.83%)_Space_45.5_MB_(81.49%)

import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class Solution {
    private ArrayList<Integer>[] adj;

    public int[] countPairsOfConnectableServers(int[][] edges, int signalSpeed) {
        int n = edges.length + 1;
        adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            adj[u].add(v);
            adj[v].add(u);
            adj[u].add(w);
            adj[v].add(w);
        }
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            if (adj[i].size() > 2) {
                ArrayList<Integer> al = new ArrayList<>();
                for (int j = 0; j < adj[i].size(); j += 2) {
                    int[] cnt = new int[1];
                    dfs(adj[i].get(j), i, adj[i].get(j + 1), cnt, signalSpeed);
                    al.add(cnt[0]);
                }
                int sum = 0;
                for (int j : al) {
                    res[i] += (sum * j);
                    sum += j;
                }
            }
        }
        return res;
    }

    void dfs(int node, int par, int sum, int[] cnt, int ss) {
        if (sum % ss == 0) {
            cnt[0]++;
        }
        for (int i = 0; i < adj[node].size(); i += 2) {
            int child = adj[node].get(i);
            if (child != par) {
                dfs(child, node, sum + adj[node].get(i + 1), cnt, ss);
            }
        }
    }
}
