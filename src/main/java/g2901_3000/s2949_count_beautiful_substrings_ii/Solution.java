package g2901_3000.s2949_count_beautiful_substrings_ii;

// #Hard #String #Hash_Table #Math #Prefix_Sum #Number_Theory
// #2023_12_26_Time_29_ms_(92.10%)_Space_46_MB_(37.13%)

import java.util.HashMap;

@SuppressWarnings("unchecked")
public class Solution {
    public long beautifulSubstrings(String s, int k) {
        long res = 0;
        int n = s.length();
        int l = 1;
        while ((l * l) % (4 * k) != 0) {
            l++;
        }
        HashMap<Integer, Integer>[] seen = new HashMap[l];
        for (int i = 0; i < l; ++i) {
            seen[i] = new HashMap<>();
        }
        int v = 0;
        seen[l - 1].put(0, 1);
        for (int i = 0; i < n; ++i) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                v += 1;
            } else {
                v -= 1;
            }
            int cnt = seen[i % l].getOrDefault(v, 0);
            res += cnt;
            seen[i % l].put(v, cnt + 1);
        }
        return res;
    }
}
