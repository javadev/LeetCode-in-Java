package g1201_1300.s1202_smallest_string_with_swaps;

// #Medium #String #Hash_Table #Depth_First_Search #Breadth_First_Search #Union_Find
// #2022_03_08_Time_43_ms_(86.82%)_Space_94.1_MB_(64.69%)

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        UF uf = new UF(s.length());
        for (List<Integer> p : pairs) {
            uf.union(p.get(0), p.get(1));
        }

        Map<Integer, int[]> freqMapPerRoot = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            freqMapPerRoot.computeIfAbsent(uf.find(i), x -> new int[26])[s.charAt(i) - 'a']++;
        }

        char[] ans = new char[s.length()];
        for (int i = 0; i < ans.length; i++) {
            int[] css = freqMapPerRoot.get(uf.find(i));
            for (int j = 0; j < css.length; j++) {
                if (css[j] > 0) {
                    ans[i] = (char) (j + 'a');
                    css[j]--;
                    break;
                }
            }
        }
        return new String(ans);
    }

    static class UF {
        int[] root;
        int[] rank;

        UF(int n) {
            root = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                root[i] = i;
                rank[i] = 1;
            }
        }

        int find(int u) {
            if (u == root[u]) {
                return u;
            }

            root[u] = find(root[u]);
            return root[u];
        }

        void union(int u, int v) {
            int ru = find(root[u]);
            int rv = find(root[v]);
            if (ru != rv) {
                if (rank[ru] < rank[rv]) {
                    root[ru] = root[rv];
                } else if (rank[ru] > rank[rv]) {
                    root[rv] = root[ru];
                } else {
                    root[rv] = root[ru];
                    rank[ru]++;
                }
            }
        }
    }
}
