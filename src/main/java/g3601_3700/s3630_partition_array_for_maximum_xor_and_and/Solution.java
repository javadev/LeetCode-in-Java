package g3601_3700.s3630_partition_array_for_maximum_xor_and_and;

// #Hard #Weekly_Contest_460 #2025_07_27_Time_77_ms_(100.00%)_Space_51.20_MB_(30.86%)

public class Solution {
    public long maximizeXorAndXor(int[] nums) {
        int n = nums.length;
        int full = 1 << n;
        int[] xorMask = new int[full];
        int[] andMask = new int[full];
        int[] orMask = new int[full];
        for (int mask = 1; mask < full; mask++) {
            int lb = mask & -mask;
            int i = Integer.numberOfTrailingZeros(lb);
            int prev = mask ^ lb;
            xorMask[mask] = xorMask[prev] ^ nums[i];
            andMask[mask] = prev == 0 ? nums[i] : andMask[prev] & nums[i];
            orMask[mask] = orMask[prev] | nums[i];
        }
        long best = 0;
        int all = full - 1;
        for (int b = 0; b < full; b++) {
            long andB = andMask[b];
            int rest = all ^ b;
            if (andB + 2L * orMask[rest] <= best) {
                continue;
            }
            for (int a = rest; ; a = (a - 1) & rest) {
                int c = rest ^ a;
                long sum = xorMask[a] + andB + xorMask[c];
                if (sum > best) {
                    best = sum;
                }
                if (a == 0) {
                    break;
                }
            }
        }
        return best;
    }
}
