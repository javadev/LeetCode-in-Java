package g1501_1600.s1593_split_a_string_into_the_max_number_of_unique_substrings;

// #Medium #String #Hash_Table #Backtracking #2022_04_06_Time_8_ms_(95.81%)_Space_42.6_MB_(84.70%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int maxUniqueSplit(String s) {
        int lo = 1;
        int hi = s.length();
        // binary search
        while (lo < hi) {
            int mid = (lo + hi + 1) >> 1;
            if (ok(0, mid, 0, s, new HashSet<>())) {
                lo = mid;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    private boolean ok(int depth, int end, int curLen, String s, Set<String> seen) {
        if (depth == end) {
            return true;
        }
        for (int j = curLen; j < s.length(); j++) {
            // not enough length remains to reach the end.
            if (s.length() - j < end - depth) {
                break;
            }
            String cur = s.substring(curLen, j + 1);
            if (seen.add(cur)) {
                if (ok(depth + 1, end, j + 1, s, seen)) {
                    return true;
                }
                seen.remove(cur);
            }
        }
        return false;
    }
}
