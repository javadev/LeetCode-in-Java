package g1701_1800.s1717_maximum_score_from_removing_substrings;

// #Medium #String #Greedy #Stack #2022_04_24_Time_19_ms_(99.25%)_Space_43.2_MB_(91.04%)

@SuppressWarnings("java:S135")
public class Solution {
    public int maximumGain(String s, int x, int y) {
        char[] v = s.toCharArray();
        if (x > y) {
            return helper(v, 'a', 'b', x) + helper(v, 'b', 'a', y);
        } else {
            return helper(v, 'b', 'a', y) + helper(v, 'a', 'b', x);
        }
    }

    private int helper(char[] v, char c1, char c2, int score) {
        int left = -1;
        int right = 0;
        int res = 0;
        while (right < v.length) {
            if (v[right] != c2) {
                left = right;
            } else {
                while (left >= 0) {
                    char cl = v[left];
                    if (cl == '#') {
                        left--;
                    } else if (cl == c1) {
                        res += score;
                        v[left] = '#';
                        v[right] = '#';
                        left--;
                        break;
                    } else {
                        break;
                    }
                }
            }
            right++;
        }
        return res;
    }
}
