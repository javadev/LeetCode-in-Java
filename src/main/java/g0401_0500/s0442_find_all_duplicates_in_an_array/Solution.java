package g0401_0500.s0442_find_all_duplicates_in_an_array;

// #Medium #Array #Hash_Table #Udemy_Arrays #2022_07_16_Time_5_ms_(98.83%)_Space_68.3_MB_(25.16%)

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
