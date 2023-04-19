package g2501_2600.s2528_maximize_the_minimum_powered_city;

// #Hard #Array #Greedy #Binary_Search #Prefix_Sum #Sliding_Window #Queue
// #2023_04_19_Time_51_ms_(77.59%)_Space_60_MB_(5.17%)

public class Solution {
    private boolean canIBeTheMinimum(long[] power, long minimum, int k, int r) {
        int n = power.length;
        long[] extraPower = new long[n];
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                extraPower[i] += extraPower[i - 1];
            }
            long curPower = power[i] + extraPower[i];
            long req = minimum - curPower;
            if (req <= 0) {
                continue;
            }
            if (req > k) {
                return false;
            }
            k -= req;
            extraPower[i] += (req);
            if (i + 2 * r + 1 < n) {
                extraPower[i + 2 * r + 1] -= (req);
            }
        }
        return true;
    }

    private long[] calculatePowerArray(int[] stations, int r) {
        int n = stations.length;
        long[] preSum = new long[n];
        for (int i = 0; i < n; i++) {
            int st = i - r;
            int last = i + r + 1;
            if (st < 0) {
                st = 0;
            }
            preSum[st] += stations[i];
            if (last < n) {
                preSum[last] -= stations[i];
            }
        }
        for (int i = 1; i < n; i++) {
            preSum[i] += preSum[i - 1];
        }
        return preSum;
    }

    public long maxPower(int[] stations, int r, int k) {
        long min = 0;
        long sum = (long) Math.pow(10, 10) + (long) Math.pow(10, 9);
        long[] power = calculatePowerArray(stations, r);
        long ans = -1;
        while (min <= sum) {
            long mid = (min + sum) >> 1;
            if (canIBeTheMinimum(power, mid, k, r)) {
                ans = mid;
                min = mid + 1;
            } else {
                sum = mid - 1;
            }
        }
        return ans;
    }
}
