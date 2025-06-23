package g3501_3600.s3594_minimum_time_to_transport_all_individuals;

// #Hard #Array #Dynamic_Programming #Bit_Manipulation #Heap_Priority_Queue #Graph #Bitmask
// #Shortest_Path #2025_06_23_Time_261_ms_(100.00%)_Space_47.18_MB_(100.00%)

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    private static final double INF = 1e18;

    public double minTime(int n, int k, int m, int[] time, double[] mul) {
        if (k == 1 && n > 1) {
            return -1.0;
        }
        int full = (1 << n) - 1;
        int max = full + 1;
        int[] maxt = new int[max];
        for (int ma = 1; ma <= full; ma++) {
            int lsb = Integer.numberOfTrailingZeros(ma);
            maxt[ma] = Math.max(maxt[ma ^ (1 << lsb)], time[lsb]);
        }
        double[][][] dis = new double[max][m][2];
        for (int ma = 0; ma < max; ma++) {
            for (int st = 0; st < m; st++) {
                Arrays.fill(dis[ma][st], INF);
            }
        }
        PriorityQueue<double[]> pq = new PriorityQueue<>(Comparator.comparingDouble(a -> a[0]));
        dis[0][0][0] = 0.0;
        pq.add(new double[] {0.0, 0, 0, 0});
        while (!pq.isEmpty()) {
            double[] cur = pq.poll();
            double far = cur[0];
            int ma = (int) cur[1];
            int st = (int) cur[2];
            int fl = (int) cur[3];
            if (far > dis[ma][st][fl]) {
                continue;
            }
            if (ma == full && fl == 1) {
                return far;
            }
            if (fl == 0) {
                int rem = full ^ ma;
                for (int i = rem; i > 0; i = (i - 1) & rem) {
                    if (Integer.bitCount(i) > k) {
                        continue;
                    }
                    double t = maxt[i] * mul[st];
                    double nxtt = far + t;
                    int nxts = (st + ((int) Math.floor(t) % m)) % m;
                    int m1 = ma | i;
                    if (nxtt < dis[m1][nxts][1]) {
                        dis[m1][nxts][1] = nxtt;
                        pq.offer(new double[] {nxtt, m1, nxts, 1});
                    }
                }
            } else {
                for (int i = ma; i > 0; i &= i - 1) {
                    int lsb = Integer.numberOfTrailingZeros(i);
                    double t = time[lsb] * mul[st];
                    double nxtt = far + t;
                    int nxts = (st + ((int) Math.floor(t) % m)) % m;
                    int m2 = ma ^ (1 << lsb);

                    if (nxtt < dis[m2][nxts][0]) {
                        dis[m2][nxts][0] = nxtt;
                        pq.offer(new double[] {nxtt, m2, nxts, 0});
                    }
                }
            }
        }
        return -1.0;
    }
}
