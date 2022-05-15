package g0401_0500.s0442_find_all_duplicates_in_an_array;

// #Medium #Array #Hash_Table #Acceptance_72.5%
// #2022_03_18_Time_5_ms_(94.88%)_Space_70.2_MB_(16.76%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int num = nums.length;
        int[] count = new int[num];
        List<Integer> list = new ArrayList<>();
        for (int j : nums) {
            // count number of times each number appears
            count[j - 1] += 1;
        }
        for (int i = 0; i < num; i++) {
            // if count of num is 2 add pos to list
            if (count[i] == 2) {
                list.add(i + 1);
            }
        }
        return list;
    }
}
