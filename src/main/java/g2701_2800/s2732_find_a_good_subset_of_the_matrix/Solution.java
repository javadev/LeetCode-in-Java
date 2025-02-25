package g2701_2800.s2732_find_a_good_subset_of_the_matrix;

// #Hard #Array #Greedy #Matrix #Bit_Manipulation
// #2025_02_25_Time_2_ms_(100.00%)_Space_58.01_MB_(13.79%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private int[] arr = new int[32];

    public List<Integer> goodSubsetofBinaryMatrix(int[][] grid) {
        List<Integer> list = new ArrayList<>();
        int n = grid.length;
        Arrays.fill(arr, -1);
        for (int i = 0; i < n; ++i) {
            int j = get(grid[i]);
            if (j == 0) {
                list.add(i);
                return list;
            }
            if (arr[j] != -1) {
                list.add(arr[j]);
                list.add(i);
                return list;
            }
            for (int k = 0; k < 32; ++k) {
                if ((k & j) == 0) {
                    arr[k] = i;
                }
            }
        }
        return list;
    }

    private int get(int[] nums) {
        int n = nums.length;
        int rs = 0;
        for (int i = 0; i < n; ++i) {
            if (nums[i] == 1) {
                rs = (rs | (1 << i));
            }
        }
        return rs;
    }
}
