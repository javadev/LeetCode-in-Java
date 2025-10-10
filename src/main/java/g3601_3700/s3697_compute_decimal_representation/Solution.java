package g3601_3700.s3697_compute_decimal_representation;

// #Easy #Array #Math #Weekly_Contest_469 #2025_10_07_Time_1_ms_(100.00%)_Space_42.84_MB_(83.73%)

public class Solution {
    public int[] decimalRepresentation(int n) {
        int place = 1;
        int cnt = getDigits(n);
        int[] ans = new int[cnt];
        int idx = cnt - 1;
        while (n != 0) {
            int d = n % 10;
            ans[idx] = d * place;
            idx--;
            place = place * 10;
            n = n / 10;
        }
        int nz = 0;
        for (int x : ans) {
            if (x != 0) {
                nz++;
            }
        }
        int[] res = new int[nz];
        int p = 0;
        for (int x : ans) {
            if (x != 0) {
                res[p++] = x;
            }
        }
        return res;
    }

    private int getDigits(int n) {
        int cnt = 0;
        while (n != 0) {
            cnt++;
            n = n / 10;
        }
        return cnt;
    }
}
