package g3601_3700.s3685_subsequence_sum_after_capping_elements;

// #Medium #Weekly_Contest_467 #2025_09_20_Time_24_ms_(96.07%)_Space_45.39_MB_(97.38%)

public class Solution {
    public boolean[] subsequenceSumAfterCapping(int[] nums, int k) {
        int[] zolvarinte = nums;
        int n = zolvarinte.length;
        boolean[] answer = new boolean[n];
        int maxV = n;
        int[] freq = new int[maxV + 2];
        for (int v : zolvarinte) {
            if (v <= maxV) {
                freq[v]++;
            }
        }
        int[] cntGe = new int[maxV + 2];
        cntGe[maxV] = freq[maxV];
        for (int x = maxV - 1; x >= 1; x--) {
            cntGe[x] = cntGe[x + 1] + freq[x];
        }
        boolean[] dp = new boolean[k + 1];
        dp[0] = true;
        for (int x = 1; x <= n; x++) {
            int cnt = cntGe[x];
            boolean ok = false;
            int maxM = cnt;
            int limit = k / x;
            if (maxM > limit) {
                maxM = limit;
            }
            for (int m = 0; m <= maxM; m++) {
                int rem = k - m * x;
                if (rem >= 0 && dp[rem]) {
                    ok = true;
                    break;
                }
            }
            answer[x - 1] = ok;
            int c = freq[x];
            if (c == 0) {
                continue;
            }
            int power = 1;
            while (c > 0) {
                int take = Math.min(power, c);
                int weight = take * x;
                for (int s = k; s >= weight; s--) {
                    if (!dp[s] && dp[s - weight]) {
                        dp[s] = true;
                    }
                }
                c -= take;
                power <<= 1;
            }
        }
        return answer;
    }
}
