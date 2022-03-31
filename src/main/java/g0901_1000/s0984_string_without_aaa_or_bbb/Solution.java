package g0901_1000.s0984_string_without_aaa_or_bbb;

// #Medium #String #Greedy #2022_03_31_Time_0_ms_(100.00%)_Space_39.7_MB_(86.30%)

public class Solution {
    public String strWithout3a3b(int a, int b) {
        String first = a > b ? "a" : "b";
        String second = first.equals("a") ? "b" : "a";
        int firstLen = Math.max(a, b);
        int secondLen = Math.min(a, b);
        StringBuilder ans = new StringBuilder();
        // Case 1 : A and B count are unequal.
        while (firstLen > 0 && secondLen > 0 && firstLen != secondLen) {
            ans.append(first);
            ans.append(first);
            firstLen = firstLen - 2;
            ans.append(second);
            secondLen--;
        }
        // Case 2: A and B count are equal
        while (firstLen > 0 && secondLen > 0) {
            ans.append(first);
            ans.append(second);
            firstLen--;
            secondLen--;
        }
        // left over, just append
        while (firstLen > 0) {
            ans.append(first);
            firstLen--;
        }
        return ans.toString();
    }
}
