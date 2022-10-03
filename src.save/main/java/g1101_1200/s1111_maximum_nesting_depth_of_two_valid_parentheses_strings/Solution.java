package g1101_1200.s1111_maximum_nesting_depth_of_two_valid_parentheses_strings;

// #Medium #String #Stack #2022_03_01_Time_1_ms_(99.73%)_Space_44.5_MB_(26.26%)

public class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] ans = new int[n];
        char[] chars = seq.toCharArray();
        int depth = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] == '(') {
                depth++;
                if (depth % 2 == 0) {
                    ans[i] = 0;
                } else {
                    ans[i] = 1;
                }
            } else {
                if (depth % 2 == 0) {
                    ans[i] = 0;
                } else {
                    ans[i] = 1;
                }
                depth--;
            }
        }
        return ans;
    }
}
