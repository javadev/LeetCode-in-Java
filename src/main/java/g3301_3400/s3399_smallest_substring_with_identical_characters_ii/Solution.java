package g3301_3400.s3399_smallest_substring_with_identical_characters_ii;

// #Hard #2024_12_24_Time_15_ms_(99.39%)_Space_45.9_MB_(43.03%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int minLength(String s, int numOps) {
        byte[] b = s.getBytes();
        int flips1 = 0;
        int flips2 = 0;
        for (int i = 0; i < b.length; i++) {
            byte e1 = (byte) ((i % 2 == 0) ? '0' : '1');
            byte e2 = (byte) ((i % 2 == 0) ? '1' : '0');
            if (b[i] != e1) {
                flips1++;
            }
            if (b[i] != e2) {
                flips2++;
            }
        }
        int flips = Math.min(flips1, flips2);
        if (flips <= numOps) {
            return 1;
        }
        List<Integer> seg = new ArrayList<>();
        int count = 1;
        int max = 1;
        for (int i = 1; i < b.length; i++) {
            if (b[i] != b[i - 1]) {
                if (count != 1) {
                    seg.add(count);
                    max = Math.max(max, count);
                }
                count = 1;
            } else {
                count++;
            }
        }
        if (count != 1) {
            seg.add(count);
            max = Math.max(max, count);
        }
        int l = 2;
        int r = max;
        int res = max;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (check(m, seg, numOps)) {
                r = m - 1;
                res = m;
            } else {
                l = m + 1;
            }
        }
        return res;
    }

    private boolean check(int sz, List<Integer> seg, int ops) {
        for (int i : seg) {
            if (i <= sz) {
                continue;
            }
            int x = i / (sz + 1);
            ops -= x;
            if (ops < 0) {
                return false;
            }
        }
        return true;
    }
}
