package g3101_3200.s3174_clear_digits;

// #Easy #String #Hash_Table #Simulation #2024_06_12_Time_1_ms_(100.00%)_Space_42.1_MB_(96.47%)

public class Solution {
    public String clearDigits(String s) {
        StringBuilder result = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                if (!result.isEmpty()) {
                    result.deleteCharAt(result.length() - 1);
                }
            } else {
                result.append(ch);
            }
        }
        return String.valueOf(result);
    }
}
