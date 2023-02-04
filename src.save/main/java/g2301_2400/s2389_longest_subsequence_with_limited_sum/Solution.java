package g2301_2400.s2389_longest_subsequence_with_limited_sum;

// #Easy #Array #Sorting #Greedy #Binary_Search #Prefix_Sum
// #2022_09_02_Time_4_ms_(99.97%)_Space_42.7_MB_(95.35%)

import java.util.Arrays;

public class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        // we can sort the nums because the order of the subsequence does not matter
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        for (int i = 0; i < queries.length; i++) {
            int j = Arrays.binarySearch(nums, queries[i]);
            if (j < 0) {
                j = -j - 2;
            }
            queries[i] = j + 1;
        }
        return queries;
    }
}
