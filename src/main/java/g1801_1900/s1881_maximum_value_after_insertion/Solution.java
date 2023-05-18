package g1801_1900.s1881_maximum_value_after_insertion;

// #Medium #String #Greedy #2022_05_11_Time_12_ms_(85.08%)_Space_42.8_MB_(98.31%)

public class Solution {
    public String maxValue(String n, int x) {
        int i = 0;
        int sign = n.charAt(0) == '-' ? -1 : 1;
        for (; i < n.length(); i++) {
            if (n.charAt(i) != '-' && (sign * (n.charAt(i) - '0') < sign * x)) {
                break;
            }
        }
        return n.substring(0, i) + x + n.substring(i);
    }
}
