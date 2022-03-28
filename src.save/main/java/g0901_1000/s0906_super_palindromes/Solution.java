package g0901_1000.s0906_super_palindromes;

// #Hard #Math #Enumeration #2022_03_28_Time_229_ms_(91.38%)_Space_42_MB_(93.10%)

public class Solution {
    public int superpalindromesInRange(String left, String right) {
        long l = Long.parseLong(left);
        long r = Long.parseLong(right);
        int cnt = 0;
        long cur = 1;
        while (true) {
            long p1 = getPalindromeIncLastDigit(cur);
            long p2 = getPalindromeExcLastDigit(cur);
            long sq1 = p1 * p1;
            long sq2 = p2 * p2;
            if (sq2 > r) {
                break;
            }
            if (sq1 >= l && sq1 <= r && isPalindrome(sq1)) {
                cnt++;
            }
            if (sq2 >= l && isPalindrome(sq2)) {
                cnt++;
            }
            cur++;
        }
        return cnt;
    }

    private boolean isPalindrome(long val) {
        long construct = 0;
        if (val % 10 == 0 && val >= 10) {
            return false;
        }
        while (construct < val) {
            construct = construct * 10 + val % 10;
            val /= 10;
        }
        return construct == val || construct / 10 == val;
    }

    private long getPalindromeIncLastDigit(long val) {
        long copy = val;
        while (copy != 0) {
            val = val * 10 + copy % 10;
            copy /= 10;
        }
        return val;
    }

    private long getPalindromeExcLastDigit(long val) {
        long copy = val / 10;
        while (copy != 0) {
            val = val * 10 + copy % 10;
            copy /= 10;
        }
        return val;
    }
}
