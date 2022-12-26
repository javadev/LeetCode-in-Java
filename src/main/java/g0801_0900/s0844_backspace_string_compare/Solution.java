package g0801_0900.s0844_backspace_string_compare;

// #Easy #String #Two_Pointers #Stack #Simulation #Algorithm_II_Day_4_Two_Pointers
// #Level_1_Day_14_Stack #2022_03_24_Time_0_ms_(100.00%)_Space_40.1_MB_(87.37%)

public class Solution {
    public boolean backspaceCompare(String s, String t) {
        return cmprStr(s).equals(cmprStr(t));
    }

    private String cmprStr(String str) {
        StringBuilder res = new StringBuilder();
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            char currChar = str.charAt(i);
            if (currChar == '#') {
                count++;
            } else {
                if (count > 0) {
                    count--;
                } else {
                    res.append(currChar);
                }
            }
        }
        return res.toString();
    }
}
