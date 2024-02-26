package g1301_1400.s1380_lucky_numbers_in_a_matrix;

// #Easy #Array #Matrix #2022_03_22_Time_2_ms_(82.40%)_Space_42.8_MB_(85.37%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> mini = new ArrayList<>();
        List<Integer> maxi = new ArrayList<>();
        for (int[] arr : matrix) {
            int min = Integer.MAX_VALUE;
            for (int j : arr) {
                if (min > j) {
                    min = j;
                }
            }
            mini.add(min);
        }
        int cols = matrix[0].length;
        for (int c = 0; c < cols; ++c) {
            int max = Integer.MIN_VALUE;
            for (int[] ints : matrix) {
                if (ints[c] > max) {
                    max = ints[c];
                }
            }
            maxi.add(max);
        }
        List<Integer> res = new ArrayList<>();
        for (int value : mini) {
            if (maxi.contains(value)) {
                res.add(value);
            }
        }
        return res;
    }
}
