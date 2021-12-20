package g0301_0400.s0385_mini_parser;

// #Medium #String #Depth_First_Search #Stack

import com_github_leetcode.NestedInteger;

public class Solution {
    private int i = 0;

    public NestedInteger deserialize(String s) {
        return getAns(s);
    }

    private NestedInteger getAns(String s) {
        if (s.charAt(i) == '[') {
            NestedInteger ni = new NestedInteger();
            i++;
            while (i < s.length() && s.charAt(i) != ']') {
                ni.add(getAns(s));
            }
            i++;
            return ni;
        } else if (s.charAt(i) == ',') {
            i++;
            return getAns(s);
        } else {
            int x = 0;
            int m = 1;
            if (s.charAt(i) == '-') {
                i++;
                m = -1;
            }
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                x = x * 10 + s.charAt(i++) - '0';
            }
            x *= m;
            return new NestedInteger(x);
        }
    }
}
