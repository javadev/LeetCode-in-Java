package g3301_3400.s3316_find_maximum_removals_from_source_string;

// #Medium #Array #String #Hash_Table #Dynamic_Programming #Two_Pointers
// #2024_10_15_Time_10_ms_(100.00%)_Space_44.6_MB_(41.97%)

public class Solution {
    public int maxRemovals(String source, String pattern, int[] targetIndices) {
        char[] sChars = source.toCharArray();
        int sn = sChars.length;
        char[] pChars = (pattern + '#').toCharArray();
        int pn = pattern.length();
        int tn = targetIndices.length;
        int[] maxPat = new int[tn + 1];
        for (int i = 0, di = 0, nextTI = targetIndices[0]; i < sn; i++) {
            char c = sChars[i];
            if (i == nextTI) {
                int p = maxPat[di + 1] = maxPat[di];
                for (int j = di; j > 0; j--) {
                    int q = maxPat[j - 1];
                    maxPat[j] = c != pChars[p] ? q : Math.max(p + 1, q);
                    p = q;
                }
                if (c == pChars[p]) {
                    maxPat[0] = p + 1;
                }
                nextTI = ++di < tn ? targetIndices[di] : -1;
            } else {
                for (int j = 0; j <= di; j++) {
                    int p = maxPat[j];
                    if (c == pChars[p]) {
                        maxPat[j] = p + 1;
                    }
                }
            }
        }
        while (maxPat[tn] < pn) {
            tn--;
        }
        return tn;
    }
}
