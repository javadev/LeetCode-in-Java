package g3401_3500.s3455_shortest_matching_substring;

// #Hard #String #Binary_Search #Two_Pointers #String_Matching
// #2025_02_18_Time_116_ms_(81.44%)_Space_55.28_MB_(88.02%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private List<Integer> getMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        int[] next = new int[m];
        Arrays.fill(next, -1);
        int i = 1;
        int j = -1;
        while (i < m) {
            while (j != -1 && p.charAt(i) != p.charAt(j + 1)) {
                j = next[j];
            }
            if (p.charAt(i) == p.charAt(j + 1)) {
                ++j;
            }
            next[i] = j;
            ++i;
        }
        List<Integer> match = new ArrayList<>();
        i = 0;
        j = -1;
        while (i < n) {
            while (j != -1 && s.charAt(i) != p.charAt(j + 1)) {
                j = next[j];
            }
            if (s.charAt(i) == p.charAt(j + 1)) {
                ++j;
            }
            if (j == m - 1) {
                match.add(i - m + 1);
                j = next[j];
            }
            ++i;
        }
        return match;
    }

    public int shortestMatchingSubstring(String s, String p) {
        int n = s.length();
        int m = p.length();
        int[] d = {-1, -1, -1, m};
        for (int i = 0; i < m; ++i) {
            if (p.charAt(i) == '*') {
                d[d[1] == -1 ? 1 : 2] = i;
            }
        }
        List<String> subs = new ArrayList<>();
        for (int i = 0; i < 3; ++i) {
            if (d[i] + 1 < d[i + 1]) {
                subs.add(p.substring(d[i] + 1, d[i + 1]));
            }
        }
        int size = subs.size();
        if (size == 0) {
            return 0;
        }
        List<List<Integer>> matches = new ArrayList<>();
        for (String sub : subs) {
            matches.add(getMatch(s, sub));
        }
        int ans = Integer.MAX_VALUE;
        int[] ids = new int[size];
        Arrays.fill(ids, 0);
        while (ids[size - 1] < matches.get(size - 1).size()) {
            for (int i = size - 2; i >= 0; --i) {
                while (ids[i] + 1 < matches.get(i).size()
                        && matches.get(i).get(ids[i] + 1) + subs.get(i).length()
                                <= matches.get(i + 1).get(ids[i + 1])) {
                    ++ids[i];
                }
            }
            boolean valid = true;
            for (int i = size - 2; i >= 0; --i) {
                if (ids[i] >= matches.get(i).size()
                        || matches.get(i).get(ids[i]) + subs.get(i).length()
                                > matches.get(i + 1).get(ids[i + 1])) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                ans =
                        Math.min(
                                ans,
                                matches.get(size - 1).get(ids[size - 1])
                                        + subs.get(size - 1).length()
                                        - matches.get(0).get(ids[0]));
            }
            ids[size - 1]++;
        }
        return ans > n ? -1 : ans;
    }
}
