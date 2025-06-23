package g3501_3600.s3587_minimum_adjacent_swaps_to_alternate_parity;

// #Medium #Array #Greedy #2025_06_23_Time_20_ms_(100.00%)_Space_62.71_MB_(100.00%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static int helper(List<Integer> indices) {
        int swaps = 0;
        for (int i = 0; i < indices.size(); i++) {
            swaps += Math.abs(indices.get(i) - 2 * i);
        }
        return swaps;
    }

    public int minSwaps(int[] nums) {
        List<Integer> evenIndices = new ArrayList<>();
        List<Integer> oddIndices = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenIndices.add(i);
            } else {
                oddIndices.add(i);
            }
        }
        int evenCount = evenIndices.size();
        int oddCount = oddIndices.size();
        if (Math.abs(evenCount - oddCount) > 1) {
            return -1;
        }
        int ans = Integer.MAX_VALUE;
        if (evenCount >= oddCount) {
            ans = Math.min(ans, helper(evenIndices));
        }
        if (oddCount >= evenCount) {
            ans = Math.min(ans, helper(oddIndices));
        }
        return ans;
    }
}
