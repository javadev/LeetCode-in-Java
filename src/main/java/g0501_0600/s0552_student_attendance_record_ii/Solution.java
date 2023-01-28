package g0501_0600.s0552_student_attendance_record_ii;

// #Hard #Dynamic_Programming #2022_08_03_Time_11_ms_(98.55%)_Space_41.6_MB_(87.84%)

import java.util.Arrays;

public class Solution {
    public int checkRecord(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return n * 3 + n * (n - 1);
        }
        long mod = 1000000007;
        long[][] matrix = {
            {1, 1, 0, 1, 0, 0},
            {1, 0, 1, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 0, 0, 1, 1, 0},
            {0, 0, 0, 1, 0, 1},
            {0, 0, 0, 1, 0, 0},
        };
        long[][] e = quickPower(matrix, n - 1);
        return (int)
                ((Arrays.stream(e[0]).sum() + Arrays.stream(e[1]).sum() + Arrays.stream(e[3]).sum())
                        % mod);
    }

    private long[][] quickPower(long[][] a, int times) {
        int n = a.length;
        long[][] e = new long[n][n];
        for (int i = 0; i < n; i++) {
            e[i][i] = 1;
        }
        while (times != 0) {
            if (times % 2 == 1) {
                e = multiple(e, a, n);
            }
            times >>= 1;
            a = multiple(a, a, n);
        }
        return e;
    }

    private long[][] multiple(long[][] a, long[][] b, int n) {
        long[][] target = new long[n][n];
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                for (int l = 0; l < n; l++) {
                    target[j][k] += a[j][l] * b[l][k];
                    target[j][k] %= 1000000007;
                }
            }
        }
        return target;
    }
}
