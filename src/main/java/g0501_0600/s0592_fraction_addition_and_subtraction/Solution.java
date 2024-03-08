package g0501_0600.s0592_fraction_addition_and_subtraction;

// #Medium #String #Math #Simulation #2022_08_25_Time_6_ms_(91.33%)_Space_40.8_MB_(97.33%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private int gcd(int a, int b) {
        return a % b == 0 ? b : gcd(b, a % b);
    }

    private String format(int a, int b) {
        int gcd = Math.abs(gcd(a, b));
        return a / gcd + "/" + (b / gcd);
    }

    private int[] parse(String s) {
        int idx = s.indexOf("/");
        return new int[] {
            Integer.parseInt(s.substring(0, idx)), Integer.parseInt(s.substring(idx + 1))
        };
    }

    public String fractionAddition(String expression) {
        int[] rst = {0, 1};
        List<int[]> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder().append(expression.charAt(0));
        for (int i = 1; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-') {
                list.add(parse(sb.toString()));
                sb = new StringBuilder().append(c);
            } else {
                sb.append(c);
            }
        }
        list.add(parse(sb.toString()));
        for (int[] num : list) {
            rst = new int[] {rst[0] * num[1] + rst[1] * num[0], rst[1] * num[1]};
        }
        return format(rst[0], rst[1]);
    }
}
