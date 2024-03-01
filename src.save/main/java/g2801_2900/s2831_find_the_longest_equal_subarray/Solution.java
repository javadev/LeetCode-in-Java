package g2801_2900.s2831_find_the_longest_equal_subarray;

// #Medium #Array #Hash_Table #Binary_Search #Sliding_Window
// #2023_12_11_Time_15_ms_(96.81%)_Space_57.6_MB_(92.02%)

import java.util.List;

public class Solution {
    public int longestEqualSubarray(List<Integer> nums, int k) {
        int[] count = new int[nums.size() + 1];
        int i = 0;
        int maxCount = 0;
        for (int j = 0; j < nums.size(); j++) {
            count[nums.get(j)]++;
            maxCount = Math.max(maxCount, count[nums.get(j)]);
            if ((j - i + 1) - maxCount > k) {
                count[nums.get(i)]--;
                i++;
            }
        }
        return maxCount;
    }
}
