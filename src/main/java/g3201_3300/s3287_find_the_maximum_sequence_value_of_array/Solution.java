package g3201_3300.s3287_find_the_maximum_sequence_value_of_array;

// #Hard #2024_09_15_Time_1140_ms_(100.00%)_Space_285.4_MB_(100.00%)

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("unchecked")
public class Solution {
    public int maxValue(int[] nums, int k) {
        int n = nums.length;
        Set<Integer>[][] left = new Set[n][k + 1];
        Set<Integer>[][] right = new Set[n][k + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= k; j++) {
                left[i][j] = new HashSet<>();
                right[i][j] = new HashSet<>();
            }
        }
        left[0][0].add(0);
        left[0][1].add(nums[0]);
        for (int i = 1; i < n - k; i++) {
            left[i][0].add(0);
            for (int j = 1; j <= k; j++) {
                left[i][j].addAll(left[i - 1][j]);
                for (int v : left[i - 1][j - 1]) {
                    left[i][j].add(v | nums[i]);
                }
            }
        }
        right[n - 1][0].add(0);
        right[n - 1][1].add(nums[n - 1]);
        int result = 0;
        if (k == 1) {
            for (int l : left[n - 2][k]) {
                result = Math.max(result, l ^ nums[n - 1]);
            }
        }
        for (int i = n - 2; i >= k; i--) {
            right[i][0].add(0);
            for (int j = 1; j <= k; j++) {
                right[i][j].addAll(right[i + 1][j]);
                for (int v : right[i + 1][j - 1]) {
                    right[i][j].add(v | nums[i]);
                }
            }
            for (int l : left[i - 1][k]) {
                for (int r : right[i][k]) {
                    result = Math.max(result, l ^ r);
                }
            }
        }
        return result;
    }
}
