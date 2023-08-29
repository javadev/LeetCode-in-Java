package g2201_2300.s2259_remove_digit_from_number_to_maximize_result;

// #Easy #String #Greedy #Enumeration #2022_06_13_Time_1_ms_(97.73%)_Space_42.3_MB_(61.63%)

public class Solution {
    public String removeDigit(String number, char digit) {
        int index = 0;
        int n = number.length();
        for (int i = 0; i < n; i++) {
            if (number.charAt(i) == digit) {
                index = i;
                if (i < n - 1 && digit < number.charAt(i + 1)) {
                    break;
                }
            }
        }
        number = number.substring(0, index) + number.substring(index + 1);
        return number;
    }
}
