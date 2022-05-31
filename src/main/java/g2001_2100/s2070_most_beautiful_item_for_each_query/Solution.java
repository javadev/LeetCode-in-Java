package g2001_2100.s2070_most_beautiful_item_for_each_query;

// #Medium #Array #Sorting #Binary_Search #2022_05_30_Time_53_ms_(96.04%)_Space_119.9_MB_(48.51%)

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        int[] res = new int[queries.length];
        Arrays.sort(items, Comparator.comparingInt(a -> a[1]));
        for (int i = 0; i < res.length; i++) {
            res[i] = maxBeauty(items, queries[i]);
        }
        return res;
    }

    private int maxBeauty(int[][] items, int query) {
        for (int i = items.length - 1; i >= 0; i--) {
            int price = items[i][0];
            int beauty = items[i][1];
            if (price <= query) {
                return beauty;
            }
        }
        return 0;
    }
}
