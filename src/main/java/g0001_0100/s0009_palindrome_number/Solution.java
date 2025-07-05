package g0001_0100.s0009_palindrome_number;

// #Easy #Math #Udemy_Integers #Top_Interview_150_Math #Big_O_Time_O(log10(x))_Space_O(1)
// #2024_11_09_Time_4_ms_(100.00%)_Space_44.1_MB_(28.20%)

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
