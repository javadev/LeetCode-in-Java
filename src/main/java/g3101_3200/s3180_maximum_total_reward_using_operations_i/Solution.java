package g3101_3200.s3180_maximum_total_reward_using_operations_i;

// #Medium #Array #Dynamic_Programming #2024_06_14_Time_1_ms_(100.00%)_Space_43.3_MB_(97.85%)

public class Solution {
    private int[] sortedSet(int[] values) {
        int max = 0;
        for (int x : values) {
            if (x > max) {
                max = x;
            }
        }
        boolean[] set = new boolean[max + 1];
        int n = 0;
        for (int x : values) {
            if (!set[x]) {
                set[x] = true;
                n++;
            }
        }
        int[] result = new int[n];
        for (int x = max; x > 0; x--) {
            if (set[x]) {
                result[--n] = x;
            }
        }
        return result;
    }

    public int maxTotalReward(int[] rewardValues) {
        rewardValues = sortedSet(rewardValues);
        int n = rewardValues.length;
        int max = rewardValues[n - 1];
        boolean[] isSumPossible = new boolean[max];
        isSumPossible[0] = true;
        int maxSum = 0;
        for (int sum = rewardValues[0], last = 1; sum < max; sum++) {
            while (last < n && rewardValues[last] <= sum) {
                last++;
            }
            int s2 = sum / 2;
            for (int i = last - 1; i >= 0; i--) {
                int x = rewardValues[i];
                if (x <= s2) {
                    break;
                }
                if (isSumPossible[sum - x]) {
                    isSumPossible[sum] = true;
                    maxSum = sum;
                    break;
                }
            }
        }
        return maxSum + max;
    }
}
