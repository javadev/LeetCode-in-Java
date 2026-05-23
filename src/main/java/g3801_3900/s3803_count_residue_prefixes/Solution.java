package g3801_3900.s3803_count_residue_prefixes;

// #Easy #String #Hash_Table #Mid_Level #Weekly_Contest_484
// #2026_05_22_Time_1_ms_(100.00%)_Space_43.67_MB_(91.69%)

public class Solution {
    public int residuePrefixes(String s) {
        int n = s.length();
        int count = 0;
        int p = 0;
        char c1 = s.charAt(p);
        while (p < n && c1 == s.charAt(p)) {
            if (++p % 3 == 1) {
                count++;
            }
        }
        if (p >= n) {
            return count;
        }
        char c2 = s.charAt(p);
        while (p < n && (c1 == s.charAt(p) || c2 == s.charAt(p))) {
            if (++p % 3 == 2) {
                count++;
            }
        }
        return count;
    }
}
