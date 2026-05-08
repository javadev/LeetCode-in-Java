package g3701_3800.s3760_maximum_substrings_with_distinct_start;

// #Medium #String #Hash_Table #Senior #Weekly_Contest_478
// #2026_05_08_Time_5_ms_(98.92%)_Space_47.79_MB_(74.99%)

public class Solution {
    public int maxDistinct(String s) {
        int mask = 0;
        int res = 0;
        for (char c : s.toCharArray()) {
            int bit = 1 << (c - 'a');
            if ((mask & bit) == 0) {
                mask |= bit;
                res++;
                if (res == 26) {
                    break;
                }
            }
        }
        return res;
    }
}
