package s0022.generate.parentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> generate(StringBuilder sb, List<String> str, int open, int close) {

        if (open == 0 && close == 0) {
            str.add(sb.toString());
            return str;
        }

        if (open > 0) {
            sb.append('(');
            generate(sb, str, open - 1, close);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (close > 0) {
            if (open < close) {
                sb.append(')');
                generate(sb, str, open, close - 1);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return str;
    }

    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        List<String> ans = new ArrayList<>();
        return generate(sb, ans, n, n);
    }
}
