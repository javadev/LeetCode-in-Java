package g1501_1600.s1579_remove_max_number_of_edges_to_keep_graph_fully_traversable;

// #Hard #Graph #Union_Find #2022_04_11_Time_30_ms_(66.23%)_Space_83.1_MB_(95.61%)

import java.util.Arrays;

public class Solution {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        Arrays.sort(edges, (a, b) -> (b[0] - a[0]));
        int[] alice = new int[n + 1];
        int[] rankAlice = new int[n + 1];
        int[] bob = new int[n + 1];
        int[] rankBob = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            alice[i] = i;
            bob[i] = i;
        }
        int countAlice = n;
        int countBob = n;
        int remove = 0;
        for (int[] edge : edges) {
            int type = edge[0];
            int u = edge[1];
            int v = edge[2];
            if (type == 1) {
                boolean a = union(u, v, alice, rankAlice);
                if (a) {
                    countAlice--;
                } else {
                    remove++;
                }
            } else if (type == 2) {
                boolean b = union(u, v, bob, rankBob);
                if (b) {
                    countBob--;
                } else {
                    remove++;
                }
            } else {
                boolean b = union(u, v, bob, rankBob);
                boolean a = union(u, v, alice, rankAlice);
                if (!a && !b) {
                    remove++;
                }
                if (a) {
                    countAlice--;
                }
                if (b) {
                    countBob--;
                }
            }
        }
        if (countAlice != 1 || countBob != 1) {
            return -1;
        }
        return remove;
    }

    public boolean union(int x, int y, int[] arr, int[] rank) {
        int p1 = find(arr[x], arr);
        int p2 = find(arr[y], arr);
        if (p1 != p2) {
            if (rank[p1] > rank[p2]) {
                arr[p2] = p1;
            } else if (rank[p1] < rank[p2]) {
                arr[p1] = p2;
            } else {
                arr[p1] = p2;
                rank[p2]++;
            }
            return true;
        }
        return false;
    }

    public int find(int x, int[] arr) {
        if (arr[x] == x) {
            return x;
        }
        int temp = find(arr[x], arr);
        arr[x] = temp;
        return temp;
    }
}
