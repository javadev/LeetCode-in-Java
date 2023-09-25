package g0401_0500.s0434_number_of_segments_in_a_string;

// #Easy #String #2022_07_16_Time_0_ms_(100.00%)_Space_42.5_MB_(5.49%)

public class Solution {
    public int countSegments(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }
        String[] splitted = s.split(" ");
        int result = 0;
        for (String value : splitted) {
            if (value.length() > 0) {
                result++;
            }
        }
        return result;
    }
}
