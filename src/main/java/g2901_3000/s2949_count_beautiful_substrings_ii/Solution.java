package g2901_3000.s2949_count_beautiful_substrings_ii;

// #Hard #String #Hash_Table #Math #Prefix_Sum #Number_Theory
// #2023_12_26_Time_30_ms_(91.18%)_Space_45.4_MB_(43.57%)

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public long beautifulSubstrings(String s, int k) {
        int k2 = 2 * kTransform(k);
        ArrayList<HashMap<Integer, Integer>> list = new ArrayList<>();
        for (int j = 0; j < k2; j += 1) {
            list.add(new HashMap<>());
        }
        list.get(0).put(0, 1);
        int n = s.length();
        int vcDiff = 0;
        long res = 0;
        for (int i = 0; i < n; i += 1) {
            int j = (i + 1) % k2;
            char c = s.charAt(i);
            if (isV(c)) {
                vcDiff += 1;
            } else {
                vcDiff -= 1;
            }
            HashMap<Integer, Integer> jMap = list.get(j);
            int count = jMap.getOrDefault(vcDiff, 0);
            res += count;
            jMap.put(vcDiff, count + 1);
        }
        return res;
    }

    private int kTransform(int k) {
        int k1 = k;
        int k2 = 1;
        for (int d = 2; d <= k1; d += 1) {
            if (isPrime(d)) {
                while (k1 % d == 0) {
                    k2 *= d;
                    k1 = k1 / d;
                    if (k1 % d == 0) {
                        k1 = k1 / d;
                    }
                }
            }
        }
        return k2;
    }

    private boolean isPrime(int v) {
        if (v == 2) return true;
        for (int d = 2; d * d <= v; d += 1) {
            if (v % d == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean isV(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }
}
