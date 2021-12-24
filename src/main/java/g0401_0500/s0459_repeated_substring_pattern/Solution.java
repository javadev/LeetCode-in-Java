package g0401_0500.s0459_repeated_substring_pattern;

// #Easy #String #String_Matching

public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        if (n < 2) {
            return false;
        }
        for (int i = 0; i < (n + 1) / 2; ++i) {
            if (n % (i + 1) != 0) {
                continue;
            }
            boolean match = true;

            String substring = s.substring(0, i + 1);
            int skippedI = i;
            for (int j = i + 1; j < n; j += i + 1) {
                if (!s.substring(j, j + i + 1).equals(substring)) {
                    match = false;
                    break;
                }
                skippedI += i + 1;
            }
            if (match) {
                return true;
            }
            i = skippedI;
        }
        return false;
    }
}