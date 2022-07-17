package g1701_1800.s1796_second_largest_digit_in_a_string;

// #Easy #String #Hash_Table #2022_04_25_Time_2_ms_(87.67%)_Space_42.1_MB_(81.91%)

public class Solution {
    public int secondHighest(String s) {
        int largest = -1;
        int sl = -1;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                int n = ch - '0';
                if (n > largest) {
                    sl = largest;
                    largest = n;
                } else if (n > sl && n < largest) {
                    sl = n;
                }
            }
        }
        return sl;
    }
}
