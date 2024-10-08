package g3301_3400.s3311_construct_2d_grid_matching_graph_layout;

// #Hard #Array #Hash_Table #Matrix #Graph #2024_10_08_Time_43_ms_(94.34%)_Space_103.6_MB_(79.25%)

import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class Solution {
    public int[][] constructGridLayout(int n, int[][] edges) {
        final int[] cs = new int[n];
        final ArrayList<Integer>[] als = new ArrayList[n];
        for (int i = 0; i < n; ++i) {
            als[i] = new ArrayList<>();
        }
        for (int[] e : edges) {
            cs[e[0]]++;
            cs[e[1]]++;
            als[e[0]].add(e[1]);
            als[e[1]].add(e[0]);
        }
        int min = 4;
        for (int a : cs) {
            min = Math.min(min, a);
        }
        final boolean[] seen = new boolean[n];
        int[][] res;
        int st = 0;
        for (int i = 0; i < n; ++i) {
            if (cs[i] == min) {
                st = i;
                break;
            }
        }
        if (min == 1) {
            res = new int[1][n];
            for (int i = 0; i < n; ++i) {
                res[0][i] = st;
                seen[st] = true;
                if (i + 1 < n) {
                    for (int a : als[st]) {
                        if (!seen[a]) {
                            st = a;
                            break;
                        }
                    }
                }
            }
            return res;
        }
        int row2 = -1;
        for (int a : als[st]) {
            if (cs[a] == min) {
                row2 = a;
                break;
            }
        }
        if (row2 >= 0) {
            res = new int[2][n / 2];
            res[0][0] = st;
            res[1][0] = row2;
            seen[st] = seen[row2] = true;
            for (int i = 1; i < res[0].length; ++i) {
                for (int a : als[res[0][i - 1]]) {
                    if (!seen[a]) {
                        res[0][i] = a;
                        seen[a] = true;
                        break;
                    }
                }
                for (int a : als[res[1][i - 1]]) {
                    if (!seen[a]) {
                        res[1][i] = a;
                        seen[a] = true;
                        break;
                    }
                }
            }
            return res;
        }
        final ArrayList<Integer> al = new ArrayList<>();
        boolean f = true;
        seen[st] = true;
        al.add(st);
        while (f) {
            f = false;
            for (int a : als[st]) {
                if (!seen[a] && cs[a] <= 3) {
                    seen[a] = true;
                    al.add(a);
                    if (cs[a] == 3) {
                        f = true;
                        st = a;
                    }
                    break;
                }
            }
        }
        res = new int[n / al.size()][al.size()];
        for (int i = 0; i < res[0].length; ++i) {
            res[0][i] = al.get(i);
        }
        for (int i = 1; i < res.length; ++i) {
            for (int j = 0; j < res[0].length; ++j) {
                for (int a : als[res[i - 1][j]]) {
                    if (!seen[a]) {
                        res[i][j] = a;
                        seen[a] = true;
                        break;
                    }
                }
            }
        }
        return res;
    }
}
