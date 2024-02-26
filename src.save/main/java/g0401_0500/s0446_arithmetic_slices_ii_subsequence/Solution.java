package g0401_0500.s0446_arithmetic_slices_ii_subsequence;

// #Hard #Array #Dynamic_Programming #2022_07_16_Time_68_ms_(99.15%)_Space_76.2_MB_(89.36%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int numberOfArithmeticSlices(int[] arr) {
        Map<Long, List<Integer>> indexes = new HashMap<>();
        int[][] length = new int[arr.length][arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                List<Integer> ix = indexes.get(arr[i] - (arr[j] - (long) arr[i]));
                if (ix == null) {
                    continue;
                }
                for (int k : ix) {
                    length[i][j] += length[k][i] + 1;
                }
                count += length[i][j];
            }
            indexes.computeIfAbsent((long) arr[i], k -> new ArrayList<>()).add(i);
        }
        return count;
    }
}
