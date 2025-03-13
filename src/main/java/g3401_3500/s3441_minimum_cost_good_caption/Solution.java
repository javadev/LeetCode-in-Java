package g3401_3500.s3441_minimum_cost_good_caption;

// #Hard #String #Dynamic_Programming #2025_03_13_Time_20_ms_(100.00%)_Space_46.12_MB_(96.53%)

import java.util.Arrays;

public class Solution {
    public String minCostGoodCaption(String caption) {
        int n = caption.length();
        if (n < 3) {
            return "";
        }
        byte[] s = caption.getBytes();
        int[] f = new int[n + 1];
        f[n - 1] = f[n - 2] = Integer.MAX_VALUE / 2;
        byte[] t = new byte[n + 1];
        byte[] size = new byte[n];
        for (int i = n - 3; i >= 0; i--) {
            byte[] sub = Arrays.copyOfRange(s, i, i + 3);
            Arrays.sort(sub);
            byte a = sub[0];
            byte b = sub[1];
            byte c = sub[2];
            byte s3 = t[i + 3];
            int res = f[i + 3] + (c - a);
            int mask = b << 24 | s3 << 16 | s3 << 8 | s3;
            size[i] = 3;
            if (i + 4 <= n) {
                byte[] sub4 = Arrays.copyOfRange(s, i, i + 4);
                Arrays.sort(sub4);
                byte a4 = sub4[0];
                byte b4 = sub4[1];
                byte c4 = sub4[2];
                byte d4 = sub4[3];
                byte s4 = t[i + 4];
                int res4 = f[i + 4] + (c4 - a4 + d4 - b4);
                int mask4 = b4 << 24 | b4 << 16 | s4 << 8 | s4;
                if (res4 < res || res4 == res && mask4 < mask) {
                    res = res4;
                    mask = mask4;
                    size[i] = 4;
                }
            }
            if (i + 5 <= n) {
                byte[] sub5 = Arrays.copyOfRange(s, i, i + 5);
                Arrays.sort(sub5);
                byte a5 = sub5[0];
                byte b5 = sub5[1];
                byte c5 = sub5[2];
                byte d5 = sub5[3];
                byte e5 = sub5[4];
                int res5 = f[i + 5] + (d5 - a5 + e5 - b5);
                int mask5 = c5 << 24 | c5 << 16 | c5 << 8 | t[i + 5];
                if (res5 < res || res5 == res && mask5 < mask) {
                    res = res5;
                    mask = mask5;
                    size[i] = 5;
                }
            }
            f[i] = res;
            t[i] = (byte) (mask >> 24);
        }
        StringBuilder ans = new StringBuilder(n);
        for (int i = 0; i < n; i += size[i]) {
            ans.append(String.valueOf((char) t[i]).repeat(Math.max(0, size[i])));
        }
        return ans.toString();
    }
}
