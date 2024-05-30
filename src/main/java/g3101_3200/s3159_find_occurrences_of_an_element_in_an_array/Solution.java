package g3101_3200.s3159_find_occurrences_of_an_element_in_an_array;

// #Medium #Array #Hash_Table #2024_05_30_Time_4_ms_(96.74%)_Space_64_MB_(69.94%)

import java.util.ArrayList;

public class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0, l = nums.length; i < l; i++) {
            if (nums[i] == x) {
                a.add(i);
            }
        }
        int l = queries.length;
        int[] r = new int[l];
        for (int i = 0; i < l; i++) {
            r[i] = queries[i] > a.size() ? -1 : a.get(queries[i] - 1);
        }
        return r;
    }
}
