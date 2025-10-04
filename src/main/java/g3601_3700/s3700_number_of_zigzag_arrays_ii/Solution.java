package g3601_3700.s3700_number_of_zigzag_arrays_ii;

// #Hard #Weekly_Contest_469 #2025_09_28_Time_175_ms_(96.34%)_Space_45.46_MB_(28.66%)

public class Solution {
    public int zigZagArrays(int n, int l, int r) {
        long[][] a = new long[r - l][r - l];
        long[][] b = new long[r - l][r - l];
        long result = 0;
        for (int i = 0; i < r - l; i++) {
            a[i][i] = 1;
            for (int j = r - l - 1; i + j >= r - l - 1 && j >= 0; j--) {
                b[i][j] = 1;
            }
        }
        for (n--; n > 0; n /= 2) {
            if (n % 2 == 1) {
                a = zigZagArrays(a, b);
            }
            b = zigZagArrays(b, b);
        }
        for (int i = 0; i < r - l; i++) {
            for (int j = 0; j < r - l; j++) {
                result += a[i][j];
            }
        }
        return (int) (result * 2 % 1000000007);
    }

    private long[][] zigZagArrays(long[][] a, long[][] b) {
        long[][] c = new long[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a.length; k++) {
                    c[i][j] = (c[i][j] + a[i][k] * b[k][j]) % 1000000007;
                }
            }
        }
        return c;
    }
}
