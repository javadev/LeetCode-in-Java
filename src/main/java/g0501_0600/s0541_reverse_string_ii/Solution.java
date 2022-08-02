package g0501_0600.s0541_reverse_string_ii;

// #Easy #String #Two_Pointers #2022_08_02_Time_1_ms_(100.00%)_Space_45_MB_(13.41%)

public class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder res = new StringBuilder();
        int p1 = 0;
        int p2 = 2 * k - 1;
        if (s.length() < k) {
            res.append(reverse(s));
            return res.toString();
        }
        while (p1 < s.length()) {
            if (s.length() < p1 + k) {
                res.append(reverse(s.substring(p1)));
            } else {
                res.append(reverse(s.substring(p1, p1 + k)));
                if (s.length() < p2 + 1) {
                    res.append(s.substring(p1 + k));
                } else {
                    res.append(s, p1 + k, p2 + 1);
                }
            }
            p1 = p1 + 2 * k;
            p2 = p2 + 2 * k;
        }
        return res.toString();
    }

    private String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        return sb.toString();
    }
}
