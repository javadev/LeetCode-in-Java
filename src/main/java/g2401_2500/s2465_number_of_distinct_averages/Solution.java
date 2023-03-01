package g2401_2500.s2465_number_of_distinct_averages;

// #Easy #Array #Hash_Table #Sorting #Two_Pointers
// #2023_01_07_Time_1_ms_(99.48%)_Space_40.1_MB_(81.14%)

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            set.add(nums[l++] + nums[r--]);
        }
        return set.size();
    }
}
