package g3701_3800.s3703_remove_k_balanced_substrings;

// #Medium #String #Stack #Simulation #Weekly_Contest_470
// #2025_10_05_Time_191_ms_(100.00%)_Space_45.86_MB_(100.00%)

public class Solution {
    public String removeSubstring(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (char ch : s.toCharArray()) {
            sb.append(ch);
            if (ch == '(') {
                count++;
            } else {
                if (count >= k && sb.length() >= 2 * k) {
                    int len = sb.length();
                    boolean b = true;
                    for (int i = len - 2 * k; i < len - k; i++) {
                        if (sb.charAt(i) != '(') {
                            b = false;
                            break;
                        }
                    }
                    for (int i = len - k; i < len; i++) {
                        if (sb.charAt(i) != ')') {
                            b = false;
                            break;
                        }
                    }
                    if (b) {
                        sb.delete(sb.length() - 2 * k, sb.length());
                        count -= k;
                    }
                }
            }
        }
        return sb.toString();
    }
}
