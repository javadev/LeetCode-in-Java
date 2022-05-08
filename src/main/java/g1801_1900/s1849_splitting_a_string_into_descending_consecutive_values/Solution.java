package g1801_1900.s1849_splitting_a_string_into_descending_consecutive_values;

class Solution {
    public boolean splitString(String s) {
        return solve(0, -1, s, 0);
    }

    private boolean solve(int i, long prev, String s, int k) {
        if (i == s.length()) return k >= 2; // We need at least 2 groups.
        long cur = 0;
        for (int j = i; j < s.length(); j++) {
            // if ((Long.MAX_VALUE - (s.charAt(j) - '0'))/10 < cur)
            //     return false;
            cur = cur * 10 + s.charAt(j) - '0';
            if ((prev == -1 || prev - cur == 1) && solve(j + 1, cur, s, k + 1)) return true;
        }
        return false;
    }
}
