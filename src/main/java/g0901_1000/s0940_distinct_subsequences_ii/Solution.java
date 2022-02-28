package g0901_1000.s0940_distinct_subsequences_ii;

// #Hard #String #Dynamic_Programming #2022_02_17_Time_3_ms_(86.56%)_Space_40.3_MB_(27.86%)

public class Solution {
    public int distinctSubseqII(String str) {
        int m = (int) (1e9) + 7;
        int prev = 1;
        int[] subseqAtPrevIndexOfMyLastOcc = new int[26];
        for (int i = 1; i <= str.length(); i++) {
            int crntStrIdx = i - 1;
            int subtract = subseqAtPrevIndexOfMyLastOcc[str.charAt(crntStrIdx) - 'a'];
            int curr = (2 * prev) % m;
            curr = (curr + m - subtract) % m;
            subseqAtPrevIndexOfMyLastOcc[str.charAt(crntStrIdx) - 'a'] = prev;
            prev = curr;
        }
        return prev - 1;
    }
}
