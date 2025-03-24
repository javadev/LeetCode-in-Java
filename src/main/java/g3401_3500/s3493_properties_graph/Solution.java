package g3401_3500.s3493_properties_graph;

// #Medium #Array #Hash_Table #Graph #Union_Find #Depth_First_Search #Breadth_First_Search
// #2025_03_24_Time_27_ms_(99.82%)_Space_46.06_MB_(37.59%)

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    private int[] parent;

    public int numberOfComponents(int[][] properties, int k) {
        List<List<Integer>> al = convertToList(properties);
        int n = al.size();
        List<BitSet> bs = new ArrayList<>(n);
        for (List<Integer> integers : al) {
            BitSet bitset = new BitSet(101);
            for (int num : integers) {
                bitset.set(num);
            }
            bs.add(bitset);
        }
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                BitSet temp = (BitSet) bs.get(i).clone();
                temp.and(bs.get(j));
                int common = temp.cardinality();
                if (common >= k) {
                    unionn(i, j);
                }
            }
        }
        Set<Integer> comps = new HashSet<>();
        for (int i = 0; i < n; i++) {
            comps.add(findp(i));
        }
        return comps.size();
    }

    private int findp(int x) {
        if (parent[x] != x) {
            parent[x] = findp(parent[x]);
        }
        return parent[x];
    }

    private void unionn(int a, int b) {
        int pa = findp(a);
        int pb = findp(b);
        if (pa != pb) {
            parent[pa] = pb;
        }
    }

    private List<List<Integer>> convertToList(int[][] arr) {
        List<List<Integer>> list = new ArrayList<>();
        for (int[] row : arr) {
            List<Integer> temp = new ArrayList<>();
            for (int num : row) {
                temp.add(num);
            }
            list.add(temp);
        }
        return list;
    }
}
