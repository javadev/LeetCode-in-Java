package g2101_2200.s2155_all_divisions_with_the_highest_score_of_a_binary_array;

// #Medium #Array #2022_06_02_Time_18_ms_(98.41%)_Space_57.1_MB_(98.02%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        int curone = 0;
        int curzero = 0;
        int max = 0;
        for (int i : nums) {
            curone += i;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (curzero + curone > max) {
                list.clear();
                list.add(i);
                max = curzero + curone;
            } else if (curzero + curone == max) {
                list.add(i);
            }
            if (nums[i] == 1) {
                curone--;
            } else {
                curzero++;
            }
        }
        if (curzero > max) {
            list.clear();
            list.add(nums.length);
        } else if (curzero == max) {
            list.add(nums.length);
        }
        return list;
    }
}
