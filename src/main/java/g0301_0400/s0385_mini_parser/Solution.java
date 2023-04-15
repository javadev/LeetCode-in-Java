package g0301_0400.s0385_mini_parser;

// #Medium #String #Depth_First_Search #Stack #2022_07_13_Time_2_ms_(97.82%)_Space_45.8_MB_(66.18%)

import com_github_leetcode.NestedInteger;

/*
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
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
