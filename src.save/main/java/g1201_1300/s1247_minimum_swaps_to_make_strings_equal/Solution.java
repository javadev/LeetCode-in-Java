package g1201_1300.s1247_minimum_swaps_to_make_strings_equal;

// #Medium #String #Math #Greedy #2022_03_12_Time_1_ms_(79.83%)_Space_42.2_MB_(24.46%)

public class Solution {
    public int minimumSwap(String s1, String s2) {
        int len = s1.length();
        int countX1 = 0;
        int countY1 = 0;
        int countX2 = 0;
        int countY2 = 0;
        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (s1.charAt(i) == 'x') {
                    countX1++;
                } else {
                    countY1++;
                }
                if (s2.charAt(i) == 'x') {
                    countX2++;
                } else {
                    countY2++;
                }
            }
        }

        if ((countX1 + countX2) % 2 == 1) {
            return -1;
        }

        if (countX1 + countX2 > countY1 + countY2) {
            return (int) Math.ceil(countY1 * 1.0 / 2) + (int) Math.ceil(countY2 * 1.0 / 2);
        } else {
            return (int) Math.ceil(countX1 * 1.0 / 2) + (int) Math.ceil(countX2 * 1.0 / 2);
        }
    }
}
