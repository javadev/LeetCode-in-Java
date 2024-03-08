package g1001_1100.s1011_capacity_to_ship_packages_within_d_days;

// #Medium #Array #Binary_Search #2022_02_21_Time_10_ms_(75.31%)_Space_53.9_MB_(25.82%)

public class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = weights[0];
        int sum = 0;
        for (int val : weights) {
            sum += val;
            max = Math.max(max, val);
        }
        int lo = max;
        int hi = sum;
        int ans = 0;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (isPossible(weights, mid, days)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    private boolean isPossible(int[] arr, int mid, int days) {
        int capacity = 1;
        int sum = 0;
        for (int j : arr) {
            sum += j;
            if (sum > mid) {
                capacity++;
                sum = j;
            }
        }
        return capacity <= days;
    }
}
