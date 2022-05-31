package g2101_2200.s2111_minimum_operations_to_make_the_array_k_increasing;

// #Hard #Array #Binary_Search #2022_05_31_Time_97_ms_(22.90%)_Space_123.6_MB_(54.96%)// #Hard
// #Array #Binary_Search #2022_05_31_Time_97_ms_(22.90%)_Space_123.6_MB_(54.96%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int kIncreasing(int[] A, int k) {
        int n = A.length;
        int res = 0;
        for (int s = 0; s < k; s++) {
            List<Integer> dp = new ArrayList<>();
            for (int i = s; i < n; i += k) {
                if (!bsearch(dp, A[i])) {
                    dp.add(A[i]);
                }
            }
            res += dp.size();
        }
        return n - res;
    }

    private boolean bsearch(List<Integer> dp, int target) {
        if (dp.isEmpty()) {
            return false;
        }
        int lo = 0;
        int hi = dp.size() - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (dp.get(mid) <= target) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }

        if (dp.get(lo) > target) {
            dp.set(lo, target);
            return true;
        }
        return false;
    }
}
