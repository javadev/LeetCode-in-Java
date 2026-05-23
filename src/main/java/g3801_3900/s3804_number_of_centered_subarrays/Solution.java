package g3801_3900.s3804_number_of_centered_subarrays;

// #Medium #Array #Hash_Table #Enumeration #Senior #Weekly_Contest_484
// #2026_05_22_Time_84_ms_(80.43%)_Space_47.00_MB_(47.83%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int centeredSubarrays(int[] nums) {
        int n = nums.length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            int subsum = 0;
            Set<Integer> subnums = new HashSet<>();
            for (int j = i; j < n; j++) {
                subsum += nums[j];
                subnums.add(nums[j]);
                result += subnums.contains(subsum) ? 1 : 0;
            }
        }
        return result;
    }
}
