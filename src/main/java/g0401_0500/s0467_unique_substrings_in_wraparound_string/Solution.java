package g0401_0500.s0467_unique_substrings_in_wraparound_string;

// #Medium #String #Dynamic_Programming #2022_07_19_Time_4_ms_(98.79%)_Space_44_MB_(5.26%)

public class Solution {
    public int findSubstringInWraproundString(String p) {
        char[] str = p.toCharArray();
        int n = str.length;
        int[] map = new int[26];
        int len = 0;
        for (int i = 0; i < n; i++) {
            if (i > 0 && ((str[i - 1] + 1 == str[i]) || (str[i - 1] == 'z' && str[i] == 'a'))) {
                len += 1;
            } else {
                len = 1;
            }
            // we are storing the max len of string for each letter and then we will count all these
            // length.
            map[str[i] - 'a'] = Math.max(map[str[i] - 'a'], len);
        }
        int answer = 0;
        for (int num : map) {
            answer += num;
        }
        return answer;
    }
}
