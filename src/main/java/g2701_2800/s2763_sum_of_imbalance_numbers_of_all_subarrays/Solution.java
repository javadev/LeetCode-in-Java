package g2701_2800.s2763_sum_of_imbalance_numbers_of_all_subarrays;

// #Hard #Array #Hash_Table #Ordered_Set #2023_09_24_Time_1_ms_(100.00%)_Space_43.2_MB_(93.41%)

import java.util.Arrays;

public class Solution {
    public int sumImbalanceNumbers(int[] nums) {
        int n = nums.length;
        int s = 0;
        int[] left = new int[n];
        int[] seen = new int[n + 2];
        Arrays.fill(seen, -1);
        for (int i = 0; i < n; i++) {
            left[i] = Math.max(seen[nums[i]], seen[nums[i] + 1]);
            seen[nums[i]] = i;
        }
        Arrays.fill(seen, n);
        for (int i = n - 1; i >= 0; i--) {
            s += (seen[nums[i] + 1] - i) * (i - left[i]);
            seen[nums[i]] = i;
        }
        return s - (n + 1) * n / 2;
    }
}
