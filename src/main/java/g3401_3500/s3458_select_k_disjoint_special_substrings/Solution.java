package g3401_3500.s3458_select_k_disjoint_special_substrings;

// #Medium #String #Hash_Table #Dynamic_Programming #Sorting #Greedy
// #2025_02_18_Time_7_ms_(95.31%)_Space_45.21_MB_(87.79%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public boolean maxSubstringLength(String s, int k) {
        int n = s.length();
        if (k == 0) {
            return true;
        }
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, n);
        Arrays.fill(last, -1);
        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - 'a';
            first[c] = Math.min(first[c], i);
            last[c] = i;
        }
        List<int[]> intervals = new ArrayList<>();
        for (int c = 0; c < 26; c++) {
            if (last[c] == -1) {
                continue;
            }
            int start = first[c];
            int end = last[c];
            int j = start;
            boolean valid = true;
            while (j <= end) {
                int cur = s.charAt(j) - 'a';
                if (first[cur] < start) {
                    valid = false;
                    break;
                }
                end = Math.max(end, last[cur]);
                j++;
            }
            if (valid && !(start == 0 && end == n - 1)) {
                intervals.add(new int[] {start, end});
            }
        }
        intervals.sort((a, b) -> Integer.compare(a[1], b[1]));
        int count = 0;
        int prevEnd = -1;
        for (int[] interval : intervals) {
            if (interval[0] > prevEnd) {
                count++;
                prevEnd = interval[1];
            }
        }
        return count >= k;
    }
}
