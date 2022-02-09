package g0901_1000.s0902_numbers_at_most_n_given_digit_set;

// #Hard #Array #Dynamic_Programming #Math #Binary_Search

public class Solution {
    public int atMostNGivenDigitSet(String[] digits, int n) {
        int ans = 0;
        String num = "" + n;
        int d = digits.length;
        int l = num.length();
        for (int i = 1; i < l; i++) {
            ans += (int) Math.pow(d, i);
        }
        for (int i = 0; i < l; i++) {
            boolean flag = false;
            for (String digit : digits) {
                if (digit.charAt(0) < num.charAt(i)) {
                    ans += (int) Math.pow(d, (l - i - 1) * 1.0);
                } else if (num.charAt(i) == digit.charAt(0)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return ans;
            }
        }
        return ans + 1;
    }
}
