package g0001_0100.s0009_palindrome_number;

// #Easy #Math #Udemy_Integers #2022_06_13_Time_13_ms_(58.99%)_Space_44.7_MB_(48.08%)

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
