package g3601_3700.s3685_subsequence_sum_after_capping_elements;

// #Medium #Array #Dynamic_Programming #Sorting #Two_Pointers #Weekly_Contest_467
// #2025_09_26_Time_24_ms_(96.44%)_Space_45.98_MB_(36.73%)

public class Solution {
    public boolean[] subsequenceSumAfterCapping(int[] nums, int k) {
        int n = nums.length;
        boolean[] answer = new boolean[n];
        int[] freq = new int[n + 2];
        for (int v : nums) {
            if (v <= n) {
                freq[v]++;
            }
        }
        int[] cntGe = new int[n + 2];
        cntGe[n] = freq[n];
        for (int x = n - 1; x >= 1; x--) {
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
