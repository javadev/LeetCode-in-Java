package g0001_0100.s0009_palindrome_number;

// #Easy #Math #Acceptance_52.4% #2022_02_17_Time_6_ms_(99.98%)_Space_41.3_MB_(57.22%)

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int rev = 0;
        int localX = x;
        while (localX > 0) {
            rev *= 10;
            rev += localX % 10;
            localX /= 10;
        }
        return rev == x;
    }
}
