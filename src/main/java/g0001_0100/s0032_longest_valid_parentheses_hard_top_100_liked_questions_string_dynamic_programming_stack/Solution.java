package g0001_0100.s0032_longest_valid_parentheses_hard_top_100_liked_questions_string_dynamic_programming_stack;

public class Solution {
    public int longestValidParentheses(String s) {
        int max = 0;
        int left = 0;
        int right = 0;
        int n = s.length();
        char ch;
        for (int i = 0; i < n; i++) {
            ch = s.charAt(i);
            if (ch == '(') {
                left++;
            } else {
                right++;
            }
            if (right > left) {
                left = 0;
                right = 0;
            }
            if (left == right) {
                max = Math.max(max, left + right);
            }
        }
        left = 0;
        right = 0;
        for (int i = n - 1; i >= 0; i--) {
            ch = s.charAt(i);
            if (ch == '(') {
                left++;
            } else {
                right++;
            }
            if (left > right) {
                left = 0;
                right = 0;
            }
            if (left == right) {
                max = Math.max(max, left + right);
            }
        }
        return max;
    }
}
