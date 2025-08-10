package g3601_3700.s3646_next_special_palindrome_number;

// #Hard #Weekly_Contest_462 #2025_08_10_Time_20_ms_(77.60%)_Space_45.50_MB_(18.75%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    private final List<Long> specials = new ArrayList<>();

    public long specialPalindrome(long n) {
        if (specials.isEmpty()) {
            init(specials);
        }
        int pos = Collections.binarySearch(specials, n + 1);
        if (pos < 0) {
            pos = -pos - 1;
        }
        return specials.get(pos);
    }

    private void init(List<Long> v) {
        List<Character> half = new ArrayList<>();
        String mid;
        for (int mask = 1; mask < (1 << 9); ++mask) {
            int sum = 0;
            int oddCnt = 0;
            for (int d = 1; d <= 9; ++d) {
                if ((mask & (1 << (d - 1))) != 0) {
                    sum += d;
                    if (d % 2 == 1) {
                        oddCnt++;
                    }
                }
            }
            if (sum > 18 || oddCnt > 1) {
                continue;
            }
            half.clear();
            mid = "";
            for (int d = 1; d <= 9; ++d) {
                if ((mask & (1 << (d - 1))) != 0) {
                    if (d % 2 == 1) {
                        mid = Character.toString((char) ('0' + d));
                    }
                    int h = d / 2;
                    for (int i = 0; i < h; i++) {
                        half.add((char) ('0' + d));
                    }
                }
            }
            Collections.sort(half);
            permute(half, 0, v, mid);
        }
        Collections.sort(v);
        Set<Long> set = new LinkedHashSet<>(v);
        v.clear();
        v.addAll(set);
    }

    private void permute(List<Character> half, int start, List<Long> v, String mid) {
        if (start == half.size()) {
            StringBuilder left = new StringBuilder();
            for (char c : half) {
                left.append(c);
            }
            String right = new StringBuilder(left).reverse().toString();
            String s = left + mid + right;
            if (!s.isEmpty()) {
                long x = Long.parseLong(s);
                v.add(x);
            }
            return;
        }
        Set<Character> swapped = new HashSet<>();
        for (int i = start; i < half.size(); i++) {
            if (swapped.contains(half.get(i))) {
                continue;
            }
            swapped.add(half.get(i));
            Collections.swap(half, start, i);
            permute(half, start + 1, v, mid);
            Collections.swap(half, start, i);
        }
    }
}
