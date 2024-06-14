package g3101_3200.s3181_maximum_total_reward_using_operations_ii;

// #Hard #Array #Dynamic_Programming #Bit_Manipulation
// #2024_06_14_Time_2_ms_(100.00%)_Space_53.3_MB_(90.35%)

public class Solution {
    public int maxTotalReward(int[] rewardValues) {
        int max = rewardValues[0];
        int n = 0;
        for (int i = 1; i < rewardValues.length; i++) {
            max = Math.max(max, rewardValues[i]);
        }
        boolean[] vis = new boolean[max + 1];
        for (int i : rewardValues) {
            if (!vis[i]) {
                n++;
                vis[i] = true;
            }
        }
        int[] rew = new int[n];
        int j = 0;
        for (int i = 0; i <= max; i++) {
            if (vis[i]) {
                rew[j++] = i;
            }
        }
        return rew[n - 1] + getAns(rew, n - 1, rew[n - 1] - 1);
    }

    private int getAns(int[] rewards, int i, int validLimit) {
        int res = 0;
        int j = nextElemWithinLimits(rewards, i - 1, validLimit);
        for (; j >= 0; j--) {
            if (res >= rewards[j] + Math.min(validLimit - rewards[j], rewards[j] - 1)) {
                break;
            }
            res =
                    Math.max(
                            res,
                            rewards[j]
                                    + getAns(
                                            rewards,
                                            j,
                                            Math.min(validLimit - rewards[j], rewards[j] - 1)));
        }
        return res;
    }

    private int nextElemWithinLimits(int[] rewards, int h, int k) {
        int l = 0;
        int resInd = -1;
        while (l <= h) {
            int m = (l + h) / 2;
            if (rewards[m] <= k) {
                resInd = m;
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return resInd;
    }
}
