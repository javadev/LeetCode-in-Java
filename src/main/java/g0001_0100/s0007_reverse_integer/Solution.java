package g0001_0100.s0007_reverse_integer;

// #Medium #Top_Interview_Questions #Math #Udemy_Integers #Big_O_Time_O(log10(x))_Space_O(1)
// #2024_11_09_Time_0_ms_(100.00%)_Space_40.9_MB_(36.21%)

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
