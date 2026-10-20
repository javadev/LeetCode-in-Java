package g3901_4000.s3960_frequency_balance_subarray;

// #Medium #Array #Hash_Table #Counting #Senior #Weekly_Contest_506
// #2026_10_20_Time_264_ms_(98.53%)_Space_46.59_MB_(97.06%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int getLength(int[] a) {
        int n = a.length;
        int ans = 1;
        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> mp = new HashMap<>();
            int[] fq = new int[n + 1];
            int mx = 0;
            int s = 0;
            for (int j = i; j < n; j++) {
                int old = mp.getOrDefault(a[j], 0);
                if (old > 0) {
                    fq[old]--;
                }
                mp.put(a[j], old + 1);
                fq[old + 1]++;
                if (old + 1 > mx) {
                    mx = old + 1;
                    s = 1;
                } else if (old + 1 == mx) {
                    s++;
                }
                int distinct = mp.size();
                if (distinct == 1 || (mx % 2 == 0 && s < distinct && fq[mx / 2] == distinct - s)) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }
}
