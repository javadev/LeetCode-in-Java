package g4001_4100.s4023_elevator_requests_ii;

// #Hard #Array #Dynamic_Programming #Sorting #Senior_Staff #Biweekly_Contest_189
// #2026_11_25_Time_26_ms_(100.00%)_Space_69.24_MB_(79.07%)

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@SuppressWarnings("java:S1172")
public class Solution {
    public long elevatorRequests(int n, int start, int[] requests) {
        List<Integer> l = new ArrayList<>();
        List<Integer> r = new ArrayList<>();
        for (int x : requests) {
            if (x < start) {
                l.add(start - x);
            } else if (x > start) {
                r.add(x - start);
            }
        }
        l.sort(Comparator.naturalOrder());
        r.sort(Comparator.naturalOrder());
        int a = l.size();
        int b = r.size();
        int t = a + b;
        if (t == 0) {
            return 0;
        }
        long[] x = new long[a + 1];
        long[] y = new long[b + 1];
        for (int i = 1; i <= a; i++) {
            x[i] = l.get(i - 1);
        }
        for (int j = 1; j <= b; j++) {
            y[j] = r.get(j - 1);
        }
        long inf = Long.MAX_VALUE / 4;
        long[][] dl = new long[a + 1][b + 1];
        long[][] dr = new long[a + 1][b + 1];
        for (int i = 1; i <= a; i++) {
            dl[i][0] = dl[i - 1][0] + (x[i] - x[i - 1]) * (t - i + 1);
        }
        for (int j = 1; j <= b; j++) {
            dr[0][j] = dr[0][j - 1] + (y[j] - y[j - 1]) * (t - j + 1);
        }
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                long w = t - i - j + 1L;
                long p = inf;
                if (i >= 2) {
                    p = dl[i - 1][j] + (x[i] - x[i - 1]) * w;
                }
                long q = dr[i - 1][j] + (y[j] + x[i]) * w;
                dl[i][j] = Math.min(p, q);
                long s = inf;
                if (j >= 2) {
                    s = dr[i][j - 1] + (y[j] - y[j - 1]) * w;
                }
                long z = dl[i][j - 1] + (x[i] + y[j]) * w;
                dr[i][j] = Math.min(s, z);
            }
        }
        if (a == 0) {
            return dr[0][b];
        }
        if (b == 0) {
            return dl[a][0];
        }
        return Math.min(dl[a][b], dr[a][b]);
    }
}
