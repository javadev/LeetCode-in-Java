package g2701_2800.s2747_count_zero_request_servers;

// #Medium #Array #Hash_Table #Sorting #Sliding_Window
// #2023_09_24_Time_43_ms_(76.92%)_Space_85.7_MB_(63.85%)

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] qs) {
        int m = qs.length;
        var valIdx = new int[m][2];
        for (int i = 0; i < m; i++) {
            valIdx[i] = new int[] {qs[i], i};
        }
        Arrays.sort(valIdx, Comparator.comparingInt(a -> a[0]));
        Arrays.sort(logs, Comparator.comparingInt(a -> a[1]));
        int l = 0;
        int r = 0;
        var res = new int[m];
        var servCount = new HashMap<Integer, Integer>();
        for (var q : valIdx) {
            int rVal = q[0];
            int lVal = q[0] - x;
            int i = q[1];
            while (r < logs.length && logs[r][1] <= rVal) {
                servCount.merge(logs[r++][0], 1, Integer::sum);
            }
            while (l < r && logs[l][1] < lVal) {
                servCount.compute(logs[l][0], (k, v) -> v - 1);
                servCount.remove(logs[l][0], 0);
                l++;
            }
            res[i] = n - servCount.size();
        }
        return res;
    }
}
