package g3601_3700.s3612_process_string_with_special_operations_i;

// #Medium #String #Simulation #2025_07_14_Time_3_ms_(100.00%)_Space_54.56_MB_(100.00%)

public class Solution {
    public String processStr(String s) {
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '*' && c != '#' && c != '%') {
                res.append(c);
            } else if (c == '#') {
                res.append(res);
            } else if (c == '%') {
                res.reverse();
            } else {
                if (!res.isEmpty()) {
                    res.deleteCharAt(res.length() - 1);
                }
            }
        }
        return res.toString();
    }
}
