package g2201_2300.s2248_intersection_of_multiple_arrays;

// #Easy #Array #Hash_Table #Counting #2022_06_09_Time_2_ms_(99.46%)_Space_42.6_MB_(92.53%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> ans = new ArrayList<>();
        int[] count = new int[1001];
        for (int[] arr : nums) {
            for (int i : arr) {
                ++count[i];
            }
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] == nums.length) {
                ans.add(i);
            }
        }
        return ans;
    }
}
