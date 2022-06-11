package g2201_2300.s2243_calculate_digit_sum_of_a_string;

// #Easy #String #Simulation #2022_06_11_Time_1_ms_(91.46%)_Space_42.3_MB_(29.50%)

public class Solution {
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            int n = s.length();
            int count = 0;
            int sum = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (count == k) {
                    sb.append(sum);
                    sum = 0;
                    count = 0;
                }
                sum += s.charAt(i) - '0';
                count++;
            }
            sb.append(sum);
            s = sb.toString();
        }
        return s;
    }
}
