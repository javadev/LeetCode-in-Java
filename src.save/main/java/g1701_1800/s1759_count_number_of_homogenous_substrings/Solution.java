package g1701_1800.s1759_count_number_of_homogenous_substrings;

// #Medium #String #Math #2022_04_30_Time_19_ms_(42.40%)_Space_51.3_MB_(28.80%)

public class Solution {
    public int countHomogenous(String s) {
        int total = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }
            total = (total + count) % 1000000007;
        }
        return total;
    }
}
