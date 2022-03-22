package g0601_0700.s0678_valid_parenthesis_string;

// #Medium #String #Dynamic_Programming #Greedy #Stack
// #2022_03_22_Time_0_ms_(100.00%)_Space_41.8_MB_(52.82%)

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
