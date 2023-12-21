package g2601_2700.s2609_find_the_longest_balanced_substring_of_a_binary_string;

// #Easy #String #2023_08_30_Time_1_ms_(100.00%)_Space_42.5_MB_(18.86%)

public class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        char[] chars = s.toCharArray();
        int max = 0;
        int n = chars.length;
        int zero = 0;
        int one = 0;
        int i = 0;
        while (i < n) {
            if (chars[i] == '0') {
                zero++;
            } else {
                while (i < n) {
                    if (chars[i++] == '1') {
                        one++;
                    } else {
                        i--;
                        break;
                    }
                }
                max = Math.max(max, 2 * Math.min(one, zero));
                zero = 1;
                one = 0;
            }
            i++;
        }

        return max;
    }
}
