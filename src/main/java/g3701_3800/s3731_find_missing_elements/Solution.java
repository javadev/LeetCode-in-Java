package g3701_3800.s3731_find_missing_elements;

// #Easy #Array #Hash_Table #Sorting #Weekly_Contest_474
// #2025_11_05_Time_2_ms_(94.89%)_Space_46.54_MB_(95.16%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int maxi = 0;
        int mini = 101;
        List<Integer> list = new ArrayList<>();
        boolean[] array = new boolean[101];
        for (int num : nums) {
            array[num] = true;
            if (maxi < num) {
                maxi = num;
            }
            if (mini > num) {
                mini = num;
            }
        }
        for (int index = mini + 1; index < maxi; index++) {
            if (array[index]) {
                continue;
            }
            list.add(index);
        }
        return list;
    }
}
