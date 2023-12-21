package g0401_0500.s0448_find_all_numbers_disappeared_in_an_array;

// #Easy #Array #Hash_Table #Udemy_Arrays #2022_07_17_Time_3_ms_(100.00%)_Space_50.3_MB_(93.98%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] arr = new int[nums.length];
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            arr[nums[counter] - 1] = 1;
            counter++;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                res.add(i + 1);
            }
        }
        return res;
    }
}
