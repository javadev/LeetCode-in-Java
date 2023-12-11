package g2001_2100.s2019_the_score_of_students_solving_math_expression;

// #Hard #Array #String #Dynamic_Programming #Math #Stack #Memoization
// #2022_05_24_Time_435_ms_(89.93%)_Space_47_MB_(87.77%)

import java.util.ArrayDeque;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public class Solution {
    private HashSet<Integer>[][] dp;

    public int scoreOfStudents(String s, int[] answers) {
        ArrayDeque<Integer> st = new ArrayDeque<>();
        int n = s.length();
        int i = 0;
        dp = new HashSet[n][n];
        while (i < n) {
            if (s.charAt(i) - '0' >= 0 && s.charAt(i) - '9' <= 0) {
                st.push(s.charAt(i) - '0');
                i++;
            } else if (s.charAt(i) == '*') {
                int cur = st.pop() * (s.charAt(i + 1) - '0');
                i += 2;
                st.push(cur);
            } else {
                i++;
            }
        }
        int res = 0;
        int ret = 0;
        while (!st.isEmpty()) {
            res += st.pop();
        }
        HashSet<Integer> wrong = opts(0, n - 1, s);
        for (int ans : answers) {
            if (ans == res) {
                ret += 5;
            } else if (wrong.contains(ans)) {
                ret += 2;
            }
        }
        return ret;
    }

    private HashSet<Integer> opts(int i, int j, String s) {
        if (dp[i][j] != null) {
            return dp[i][j];
        }
        if (i == j) {
            HashSet<Integer> res = new HashSet<>();
            res.add(s.charAt(i) - '0');
            dp[i][j] = res;
            return res;
        }
        HashSet<Integer> res = new HashSet<>();
        for (int x = i + 1; x < j; x += 2) {
            char op = s.charAt(x);
            HashSet<Integer> left = opts(i, x - 1, s);
            HashSet<Integer> right = opts(x + 1, j, s);
            if (op == '*') {
                for (int l : left) {
                    for (int r : right) {
                        if (l * r <= 1000) {
                            res.add(l * r);
                        }
                    }
                }
            } else {
                for (int l : left) {
                    for (int r : right) {
                        if (l + r <= 1000) {
                            res.add(l + r);
                        }
                    }
                }
            }
        }
        dp[i][j] = res;
        return res;
    }
}
