package g3901_4000.s3999_minimum_number_of_string_groups_through_transformations;

// #Hard #String #Hash_Table #Two_Pointers #Senior_Staff #Weekly_Contest_511
// #2026_11_17_Time_83_ms_(100.00%)_Space_60.37_MB_(97.83%)

import java.util.HashSet;

public class Solution {
    public int minimumGroups(String[] words) {
        HashSet<Long> set = new HashSet<>();
        for (String w : words) {
            int n = w.length();
            int evenLen = (n + 1) >> 1;
            int oddLen = n >> 1;
            char[] even = new char[evenLen];
            char[] odd = new char[oddLen];
            int ei = 0, oi = 0;
            for (int i = 0; i < n; i++) {
                if ((i & 1) == 0) {
                    even[ei++] = w.charAt(i);
                } else {
                    odd[oi++] = w.charAt(i);
                }
            }
            int eStart = booth(even);
            int oStart = booth(odd);
            long h1 = hash(even, eStart);
            long h2 = hash(odd, oStart);
            long key = h1 * 1000003L + h2;
            set.add(key);
        }
        return set.size();
    }

    private int booth(char[] s) {
        int n = s.length;
        if (n <= 1) {
            return 0;
        }
        int i = 0, j = 1, k = 0;
        while (i < n && j < n && k < n) {
            char a = s[(i + k) % n];
            char b = s[(j + k) % n];
            if (a == b) {
                k++;
            } else if (a > b) {
                i += k + 1;
                if (i <= j) i = j + 1;
                k = 0;
            } else {
                j += k + 1;
                if (j <= i) j = i + 1;
                k = 0;
            }
        }
        return Math.min(i, j);
    }

    private long hash(char[] s, int start) {
        long h = 0;
        for (int i = 0; i < s.length; i++) {
            h = h * 131 + s[(start + i) % s.length];
        }
        return h;
    }
}
