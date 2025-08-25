package g3601_3700.s3661_maximum_walls_destroyed_by_robots;

// #Hard #Weekly_Contest_464 #2025_08_24_Time_164_ms_(100.00%)_Space_59.97_MB_(100.00%)

import java.util.Arrays;

public class Solution {
    public int maxWalls(int[] robots, int[] distance, int[] walls) {
        int n = robots.length;
        // Pair robots with distances and sort
        int[][] rpair = new int[n][2];
        for (int i = 0; i < n; i++) {
            rpair[i][0] = robots[i];
            rpair[i][1] = distance[i];
        }
        Arrays.sort(rpair, (a, b) -> Integer.compare(a[0], b[0]));
        int[] r = new int[n];
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = rpair[i][0];
            d[i] = rpair[i][1];
        }
        Arrays.sort(walls);
        // Count walls at robot positions
        int base = 0;
        for (int i = 0; i < n; i++) {
            int idx = Arrays.binarySearch(walls, r[i]);
            if (idx >= 0) {
                base++;
            }
        }
        // Tail walls
        int leftTail = countRange(walls, (long) r[0] - d[0], r[0] - 1L);
        int rightTail = countRange(walls, r[n - 1] + 1L, (long) r[n - 1] + d[n - 1]);
        // Precompute segment ranges
        int segs = n - 1;
        int max = Math.max(0, segs);
        int[] a = new int[max];
        int[] b = new int[max];
        int[] c = new int[max];
        for (int i = 0; i < segs; i++) {
            int segL = r[i] + 1;
            int segR = r[i + 1] - 1;
            if (segL > segR) {
                a[i] = b[i] = c[i] = 0;
                continue;
            }
            int aHigh = Math.min(segR, r[i] + d[i]);
            a[i] = countRange(walls, segL, aHigh);
            int bLow = Math.max(segL, r[i + 1] - d[i + 1]);
            b[i] = countRange(walls, bLow, segR);
            int cLow = Math.max(segL, r[i + 1] - d[i + 1]);
            int cHigh = Math.min(segR, r[i] + d[i]);
            c[i] = countRange(walls, cLow, cHigh);
        }
        int[][] dp = new int[n][2];
        Arrays.fill(dp[0], Integer.MIN_VALUE / 4);
        // first fires left
        dp[0][0] = base + leftTail;
        // first fires right
        dp[0][1] = base;
        for (int i = 0; i < n - 1; i++) {
            Arrays.fill(dp[i + 1], Integer.MIN_VALUE / 4);
            for (int choice = 0; choice <= 1; choice++) {
                int cur = dp[i][choice];
                if (cur < 0) {
                    continue;
                }
                int addIfNextLeft = (choice == 1) ? a[i] + b[i] - c[i] : b[i];
                dp[i + 1][0] = Math.max(dp[i + 1][0], cur + addIfNextLeft);
                int addIfNextRight = (choice == 1) ? a[i] : 0;
                dp[i + 1][1] = Math.max(dp[i + 1][1], cur + addIfNextRight);
            }
        }
        int res;
        if (n == 1) {
            res = Math.max(dp[0][0], dp[0][1] + rightTail);
        } else {
            res = Math.max(dp[n - 1][0], dp[n - 1][1] + rightTail);
        }
        return res;
    }

    private int countRange(int[] arr, long l, long r) {
        if (l > r || arr.length == 0) {
            return 0;
        }
        int leftIdx = lowerBound(arr, l);
        int rightIdx = upperBound(arr, r);
        return Math.max(0, rightIdx - leftIdx);
    }

    private int lowerBound(int[] a, long x) {
        int l = 0;
        int r = a.length;
        while (l < r) {
            int m = (l + r) >>> 1;
            if (a[m] < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    private int upperBound(int[] a, long x) {
        int l = 0;
        int r = a.length;
        while (l < r) {
            int m = (l + r) >>> 1;
            if (a[m] <= x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }
}
