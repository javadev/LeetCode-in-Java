package g2201_2300.s2226_maximum_candies_allocated_to_k_children;

// #Medium #Array #Binary_Search #2022_06_08_Time_46_ms_(78.19%)_Space_57.9_MB_(94.92%)

public class Solution {
    public int maximumCandies(int[] candies, long k) {
        int max = Integer.MIN_VALUE;
        long sum = 0;
        for (int num : candies) {
            max = Math.max(max, num);
            sum += num;
        }
        if (sum < k) {
            return 0;
        }
        int left = 1;
        int right = max;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canBeDistributed(mid, candies, k)) {
                if (!canBeDistributed(mid + 1, candies, k)) {
                    return mid;
                } else {
                    left = mid + 1;
                }
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    private boolean canBeDistributed(int num, int[] candies, long k) {
        for (int i = 0; i < candies.length && k > 0; ++i) {
            k -= candies[i] / num;
        }
        return k <= 0;
    }
}
