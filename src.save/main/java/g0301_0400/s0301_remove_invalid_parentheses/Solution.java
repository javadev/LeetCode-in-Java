package g0301_0400.s0301_remove_invalid_parentheses;

// #Hard #String #Breadth_First_Search #Backtracking
// #2022_07_07_Time_3_ms_(91.59%)_Space_42.9_MB_(72.56%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> res = new ArrayList<>();
        // reversed+inverted
        boolean ri = false;
        dfs(s, 0, 0, res, ri);
        return res;
    }

    // BASIC IDEA: find prefix w/ extra ")".
    // THEN use for loop to delete ")"s inside prefix, making recursive calls on the ENTIRE STRING
    // b/c you don't know where the next ")" will be deleted.
    private void dfs(String s, int deletionSearch, int stackSearch, List<String> res, boolean ri) {
        // functions imilarly to LC20. Valid Parenthesis, -1 for ")" and +1 for "("
        int stack = 0;
        // see recursive call for explanation
        int p = stackSearch;
        while (p < s.length() && stack >= 0) {
            if (s.charAt(p) == ')') {
                stack--;
            }
            if (s.charAt(p) == '(') {
                stack++;
            }
            p++;
        }
        if (stack < 0) {
            // p already goes beyond the prefix by +1
            String prefix = s.substring(0, p);
            // remove extra ")" from prefix
            for (int i = deletionSearch; i < prefix.length(); i++) {
                // find last ")" in ")))...)" to avoid duplicates
                if (s.charAt(i) == ')' && (i == prefix.length() - 1 || s.charAt(i + 1) != ')')) {
                    // remove s.charAt(i) and recurse
                    // NOTE: p-1 b/c after you make a deletion, you know that the prefix is valid,
                    // so there's no point in recounting ")"
                    // NOTE: p-1 is the start index for COUNTING ")" in the recursive call, not for
                    // DELETIONS.
                    // Think of the DELETION index as SEPARATE from the COUNTING/STACK index.
                    dfs(s.substring(0, i) + s.substring(i + 1), deletionSearch, p - 1, res, ri);
                    // for next iteration, can only search BEYOND i in recursive calls for the ")"
                    // to delete
                    deletionSearch = i + 1;
                }
            }
        } else {
            // no extra ")" found
            // repeat for "("
            if (!ri) {
                // reverse + invert
                s = reverseInvert(s);
                // call again
                dfs(s, 0, 0, res, true);
            } else {
                // done with both ")" and "("
                // revert to original arr
                s = reverseInvert(s);
                res.add(s);
            }
        }
    }

    // reverses and inverts to accomplish r->l scan
    private String reverseInvert(String s) {
        StringBuilder sb = new StringBuilder();
        // invert
        for (char c : s.toCharArray()) {
            if (c == '(') {
                sb.append(')');
            } else if (c == ')') {
                sb.append('(');
            } else {
                sb.append(c);
            }
        }
        // reverse
        return sb.reverse().toString();
    }
}
