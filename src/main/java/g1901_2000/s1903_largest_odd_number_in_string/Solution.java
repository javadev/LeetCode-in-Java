package g1901_2000.s1903_largest_odd_number_in_string;

// #Easy #String #Math #Greedy #2024_03_29_Time_1_ms_(100.00%)_Space_45.3_MB_(55.03%)

public class Solution {
    public String largestOddNumber(String num) {
        String str = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            if (c % 2 == 1) {
                str = num.substring(0, i + 1);
                break;
            }
        }
        return str;
    }
}
