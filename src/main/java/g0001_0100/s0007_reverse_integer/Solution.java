package g0001_0100.s0007_reverse_integer;

// #Medium #Top_Interview_Questions #Math #Udemy_Integers
// #2024_01_04_Time_1_ms_(96.61%)_Space_40.9_MB_(11.62%)

public class Solution {
    public int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            rev = (rev * 10) + (x % 10);
            x /= 10;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) rev;
    }
}
