package g1201_1300.s1249_minimum_remove_to_make_valid_parentheses;

// #Medium #String #Stack #Data_Structure_II_Day_14_Stack_Queue
// #2022_03_12_Time_13_ms_(94.62%)_Space_51.3_MB_(53.95%)

public class Solution {
    public String minRemoveToMakeValid(String s) {
        int closingParantheis = 0;
        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                closingParantheis++;
            }
        }
        StringBuilder result = new StringBuilder();
        int openingParanthesis = 0;
        for (char ch : s.toCharArray()) {
            if (ch == ')' && openingParanthesis == 0) {
                closingParantheis--;
            } else {
                if (ch == ')') {
                    openingParanthesis--;
                }
                if (ch == '(' && closingParantheis == 0) {
                    continue;
                }
                if (ch == '(') {
                    openingParanthesis++;
                    closingParantheis--;
                }
                result.append(ch);
            }
        }
        return result.toString();
    }
}
