package g3701_3800.s3714_longest_balanced_substring_ii;

// #Medium #Weekly_Contest_471 #2025_10_12_Time_788_ms_(_%)_Space_144.17_MB_(_%)

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unchecked")
public class Solution {
    private int n;

    // key function: converts 3 counts into a unique number
    private long key(long[] cnt) {
        return cnt[0] + cnt[1] * (n + 1L) + cnt[2] * (n + 1L) * (n + 1L);
    }

    public int longestBalanced(String s) {
        n = s.length();
        // counts of 'a','b','c'
        long[] cnt = new long[3];
        long[] cur = new long[3];
        int ans = 0;
        // create 8 maps for all subsets
        Map<Long, Integer>[] mp = new HashMap[8];
        for (int j = 0; j < 8; j++) {
            mp[j] = new HashMap<>();
            // initialize with 0 -> -1
            mp[j].put(0L, -1);
        }
        for (int i = 0; i < n; i++) {
            int x = s.charAt(i) - 'a';
            cnt[x]++;
            // iterate over all non-empty subsets (1..7)
            for (int m = 7; m > 0; m--) {
                long mind = n;
                for (int b = 0; b < 3; b++) {
                    int bit = 1 << b;
                    if ((bit & m) != 0) {
                        mind = Math.min(mind, cnt[b]);
                    }
                    cur[b] = cnt[b];
                }
                for (int b = 0; b < 3; b++) {
                    int bit = 1 << b;
                    if ((bit & m) != 0) {
                        cur[b] -= mind;
                    }
                }
                long k = key(cur);
                if (mp[m].containsKey(k)) {
                    ans = Math.max(ans, i - mp[m].get(k));
                } else {
                    mp[m].put(k, i);
                }
            }
        }
        return ans;
    }
}
