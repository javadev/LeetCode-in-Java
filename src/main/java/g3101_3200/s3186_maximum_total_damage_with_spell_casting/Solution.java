package g3101_3200.s3186_maximum_total_damage_with_spell_casting;

// #Medium #Array #Hash_Table #Dynamic_Programming #Sorting #Binary_Search #Two_Pointers #Counting
// #2024_06_21_Time_51_ms_(99.29%)_Space_60.8_MB_(78.34%)

import java.util.Arrays;

public class Solution {
    public long maximumTotalDamage(int[] power) {
        int maxPower = 0;
        for (int p : power) {
            if (p > maxPower) {
                maxPower = p;
            }
        }
        return (maxPower <= 1_000_000) ? smallPower(power, maxPower) : bigPower(power);
    }

    private long smallPower(int[] power, int maxPower) {
        int[] counts = new int[maxPower + 6];
        for (int p : power) {
            counts[p]++;
        }
        long[] dp = new long[maxPower + 6];
        dp[1] = counts[1];
        dp[2] = Math.max(counts[2] * 2, dp[1]);
        for (int i = 3; i <= maxPower; i++) {
            dp[i] = Math.max(counts[i] * i + dp[i - 3], Math.max(dp[i - 1], dp[i - 2]));
        }
        return dp[maxPower];
    }

    private long bigPower(int[] power) {
        Arrays.sort(power);
        int n = power.length;
        long[] prevs = new long[4];
        int curPower = power[0];
        int count = 1;
        long result = 0;
        for (int i = 1; i <= n; i++) {
            int p = (i == n) ? 1_000_000_009 : power[i];
            if (p == curPower) {
                count++;
            } else {
                long curVal =
                        Math.max((long) curPower * count + prevs[3], Math.max(prevs[1], prevs[2]));
                int diff = Math.min((int) (p - curPower), prevs.length - 1);
                long nextCurVal = (diff == 1) ? 0 : Math.max(prevs[3], Math.max(curVal, prevs[2]));
                // Shift the values in prevs[].
                int k = prevs.length - 1;
                if (diff < prevs.length - 1) {
                    while (k > diff) prevs[k] = prevs[k-- - diff];
                    prevs[k--] = curVal;
                }
                while (k > 0) {
                    prevs[k--] = nextCurVal;
                }
                curPower = p;
                count = 1;
            }
        }
        for (long v : prevs) {
            if (v > result) {
                result = v;
            }
        }
        return result;
    }
}
