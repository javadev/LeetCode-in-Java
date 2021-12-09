package g0401_0500.s0448_find_all_numbers_disappeared_in_an_array;

// #Easy #Top_100_Liked_Questions #Array #Hash_Table

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
