package g1501_1600.s1541_minimum_insertions_to_balance_a_parentheses_string;

// #Medium #String #Greedy #Stack #2022_04_11_Time_12_ms_(85.50%)_Space_52.6_MB_(44.12%)

public class Solution {
    public int minInsertions(String s) {
        int conClosed = 0;
        int opened = 0;
        int total = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == ')') {
                conClosed++;
                if (conClosed == 2) {
                    conClosed = 0;
                    if (opened > 0) {
                        opened--;
                    } else {
                        total++;
                    }
                }
            } else {
                if (conClosed == 1) {
                    if (opened > 0) {
                        opened--;
                        total += 1;
                    } else {
                        total += 2;
                    }
                    conClosed = 0;
                }
                opened += 1;
            }
        }
        if (conClosed == 1) {
            if (opened > 0) {
                opened--;
                total += 1;
            } else {
                total += 2;
            }
        }
        total += opened * 2;
        return total;
    }
}
