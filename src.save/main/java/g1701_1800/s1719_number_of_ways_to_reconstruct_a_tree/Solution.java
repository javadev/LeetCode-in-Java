package g1701_1800.s1719_number_of_ways_to_reconstruct_a_tree;

// #Hard #Tree #Graph #Topological_Sort #2022_04_24_Time_91_ms_(67.57%)_Space_87.3_MB_(78.38%)

import java.util.HashSet;

@SuppressWarnings("java:S1119")
public class Solution {
    public int checkWays(int[][] pairs) {
        int[][] adj = new int[501][501];
        HashSet<Integer> set = new HashSet<>();
        for (int[] pair : pairs) {
            adj[pair[0]][pair[1]]++;
            adj[pair[1]][pair[0]]++;
            set.add(pair[0]);
            set.add(pair[1]);
        }
        int n = set.size();
        int[] num = new int[501];
        for (int i = 0; i < 501; i++) {
            for (int j = 0; j < 501; j++) {
                num[i] += adj[i][j];
            }
        }
        int c = 0;
        for (int i = 0; i < 501; i++) {
            if (num[i] == n - 1) {
                c++;
            }
        }
        for (int j = 0; j < 501; j++) {
            if (num[j] == n - 1) {
                num[j] = 0;
                for (int k = 0; k < 501; k++) {
                    if (adj[j][k] > 0) {
                        adj[j][k] = 0;
                        adj[k][j] = 0;
                        num[k]--;
                    }
                }
                set.remove(j);
                break;
            }
            if (j == 500) {
                return 0;
            }
        }
        int res = search(adj, num, set);
        if (res == 1 && c > 1) {
            return 2;
        }
        return res;
    }

    private int search(int[][] adj, int[] num, HashSet<Integer> vals) {
        if (vals.isEmpty()) {
            return 1;
        }
        int max = 0;
        for (int i : vals) {
            if (num[i] > num[max]) {
                max = i;
            }
        }
        int size = num[max];
        if (size == 0) {
            return 1;
        }
        boolean c = false;
        i:
        for (int i : vals) {
            if (num[i] == num[max]) {
                for (int j : vals) {
                    if (j != i && num[j] == num[i] && adj[i][j] > 0) {
                        c = true;
                        break i;
                    }
                }
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for (int j = 0; j < 501; j++) {
            if (adj[max][j] > 0 && !vals.contains(j)) {
                return 0;
            }
            if (adj[max][j] > 0) {
                adj[max][j] = 0;
                adj[j][max] = 0;
                num[j]--;
                set.add(j);
            }
        }
        num[max] = 0;
        HashSet<Integer> set2 = new HashSet<>();
        for (int i : vals) {
            if (!set.contains(i) && i != max) {
                set2.add(i);
            }
        }
        int res1 = search(adj, num, set);
        int res2 = search(adj, num, set2);
        if (res1 == 0 || res2 == 0) {
            return 0;
        }
        if (res1 == 2 || res2 == 2 || c) {
            return 2;
        }
        return 1;
    }
}
