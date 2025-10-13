package g3701_3800.s3714_longest_balanced_substring_ii;

// #Medium #Weekly_Contest_471 #2025_10_13_Time_196_ms_(98.70%)_Space_60.59_MB_(100.00%)

import java.util.HashMap;

public class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int max1 = 1;
        int curr = 1;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curr++;
            } else {
                max1 = Math.max(max1, curr);
                curr = 1;
            }
        }
        max1 = Math.max(max1, curr);
        int max2 = 0;
        char[] chars = {'a', 'b', 'c'};
        for (int p = 0; p < 3; p++) {
            char x = chars[p];
            char y = chars[(p + 1) % 3];
            char z = chars[(p + 2) % 3];
            int ii = 0;
            while (ii < n) {
                if (s.charAt(ii) == z) {
                    ii++;
                    continue;
                }
                int start = ii;
                while (ii < n && s.charAt(ii) != z) {
                    ii++;
                }
                int endd = ii;
                int lenSeg = endd - start;
                if (lenSeg < 2) {
                    continue;
                }
                HashMap<Integer, Integer> map2 = new HashMap<>();
                int diff = 0;
                map2.put(0, 0);
                for (int j = start; j < endd; j++) {
                    char ch = s.charAt(j);
                    if (ch == x) {
                        diff += 1;
                    } else if (ch == y) {
                        diff -= 1;
                    }
                    int localPos = j - start + 1;
                    Integer prevv = map2.get(diff);
                    if (prevv != null) {
                        max2 = Math.max(max2, localPos - prevv);
                    }
                    if (!map2.containsKey(diff)) {
                        map2.put(diff, localPos);
                    }
                }
            }
        }
        int max3 = 0;
        HashMap<Long, Integer> map3 = new HashMap<>();
        int d1 = 0;
        int d2 = 0;
        long offset = 100001L;
        long mult = 200003L;
        long keyy = (d1 + offset) * mult + (d2 + offset);
        map3.put(keyy, 0);
        for (int i = 1; i <= n; i++) {
            char ch = s.charAt(i - 1);
            if (ch == 'a') {
                d1 += 1;
                d2 += 1;
            } else if (ch == 'b') {
                d1 -= 1;
            } else if (ch == 'c') {
                d2 -= 1;
            }
            keyy = (d1 + offset) * mult + (d2 + offset);
            Integer prev = map3.get(keyy);
            if (prev != null) {
                max3 = Math.max(max3, i - prev);
            }
            if (!map3.containsKey(keyy)) {
                map3.put(keyy, i);
            }
        }
        return Math.max(max1, Math.max(max2, max3));
    }
}
