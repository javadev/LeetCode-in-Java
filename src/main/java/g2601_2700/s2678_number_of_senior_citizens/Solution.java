package g2601_2700.s2678_number_of_senior_citizens;

// #Easy #Array #String #2025_02_26_Time_0_ms_(100.00%)_Space_42.10_MB_(95.99%)

public class Solution {
    public int countSeniors(String[] details) {
        int seniorCitizen = 0;
        for (String detail : details) {
            int age = (detail.charAt(11) - '0') * 10 + detail.charAt(12) - '0';
            if (age > 60) {
                seniorCitizen++;
            }
        }
        return seniorCitizen;
    }
}
