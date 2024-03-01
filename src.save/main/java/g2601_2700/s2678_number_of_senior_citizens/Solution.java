package g2601_2700.s2678_number_of_senior_citizens;

// #Easy #Array #String #2023_09_11_Time_0_ms_(100.00%)_Space_40.7_MB_(97.65%)

public class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for (String detail : details) {
            if (((detail.charAt(11) - '0' == 6) && (detail.charAt(12) - '0' > 0))
                    || (detail.charAt(11) - '0' > 6)) {
                count++;
            }
        }
        return count;
    }
}
