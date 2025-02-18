package g3401_3500.s3456_find_special_substring_of_length_k;

// #Easy #String #2025_02_18_Time_0_ms_(100.00%)_Space_41.93_MB_(99.07%)

@SuppressWarnings("java:S1871")
public class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        int start = 0;
        int end = k;
        while (end <= s.length()) {
            boolean flag = false;
            for (int i = start; i < end - 1; i++) {
                if (s.charAt(i) != s.charAt(i + 1)) {
                    start++;
                    end++;
                    flag = true;
                    break;
                }
            }
            if (flag) {
                continue;
            }
            if (start - 1 >= 0 && s.charAt(start) == s.charAt(start - 1)) {
                start++;
                end++;
            } else if (end < s.length() && s.charAt(end) == s.charAt(end - 1)) {
                start++;
                end++;
            } else {
                return true;
            }
        }
        return false;
    }
}
