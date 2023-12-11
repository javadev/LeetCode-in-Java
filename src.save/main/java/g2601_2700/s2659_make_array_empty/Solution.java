package g2601_2700.s2659_make_array_empty;

// #Hard #Array #Sorting #Greedy #Binary_Search #Ordered_Set #Segment_Tree #Binary_Indexed_Tree
// #2023_09_07_Time_42_ms_(98.92%)_Space_55.3_MB_(95.34%)

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public long countOperationsToEmptyArray(int[] nums) {
        int n = nums.length;
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        Arrays.sort(arr, Comparator.comparingInt(i -> nums[i]));
        long ans = n;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                ans += n - i;
            }
        }
        return ans;
    }
}
