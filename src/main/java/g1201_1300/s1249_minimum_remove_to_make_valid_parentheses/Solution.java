package g1201_1300.s1249_minimum_remove_to_make_valid_parentheses;

// #Medium #String #Stack #Data_Structure_II_Day_14_Stack_Queue
// #2022_03_12_Time_10_ms_(97.88%)_Space_42.9_MB_(85.10%)

public class Solution {
    public String minRemoveToMakeValid(String s) {
        int closingParantheis = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                closingParantheis++;
            }
        }
        StringBuilder result = new StringBuilder();
        int openingParanthesis = 0;
        for (char ch : s.toCharArray()) {
            if (ch == ')' && openingParanthesis == 0) {
                closingParantheis--;
                continue;
            }
            if (ch == ')') {
                openingParanthesis--;
            }
            if (ch != '(' || closingParantheis != 0) {
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
