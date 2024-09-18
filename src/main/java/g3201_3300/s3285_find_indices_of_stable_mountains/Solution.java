package g3201_3300.s3285_find_indices_of_stable_mountains;

// #Easy #Array #2024_09_15_Time_1_ms_(100.00%)_Space_44.5_MB_(100.00%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        int n = height.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            if (height[i] > threshold) {
                list.add(i + 1);
            }
        }
        return list;
    }
}
