package g2201_2300.s2278_percentage_of_letter_in_string;

// #Easy #String #2022_06_18_Time_0_ms_(100.00%)_Space_40.1_MB_(95.65%)

public class Solution {
    public int percentageLetter(String s, char letter) {
        int count = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == letter) {
                ++count;
            }
        }
        return (count * 100) / (n);
    }
}
