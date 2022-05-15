package g0101_0200.s0172_factorial_trailing_zeroes;

// #Medium #Top_Interview_Questions #Math #Acceptance_40.8%
// #2022_03_04_Time_1_ms_(81.96%)_Space_41.8_MB_(6.69%)

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
