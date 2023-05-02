package g1901_2000.s1931_painting_a_grid_with_three_different_colors;

// #Hard #Dynamic_Programming #2023_04_26_Time_4_ms_(100.00%)_Space_40.2_MB_(97.67%)

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("java:S3824")
public class Solution {
    public static final int P = 1_000_000_007;

    public int colorTheGrid(int m, int n) {
        if (m == 1) {
            return (int) (3L * powMod(2, n - 1) % P);
        }
        if (m == 2) {
            return (int) (6L * powMod(3, n - 1) % P);
        }
        if (n == 1) {
            return (int) (3L * powMod(2, m - 1) % P);
        }
        if (n == 2) {
            return (int) (6L * powMod(3, m - 1) % P);
        }
        int totalTemplates = 1 << (m - 2);
        int totalPaintings = binPow(3, m);
        int[] paintingToTemplate = new int[totalPaintings];
        long[] paintingCountForTemplate = new long[totalTemplates];
        long[][] templateEdgeCount = new long[totalTemplates][totalTemplates];
        Map<Integer, Integer> templateToIndex = new HashMap<>(1 << (m - 2));
        int templateCounter = 0;
        extracted(
                m,
                totalPaintings,
                paintingToTemplate,
                paintingCountForTemplate,
                templateToIndex,
                templateCounter);
        extracted(m, totalPaintings, paintingToTemplate, templateEdgeCount);
        for (int i = 0; i < totalTemplates; i++) {
            long c = paintingCountForTemplate[i];
            for (int j = 0; j < totalTemplates; j++) {
                templateEdgeCount[i][j] /= c;
            }
        }
        long[][] matrixPower = matrixPower(templateEdgeCount, (long) n - 1);
        long ans = 0;
        for (int i = 0; i < totalTemplates; i++) {
            long s = 0;
            long[] arr = matrixPower[i];
            for (long a : arr) {
                s += a;
            }
            ans += paintingCountForTemplate[i] * s;
        }
        return (int) (ans % P);
    }

    private void extracted(
            int m, int totalPaintings, int[] paintingToTemplate, long[][] templateEdgeCount) {
        for (int i = 0; i < totalPaintings; i++) {
            if (paintingToTemplate[i] == -1) {
                continue;
            }
            for (int j = i + 1; j < totalPaintings; j++) {
                if (paintingToTemplate[j] == -1) {
                    continue;
                }
                if (checkAllowance(i, j, m)) {
                    templateEdgeCount[paintingToTemplate[i]][paintingToTemplate[j]]++;
                    templateEdgeCount[paintingToTemplate[j]][paintingToTemplate[i]]++;
                }
            }
        }
    }

    private void extracted(
            int m,
            int totalPaintings,
            int[] paintingToTemplate,
            long[] paintingCountForTemplate,
            Map<Integer, Integer> templateToIndex,
            int templateCounter) {
        for (int i = 0; i < totalPaintings; i++) {
            int type = getType(i, m);
            if (type == -1) {
                paintingToTemplate[i] = -1;
                continue;
            }
            Integer templateIndex = templateToIndex.get(type);
            if (templateIndex == null) {
                templateToIndex.put(type, templateCounter);
                templateIndex = templateCounter++;
            }
            paintingToTemplate[i] = templateIndex;
            paintingCountForTemplate[templateIndex]++;
        }
    }

    private boolean checkAllowance(int a, int b, int m) {
        for (int i = 0; i < m; i++) {
            if (a % 3 == b % 3) {
                return false;
            }
            a /= 3;
            b /= 3;
        }
        return true;
    }

    private int getType(int a, int m) {
        int[] digits = new int[3];
        int first = a % 3;
        int second = a % 9 / 3;
        if (first == second) {
            return -1;
        }
        digits[second] = 1;
        digits[3 - first - second] = 2;
        int prev = second;
        int type = 1;
        m -= 2;
        a /= 9;
        while (m-- > 0) {
            int curr = a % 3;
            if (prev == curr) {
                return -1;
            }
            type = type * 3 + digits[curr];
            prev = curr;
            a /= 3;
        }
        return type;
    }

    private int powMod(int a, int b) {
        long res = 1;
        while (b != 0) {
            if ((b & 1) != 0) {
                res = (res * a) % P;
                --b;
            } else {
                a = (int) (((long) a * a) % P);
                b >>= 1;
            }
        }
        return (int) res;
    }

    private int binPow(int a, int n) {
        int res = 1;
        int tmp = a;
        while (n != 0) {
            if ((n & 1) != 0) {
                res *= tmp;
            }
            tmp *= tmp;
            n >>= 1;
        }
        return res;
    }

    private long[][] matrixPower(long[][] base, long pow) {
        int n = base.length;
        long[][] res = new long[n][n];
        for (int i = 0; i < n; i++) {
            res[i][i] = 1;
        }
        while (pow != 0) {
            if ((pow & 1) != 0) {
                res = multiplyMatrix(res, base);
                --pow;
            } else {
                base = multiplyMatrix(base, base);
                pow >>= 1;
            }
        }
        return res;
    }

    private long[][] multiplyMatrix(long[][] a, long[][] b) {
        int n = a.length;
        long[][] ans = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    ans[i][j] += a[i][k] * b[k][j];
                }
                ans[i][j] %= P;
            }
        }
        return ans;
    }
}
