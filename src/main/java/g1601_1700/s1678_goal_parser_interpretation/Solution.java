package g1601_1700.s1678_goal_parser_interpretation;

// #Easy #String #Programming_Skills_I_Day_8_String
// #2022_04_21_Time_0_ms_(100.00%)_Space_40.4_MB_(87.95%)

public class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < command.length()) {
            if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                sb.append("o");
                i++;
            } else if ((command.charAt(i) != '(' || command.charAt(i + 1) == ')')
                    && command.charAt(i) != ')') {
                sb.append(command.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}
