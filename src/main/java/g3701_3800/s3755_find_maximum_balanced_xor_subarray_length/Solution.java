package g3701_3800.s3755_find_maximum_balanced_xor_subarray_length;

// #Medium #Array #Hash_Table #Bit_Manipulation #Prefix_Sum #Senior #Weekly_Contest_477
// #2026_04_25_Time_91_ms_(98.50%)_Space_256.08_MB_(93.23%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxBalancedSubarray(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int xor = 0;
        int diff = n;
        Map<Long, Integer> pos = new HashMap<>(n + 1, 1);
        pos.put((long) xor << 20 | diff, -1);
        for (int i = 0; i < n; i++) {
            xor ^= nums[i];
            diff += nums[i] % 2 != 0 ? 1 : -1;
            long key = (long) xor << 20 | diff;
            Integer j = pos.get(key);
            if (j != null) {
                ans = Math.max(ans, i - j);
            } else {
                pos.put(key, i);
            }
        }
        return ans;
    }
}
