package g2801_2900.s2844_minimum_operations_to_make_a_special_number;

// #Medium #String #Math #Greedy #Enumeration #2023_12_13_Time_1_ms_(100.00%)_Space_41_MB_(68.09%)

public class Solution {
    public int minimumOperations(String num) {
        char[] number = num.toCharArray();
        int n = number.length;
        int zero = 0;
        int five = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (number[i] == '0') {
                if (zero == 1) {
                    return n - i - 2;
                } else {
                    zero++;
                }
            } else if (number[i] == '5') {
                if (zero == 1) {
                    return n - i - 2;
                }
                if (five == 0) {
                    five++;
                }
            } else if ((number[i] == '2' || number[i] == '7') && five == 1) {
                return n - i - 2;
            }
        }
        if (zero == 1) {
            return n - 1;
        }
        return n;
    }
}
