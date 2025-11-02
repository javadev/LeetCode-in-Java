package g3701_3800.s3731_find_missing_elements;

// #Easy #Weekly_Contest_474 #2025_11_02_Time_6_ms_(100.00%)_Space_47.09_MB_(_%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] > 1) {
                for (int j = nums[i] + 1; j < nums[i + 1]; j++) {
                    list.add(j);
                }
            }
        }
        return list;
    }
}
