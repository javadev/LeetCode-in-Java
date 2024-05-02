package g3101_3200.s3133_minimum_array_end;

// #Medium #Bit_Manipulation #2024_05_02_Time_1_ms_(92.38%)_Space_40.8_MB_(58.58%)

public class Solution {
    public long minEnd(int n, int x) {
        int c = 0;
        n = n - 1;
        int[] xb = new int[64];
        int[] nb = new int[64];
        for (int i = 0; i < 32; i++) {
            xb[i] = (x >> i) & 1;
            nb[i] = (n >> i) & 1;
        }
        int i = 0;
        int j = 0;
        while (i < 64) {
            if (xb[i] != 1) {
                xb[i] = nb[j++];
            }
            i++;
        }
        long ans = 0;
        long p = 1;
        for (i = 0; i < 64; i++) {
            ans += (xb[i]) * p;
            p *= 2;
        }
        return ans;
    }
}
