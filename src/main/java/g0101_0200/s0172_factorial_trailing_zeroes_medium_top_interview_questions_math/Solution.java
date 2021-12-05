package g0101_0200.s0172_factorial_trailing_zeroes_medium_top_interview_questions_math;

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
