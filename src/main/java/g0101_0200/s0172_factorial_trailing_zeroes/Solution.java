package g0101_0200.s0172_factorial_trailing_zeroes;

// #Medium #Top_Interview_Questions #Math #Udemy_Integers #Top_Interview_150_Math
// #2025_03_09_Time_0_ms_(100.00%)_Space_40.78_MB_(46.99%)

public class Solution {
    public int trailingZeroes(int n) {
        int base = 5;
        int count = 0;
        while (n >= base) {
            count += n / base;
            base = base * 5;
        }
        return count;
    }
}
