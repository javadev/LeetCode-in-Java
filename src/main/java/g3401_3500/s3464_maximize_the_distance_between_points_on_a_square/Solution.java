package g3401_3500.s3464_maximize_the_distance_between_points_on_a_square;

// #Hard #Array #Greedy #Binary_Search #2025_02_25_Time_18_ms_(98.51%)_Space_49.78_MB_(46.27%)

import java.util.Arrays;

public class Solution {
    public int maxDistance(int side, int[][] pts, int k) {
        int n = pts.length;
        long[] p = new long[n];
        for (int i = 0; i < n; i++) {
            int x = pts[i][0];
            int y = pts[i][1];
            long c;
            if (y == 0) {
                c = x;
            } else if (x == side) {
                c = side + y;
            } else if (y == side) {
                c = 2L * side + (side - x);
            } else {
                c = 3L * side + (side - y);
            }
            p[i] = c;
        }
        Arrays.sort(p);
        long c = 4L * side;
        int tot = 2 * n;
        long[] dArr = new long[tot];
        for (int i = 0; i < n; i++) {
            dArr[i] = p[i];
            dArr[i + n] = p[i] + c;
        }
        int lo = 0;
        int hi = 2 * side;
        int ans = 0;
        while (lo <= hi) {
            int mid = (lo + hi) >>> 1;
            if (check(mid, dArr, n, k, c)) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    private boolean check(int d, long[] dArr, int n, int k, long c) {
        int len = dArr.length;
        int[] nxt = new int[len];
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (j < i + 1) {
                j = i + 1;
            }
            while (j < len && dArr[j] < dArr[i] + d) {
                j++;
            }
            nxt[i] = (j < len) ? j : -1;
        }
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            int cur = i;
            while (cnt < k) {
                int nx = nxt[cur];
                if (nx == -1 || nx >= i + n) {
                    break;
                }
                cur = nx;
                cnt++;
            }
            if (cnt == k && (dArr[i] + c - dArr[cur]) >= d) {
                return true;
            }
        }
        return false;
    }
}
