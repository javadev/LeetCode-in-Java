package g3901_4000.s3974_maximum_total_sum_of_k_selected_elements;

// #Medium #Array #Sorting #Greedy #Senior #Weekly_Contest_508
// #2026_11_03_Time_18_ms_(98.38%)_Space_143.14_MB_(97.84%)

public class Solution {
    private static final int MAX = 100_000 + 1;

    public long maxSum(int[] nums, int k, int mul) {
        int[] count = new int[MAX];
        int max = nums[0];
        long sum = 0;
        for (int n : nums) {
            max = Math.max(max, n);
            count[n]++;
        }
        while (max >= 0 && k > 0) {
            if (count[max] != 0) {
                int min = Math.min(mul, count[max]);
                min = Math.min(k, min);
                k -= min;
                mul -= min;
                long local =
                        ((long) (mul + min) * (mul + min + 1)) / 2 - ((long) mul * (mul + 1)) / 2;
                sum += local * max;
                if (mul == 0) {
                    count[max] -= min;
                    break;
                }
            }
            max--;
        }
        while (max >= 0 && k > 0) {
            if (count[max] != 0) {
                int min = Math.min(k, count[max]);
                k -= min;
                sum += (long) max * min;
            }
            max--;
        }
        return sum;
    }
}
