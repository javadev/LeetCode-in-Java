package g2901_3000.s2913_subarrays_distinct_element_sum_of_squares_i;

// #Easy #Array #Hash_Table #2023_12_27_Time_1_ms_(100.00%)_Space_42.6_MB_(96.53%)

import java.util.List;

public class Solution {
    public int sumCounts(List<Integer> nums) {
        final int n = nums.size();
        if (n == 1) {
            return 1;
        }
        int[] numsArr = new int[n];
        for (int i = 0; i < n; i++) {
            numsArr[i] = nums.get(i);
        }
        int[] prev = new int[n];
        int[] foundAt = new int[101];
        boolean dupFound = false;
        int j = 0;
        while (j < n) {
            if ((prev[j] = foundAt[numsArr[j]] - 1) >= 0) {
                dupFound = true;
            }
            foundAt[numsArr[j]] = ++j;
        }
        if (!dupFound) {
            return (((((n + 4) * n + 5) * n) + 2) * n) / 12;
        }
        int result = 0;
        for (int start = n - 1; start >= 0; start--) {
            int distinctCount = 0;
            for (int i = start; i < n; i++) {
                if (prev[i] < start) {
                    distinctCount++;
                }
                result += distinctCount * distinctCount;
            }
        }
        return result;
    }
}
