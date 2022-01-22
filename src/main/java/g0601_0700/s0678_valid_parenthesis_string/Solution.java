package g0601_0700.s0678_valid_parenthesis_string;

// #Medium #String #Dynamic_Programming #Greedy #Stack

public class Solution {
    public boolean checkValidString(String s) {
        int lo = 0;
        int hi = 0;
        for (int i = 0; i < s.length(); i++) {
            lo += s.charAt(i) == '(' ? 1 : -1;
            hi += s.charAt(i) != ')' ? 1 : -1;
            if (hi < 0) {
                break;
            }
            lo = Math.max(0, lo);
        }
        return lo == 0;
    }
}
