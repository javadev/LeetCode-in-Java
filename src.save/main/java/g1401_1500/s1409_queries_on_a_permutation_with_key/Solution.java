package g1401_1500.s1409_queries_on_a_permutation_with_key;

// #Medium #Array #Simulation #Binary_Indexed_Tree
// #2022_03_26_Time_15_ms_(38.43%)_Space_43.2_MB_(60.33%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("java:S5413")
public class Solution {
    public int[] processQueries(int[] queries, int m) {
        int[] ans = new int[queries.length];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list.add(i + 1);
        }
        for (int i = 0; i < queries.length; i++) {
            int index = list.indexOf(queries[i]);
            ans[i] = index;
            list.remove(index);
            list.add(0, queries[i]);
        }
        return ans;
    }
}
