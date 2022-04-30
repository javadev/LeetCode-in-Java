package g1701_1800.s1758_minimum_changes_to_make_alternating_binary_string;

// #Easy #String #2022_04_30_Time_10_ms_(9.93%)_Space_42.9_MB_(56.74%)

public class Solution {
    public int minOperations(String s) {
        int ops1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) != '0') {
                    ops1++;
                }
            } else {
                if (s.charAt(i) != '1') {
                    ops1++;
                }
            }
        }

        int ops2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) != '1') {
                    ops2++;
                }
            } else {
                if (s.charAt(i) != '0') {
                    ops2++;
                }
            }
        }
        return Math.min(ops1, ops2);
    }
}
