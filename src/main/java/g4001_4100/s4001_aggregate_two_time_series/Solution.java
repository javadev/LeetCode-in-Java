package g4001_4100.s4001_aggregate_two_time_series;

// #Medium #Array #Two_Pointers #Senior #Weekly_Contest_512
// #2026_11_17_Time_9_ms_(100.00%)_Space_167.92_MB_(85.71%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] left, int[][] right) {
        int n = left.length;
        int m = right.length;
        List<List<Integer>> result = new ArrayList<>(left.length + m);
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            int[] lp = left[i];
            int[] rp = right[j];
            int cmp = Integer.compare(lp[0], rp[0]);
            int value = lp[1] + rp[1];
            if (cmp < 0) {
                result.add(List.of(lp[0], value));
                i++;
            } else if (cmp > 0) {
                result.add(List.of(rp[0], value));
                j++;
            } else {
                result.add(List.of(rp[0], value));
                i++;
                j++;
            }
        }
        while (i < n) {
            result.add(List.of(left[i][0], left[i][1]));
            i++;
        }
        while (j < m) {
            result.add(List.of(right[j][0], right[j][1]));
            j++;
        }
        return result;
    }
}
