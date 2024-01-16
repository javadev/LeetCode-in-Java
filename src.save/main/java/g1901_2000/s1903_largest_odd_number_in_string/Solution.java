package g1901_2000.s1903_largest_odd_number_in_string;

// #Easy #String #Math #Greedy #2022_05_11_Time_6_ms_(23.18%)_Space_43.2_MB_(81.76%)

public class Solution {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if (Integer.parseInt("" + num.charAt(i)) % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
