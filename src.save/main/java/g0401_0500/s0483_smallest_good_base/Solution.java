package g0401_0500.s0483_smallest_good_base;

// #Hard #Math #Binary_Search #Acceptance_37.9%
// #2022_03_18_Time_3_ms_(87.88%)_Space_42.7_MB_(30.30%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String smallestGoodBase(String n) {
        return sol1(n);
    }

    private String sol1(String n) {
        long x = Long.parseLong(n);
        List<Long> ans = new ArrayList<>();
        ans.add(x - 1);
        long y = x - 1;
        for (int i = 2; i < 63; i++) {
            double dm = Math.pow(y, 1.0 / i);
            long dml = (long) dm;
            for (int j = 0; j > -3 && dml + j > 1; j--) {
                long d = dml + j;
                if (y % d == 0) {
                    long poly = poly(d, i);
                    if (poly == x) {
                        ans.add(d);
                    }
                }
            }
        }
        long end = ans.get(ans.size() - 1);
        return end + "";
    }

    private long poly(long b, int n) {
        long ans = 1;
        long m = 1;
        for (int i = 0; i < n; i++) {
            m *= b;
            ans += m;
        }
        return ans;
    }
}
