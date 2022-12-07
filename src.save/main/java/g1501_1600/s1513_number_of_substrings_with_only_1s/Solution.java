package g1501_1600.s1513_number_of_substrings_with_only_1s;

// #Medium #String #Math #2022_04_09_Time_3_ms_(97.83%)_Space_42.7_MB_(85.14%)

public class Solution {
    public int numSub(String s) {
        long count = 0;
        long res = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '0') {
                res += count * (count + 1) / 2;
                count = 0;
            } else {
                count++;
            }
        }
        res += count * (count + 1) / 2;
        return (int) (res % 1000000007);
    }
}
