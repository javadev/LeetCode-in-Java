package g2701_2800.s2710_remove_trailing_zeros_from_a_string;

// #Easy #String #2023_09_15_Time_1_ms_(100.00%)_Space_43.5_MB_(80.00%)

public class Solution {
    public String removeTrailingZeros(String num) {
        int endIndex = num.length() - 1;
        while (endIndex >= 0 && num.charAt(endIndex) == '0') {
            endIndex--;
        }
        return num.substring(0, endIndex + 1);
    }
}
