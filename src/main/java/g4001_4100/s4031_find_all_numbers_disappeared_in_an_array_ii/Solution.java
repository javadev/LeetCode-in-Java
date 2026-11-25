package g4001_4100.s4031_find_all_numbers_disappeared_in_an_array_ii;

// #Medium #Array #Sorting #Binary_Search #Senior #Weekly_Contest_516
// #2026_11_25_Time_14_ms_(98.35%)_Space_166.69_MB_(53.84%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] avail = new boolean[upper + 1];
        for (int num : nums) {
            if (num >= lower && num <= upper) {
                avail[num] = true;
            }
        }
        int i = lower;
        while (i <= upper) {
            if (avail[i]) {
                i++;
                continue;
            }
            int start = i;
            while (i <= upper && !avail[i]) {
                i++;
            }
            int end = i - 1;
            res.add(Arrays.asList(start, end));
        }
        return res;
    }
}
