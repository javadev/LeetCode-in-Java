package g0001_0100.s0022_generate_parentheses;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #String #Dynamic_Programming
// #Backtracking #Algorithm_II_Day_11_Recursion_Backtracking #Udemy_Backtracking/Recursion
// #Big_O_Time_O(2^n)_Space_O(n) #2023_08_09_Time_0_ms_(100.00%)_Space_41.7_MB_(97.17%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        List<String> ans = new ArrayList<>();
        return generate(sb, ans, n, n);
    }

    private List<String> generate(StringBuilder sb, List<String> str, int open, int close) {
        if (open == 0 && close == 0) {
            str.add(sb.toString());
            return str;
        }
        if (open > 0) {
            sb.append('(');
            generate(sb, str, open - 1, close);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (close > 0 && open < close) {
            sb.append(')');
            generate(sb, str, open, close - 1);
            sb.deleteCharAt(sb.length() - 1);
        }
        return str;
    }
}
