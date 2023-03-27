package g2401_2500.s2496_maximum_value_of_a_string_in_an_array;

// #Easy #Array #String #2023_01_27_Time_1_ms_(92.00%)_Space_41.7_MB_(54.56%)

public class Solution {
    public int maximumValue(String[] strs) {
        int maxVal = 0;
        for (String s : strs) {
            maxVal = Math.max(maxVal, value(s));
        }
        return maxVal;
    }

    private int value(String s) {
        int total = 0;
        for (char ch : s.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                total = total * 10 + (ch - '0');
            } else {
                return s.length();
            }
        }
        return total;
    }
}
