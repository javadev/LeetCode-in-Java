package g3301_3400.s3303_find_the_occurrence_of_first_almost_equal_substring;

// #Hard #2024_09_30_Time_1198_ms_(100.00%)_Space_97.4_MB_(100.00%)

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int minStartingIndex(String s, String p) {
        Map<Long, Integer> mp = new HashMap<>();
        long hash = 0;
        long base = 26;
        long d = 1;
        long hashP = 0;
        long mod = 10000000000283L;
        int n = s.length();
        int sz = p.length();
        // Rolling hash for string s
        for (int i = 0; i < n; i++) {
            hash = (hash * base + s.charAt(i)) % mod;
            if (i >= sz) {
                hash = (mod + hash - d * s.charAt(i - sz) % mod) % mod;
            } else {
                d = d * base % mod;
            }
            if (i >= sz - 1 && !mp.containsKey(hash)) {
                mp.put(hash, i - sz + 1);
            }
        }
        // Hash for the pattern p
        for (int i = 0; i < sz; i++) {
            hashP = (hashP * base + p.charAt(i)) % mod;
        }
        d = 1;
        int ans = Integer.MAX_VALUE;
        // Find the minimum index with almost equal string
        for (int i = sz - 1; i >= 0; i--) {
            long newhashP = (mod + hashP - d * p.charAt(i) % mod) % mod;
            for (char a = 'a'; a <= 'z'; a++) {
                long candidateHash = (newhashP + d * a % mod) % mod;
                if (mp.containsKey(candidateHash)) {
                    ans = Math.min(ans, mp.get(candidateHash));
                }
            }
            d = d * base % mod;
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
