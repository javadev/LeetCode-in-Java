package g3701_3800.s3761_minimum_absolute_distance_between_mirror_pairs;

// #Medium #Array #Hash_Table #Math #Staff #Weekly_Contest_478
// #2026_05_08_Time_49_ms_(84.83%)_Space_95.13_MB_(49.31%)

import java.util.HashMap;

public class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int res = 100000;
        int i = 0;
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int n : nums) {
            int r;
            if (seen.containsKey(n)) {
                res = Math.min(res, i - seen.get(n));
            }
            for (r = 0; n > 0; n /= 10) {
                r = r * 10 + (n % 10);
            }
            seen.put(r, i++);
        }

        return res == 100000 ? -1 : res;
    }
}
