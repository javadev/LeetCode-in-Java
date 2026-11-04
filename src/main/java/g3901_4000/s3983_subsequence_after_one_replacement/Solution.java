package g3901_4000.s3983_subsequence_after_one_replacement;

// #Medium #String #Two_Pointers #Staff #Weekly_Contest_509
// #2026_11_03_Time_11_ms_(98.90%)_Space_47.84_MB_(67.03%)

public class Solution {
    public boolean canMakeSubsequence(String t, String s) {
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();
        if (arrS.length < arrT.length) {
            return false;
        }
        int idx1 = 0;
        int idx2 = 0;
        int n = arrT.length;
        for (char curr : arrS) {
            int nextIdx1 = idx1;
            int nextIdx2 = idx2;
            if (idx2 < n && arrT[idx2] == curr) {
                nextIdx2 = Math.max(nextIdx2, idx2 + 1);
            }
            if (idx1 < n) {
                nextIdx2 = Math.max(nextIdx2, idx1 + 1);
            }
            if (idx1 < n && arrT[idx1] == curr) {
                nextIdx1 = idx1 + 1;
            }
            nextIdx2 = Math.max(nextIdx2, nextIdx1);
            idx1 = nextIdx1;
            idx2 = nextIdx2;
        }
        return idx1 == n || idx2 == n;
    }
}
