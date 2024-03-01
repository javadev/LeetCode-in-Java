package g0501_0600.s0594_longest_harmonious_subsequence;

// #Easy #Array #Hash_Table #Sorting #2022_08_25_Time_16_ms_(95.95%)_Space_54.5_MB_(74.21%)

import java.util.Arrays;

public class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int lastN = 0;
        int curN = 1;
        int cur = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > cur) {
                if (lastN > 0 && curN > 0 && lastN + curN > max) {
                    max = lastN + curN;
                }
                // if diff more than 1, don't count
                lastN = nums[i] - cur == 1 ? curN : 0;
                curN = 1;
                cur = nums[i];
            } else {
                curN++;
            }
        }
        if (lastN > 0 && curN > 0 && lastN + curN > max) {
            max = lastN + curN;
        }
        return max;
    }
}
