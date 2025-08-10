package g3601_3700.s3645_maximum_total_from_optimal_activation_order;

// #Medium #Weekly_Contest_462 #2025_08_10_Time_32_ms_(99.42%)_Space_63.82_MB_(35.84%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("unchecked")
public class Solution {
    public long maxTotal(int[] value, int[] limit) {
        int n = value.length;
        List<Integer>[] groups = new ArrayList[n + 1];
        for (int i = 0; i < n; i++) {
            int l = limit[i];
            if (groups[l] == null) {
                groups[l] = new ArrayList<>();
            }
            groups[l].add(value[i]);
        }
        long total = 0;
        for (int l = 1; l <= n; l++) {
            List<Integer> list = groups[l];
            if (list == null) {
                continue;
            }
            list.sort(Collections.reverseOrder());
            int cap = Math.min(l, list.size());
            for (int i = 0; i < cap; i++) {
                total += list.get(i);
            }
        }
        return total;
    }
}
