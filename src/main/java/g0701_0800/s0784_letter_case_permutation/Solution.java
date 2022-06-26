package g0701_0800.s0784_letter_case_permutation;

// #Medium #String #Bit_Manipulation #Backtracking #Algorithm_I_Day_11_Recursion_Backtracking
// #2022_03_26_Time_10_ms_(40.38%)_Space_55.5_MB_(5.44%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<String> ans = new ArrayList<>();

    public List<String> letterCasePermutation(String s) {
        helper(s, 0, "");
        return ans;
    }

    public void helper(String s, int curr, String temp) {
        if (curr == s.length()) {
            ans.add(temp);
            return;
        }
        if (Character.isDigit(s.charAt(curr))) {
            helper(s, curr + 1, temp + s.charAt(curr));
        } else {
            if (Character.isLowerCase(s.charAt(curr))) {
                helper(s, curr + 1, temp + s.charAt(curr));
                helper(s, curr + 1, temp + (s.substring(curr, curr + 1)).toUpperCase());
            } else {
                helper(s, curr + 1, temp + s.charAt(curr));
                helper(s, curr + 1, temp + (s.substring(curr, curr + 1)).toLowerCase());
            }
        }
    }
}
