package g3601_3700.s3653_xor_after_range_multiplication_queries_i;

// #Medium #Array #Simulation #Divide_and_Conquer #Weekly_Contest_463
// #2025_08_20_Time_19_ms_(99.95%)_Space_45.39_MB_(92.88%)

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static final int MOD = 1_000_000_007;

    private long modPow(long a, long e) {
        long res = 1;
        while (e > 0) {
            if ((e & 1) == 1) {
                res = (res * a) % MOD;
            }
            a = (a * a) % MOD;
            e >>= 1;
        }
        return res;
    }

    private long modInv(long a) {
        return modPow(a, MOD - 2L);
    }

    public int xorAfterQueries(int[] nums, int[][] queries) {
        int n = nums.length;
        int b = (int) Math.sqrt(n);
        // Store difference arrays for small k
        // map: k -> array of diff arrays (each residue class has diff array)
        Map<Integer, long[][]> small = new HashMap<>();
        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];
            int k = query[2];
            int v = query[3];
            if (k > b) {
                // Process directly
                for (int i = l; i <= r; i += k) {
                    nums[i] = (int) (((long) nums[i] * v) % MOD);
                }
            } else {
                // Ensure storage
                small.putIfAbsent(k, new long[k][]);
                long[][] byResidue = small.get(k);
                int res = l % k;
                if (byResidue[res] == null) {
                    // number of elements with this residue
                    int len = (n - res + k - 1) / k;
                    // diff array
                    byResidue[res] = new long[len + 1];
                    Arrays.fill(byResidue[res], 1L);
                }

                long[] diff = byResidue[res];
                int jStart = (l - res) / k;
                int jEnd = (r - res) / k;

                diff[jStart] = (diff[jStart] * v) % MOD;
                if (jEnd + 1 < diff.length) {
                    diff[jEnd + 1] = (diff[jEnd + 1] * modInv(v)) % MOD;
                }
            }
        }
        // Apply small k modifications
        for (Map.Entry<Integer, long[][]> entry : small.entrySet()) {
            int k = entry.getKey();
            long[][] byResidue = entry.getValue();
            for (int res = 0; res < k; res++) {
                if (byResidue[res] == null) {
                    continue;
                }
                long[] diff = byResidue[res];
                long mul = 1;
                for (int j = 0; j < diff.length - 1; j++) {
                    mul = (mul * diff[j]) % MOD;
                    int idx = res + j * k;
                    if (idx < n) {
                        nums[idx] = (int) ((nums[idx] * mul) % MOD);
                    }
                }
            }
        }
        int ans = 0;
        for (int x : nums) {
            ans ^= x;
        }
        return ans;
    }
}
