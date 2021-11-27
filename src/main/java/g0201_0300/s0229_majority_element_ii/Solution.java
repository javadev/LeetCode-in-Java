package g0201_0300.s0229_majority_element_ii;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> results = new ArrayList<>();
        int len = nums.length;
        int first = 0;
        int second = 1;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < len; i++) {
            int temp = nums[i];
            if (temp == first) {
                count1++;
            } else if (temp == second) {
                count2++;
            } else if (count1 == 0) {
                first = temp;
                count1++;
            } else if (count2 == 0) {
                second = temp;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < len; i++) {
            // check both of them is bigger than n/3.Becasue we may have only one satisfying
            // the demand.
            int temp = nums[i];
            if (temp == first) {
                count1++;
            }
            if (temp == second) {
                count2++;
            }
        }
        if (count1 > len / 3) {
            results.add(first);
        }
        if (count2 > len / 3) {
            results.add(second);
        }
        return results;
    }
}
