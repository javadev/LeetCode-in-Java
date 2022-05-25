package g2001_2100.s2033_minimum_operations_to_make_a_uni_value_grid;

// #Medium #Array #Math #Sorting #Matrix #2022_05_25_Time_41_ms_(87.53%)_Space_70.1_MB_(92.62%)

import java.util.Arrays;

public class Solution {
    public int minOperations(int[][] grid, int x) {
        int[] arr = new int[grid.length * grid[0].length];
        int k = 0;
        for (int[] ints : grid) {
            for (int j = 0; j < grid[0].length; j++) {
                arr[k] = ints[j];
                k++;
            }
        }
        Arrays.sort(arr);
        int target = arr[arr.length / 2];
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length / 2) {
                int rem = target - arr[i];
                if (rem % x != 0) {
                    return -1;
                }
                res += rem / x;
            } else {
                int rem = arr[i] - target;
                if (rem % x != 0) {
                    return -1;
                }
                res += rem / x;
            }
        }
        return res;
    }
}
