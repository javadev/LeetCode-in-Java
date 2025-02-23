package g2701_2800.s2747_count_zero_request_servers;

// #Medium #Array #Hash_Table #Sorting #Sliding_Window
// #2025_02_23_Time_22_ms_(100.00%)_Space_87.21_MB_(63.95%)

import java.util.Arrays;

public class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        Arrays.sort(logs, (a, b) -> a[1] - b[1]);
        int m = queries.length;
        int len = logs.length;
        int[][] qarr = new int[m][];
        for (int i = 0; i < m; i++) {
            qarr[i] = new int[] {i, queries[i]};
        }
        Arrays.sort(qarr, (a, b) -> a[1] - b[1]);
        int[] ans = new int[m];
        int[] freq = new int[n + 1];
        int l = 0, r = 0, noReq = n;
        for (int[] q : qarr) {
            int i = q[0], t = q[1];
            while (r < len && logs[r][1] <= t) {
                if (freq[logs[r][0]]++ == 0) {
                    noReq--;
                }
                r++;
            }
            while (l < len && logs[l][1] < t - x) {
                if (freq[logs[l][0]]-- == 1) {
                    noReq++;
                }
                l++;
            }
            ans[i] = noReq;
        }
        return ans;
    }
}
