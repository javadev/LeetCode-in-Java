package g3601_3700.s3655_xor_after_range_multiplication_queries_ii;

// #Hard #Array #Divide_and_Conquer #Weekly_Contest_463
// #2025_08_20_Time_22_ms_(94.97%)_Space_130.66_MB_(13.60%)

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings({"unchecked", "java:S6541"})
public class Solution {
    private static final int MOD = 1000000007;

    private int inv(int a) {
        long b = a;
        long r = 1;
        int e = MOD - 2;
        while (e > 0) {
            if ((e & 1) == 1) {
                r = r * b % MOD;
            }
            b = b * b % MOD;
            e >>= 1;
        }
        return (int) r;
    }

    public int xorAfterQueries(int[] nums, int[][] queries) {
        int n = nums.length;
        int b = (int) Math.sqrt(n) + 1;
        ArrayList<int[]>[][] byK = new ArrayList[b + 1][];
        ArrayList<int[]> big = new ArrayList<>();
        for (int[] q : queries) {
            int l = q[0];
            int r = q[1];
            int k = q[2];
            int v = q[3];
            if (k <= b) {
                if (byK[k] == null) {
                    byK[k] = new ArrayList[k];
                }
                int res = l % k;
                if (byK[k][res] == null) {
                    byK[k][res] = new ArrayList<>();
                }
                byK[k][res].add(new int[] {l, r, v});
            } else {
                big.add(new int[] {l, r, k, v});
            }
        }
        for (int k = 1; k <= b; k++) {
            ArrayList<int[]>[] arr = byK[k];
            if (arr == null) {
                continue;
            }
            for (int res = 0; res < k; res++) {
                ArrayList<int[]> list = arr[res];
                if (list == null) {
                    continue;
                }
                int len = (n - 1 - res) / k + 1;
                long[] diff = new long[len + 1];
                Arrays.fill(diff, 1L);
                for (int[] q : list) {
                    int l = q[0];
                    int r = q[1];
                    int v = q[2];
                    int tL = (l - res) / k;
                    int tR = (r - res) / k;
                    diff[tL] = diff[tL] * v % MOD;
                    int p = tR + 1;
                    if (p < len) {
                        diff[p] = diff[p] * inv(v) % MOD;
                    }
                }
                long cur = 1L;
                for (int t = 0, idx = res; t < len; t++, idx += k) {
                    cur = cur * diff[t] % MOD;
                    nums[idx] = (int) ((nums[idx] * cur) % MOD);
                }
            }
        }
        for (int[] q : big) {
            int l = q[0];
            int r = q[1];
            int k = q[2];
            int v = q[3];
            for (int i = l; i <= r; i += k) {
                nums[i] = (int) ((nums[i] * (long) v) % MOD);
            }
        }
        int ans = 0;
        for (int x : nums) {
            ans ^= x;
        }
        return ans;
    }
}
