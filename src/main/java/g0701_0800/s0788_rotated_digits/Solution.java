package g0701_0800.s0788_rotated_digits;

// #Medium #Dynamic_Programming #Math

public class Solution {
    public int rotatedDigits(int n) {
        int[] flag = new int[n + 1];
        flag[0] = 2;
        if (n >= 1) {
            flag[1] = 2;
        }
        if (n >= 8) {
            flag[8] = 2;
        }
        if (n >= 2) {
            flag[2] = 1;
        }
        if (n >= 5) {
            flag[5] = 1;
        }
        if (n >= 6) {
            flag[6] = 1;
        }
        if (n >= 9) {
            flag[9] = 1;
        }
        int rs = 0;
        for (int i = 1; i <= n; i++) {
            int residual = i % 10;
            if (flag[residual] != 0) {
                if ((residual == 1 || residual == 0 || residual == 8) && (flag[i / 10] == 2)) {
                    flag[i] = 2;
                    continue;
                }
                if (flag[i / 10] != 0) {
                    flag[i] = 1;
                    rs++;
                }
            }
        }
        return rs;
    }
}
