package g3401_3500.s3468_find_the_number_of_copy_arrays;

// #Medium #2025_03_02_Time_2_ms_(100.00%)_Space_97.78_MB_(100.00%)

public class Solution {
    int countArrays(int[] original, int[][] bounds) {
        int low = bounds[0][0];
        int high = bounds[0][1];
        int ans = high - low + 1;
        for (int i = 1; i < original.length; ++i) {
            int diff = original[i] - original[i - 1];
            low = Math.max(low + diff, bounds[i][0]);
            high = Math.min(high + diff, bounds[i][1]);
            ans = Math.min(ans, high - low + 1);
        }
        return Math.max(ans, 0);
    }
}
