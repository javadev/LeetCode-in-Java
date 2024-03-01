package g2301_2400.s2315_count_asterisks;

// #Easy #String #2022_06_26_Time_1_ms_(100.00%)_Space_42.2_MB_(57.14%)

public class Solution {
    public int countAsterisks(String s) {
        int c = 0;
        int n = s.length();
        int i = 0;
        while (i < n) {
            if (s.charAt(i) == '|') {
                i++;
                while (s.charAt(i) != '|') {
                    i++;
                }
            }
            if (s.charAt(i) == '*') {
                c++;
            }
            i++;
        }
        return c;
    }
}
