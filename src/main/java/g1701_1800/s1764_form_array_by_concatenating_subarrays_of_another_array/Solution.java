package g1701_1800.s1764_form_array_by_concatenating_subarrays_of_another_array;

// #Medium #Array #Greedy #String_Matching #2022_04_30_Time_7_ms_(16.90%)_Space_42.4_MB_(85.92%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public boolean canChoose(int[][] groups, int[] nums) {
        List<Integer> numsInt = new ArrayList<>();
        for (int num : nums) {
            numsInt.add(num);
        }
        int prevIndex = 0;
        for (int[] group : groups) {
            List<Integer> groupInt = new ArrayList<>();
            for (int num : group) {
                groupInt.add(num);
            }
            int index =
                    Collections.indexOfSubList(
                            numsInt.subList(prevIndex, numsInt.size()), groupInt);
            if (index != -1) {
                prevIndex = index + group.length;
            } else {
                return false;
            }
        }
        return true;
    }
}
