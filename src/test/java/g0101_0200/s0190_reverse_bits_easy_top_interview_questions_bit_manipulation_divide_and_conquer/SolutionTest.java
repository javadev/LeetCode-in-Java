package g0101_0200.s0190_reverse_bits_easy_top_interview_questions_bit_manipulation_divide_and_conquer;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void reverseBits() {
        assertThat(
                new Solution().reverseBits(0b00000010100101000001111010011100),
                equalTo(0b00111001011110000010100101000000));
    }

    @Test
    public void reverseBits2() {
        assertThat(
                new Solution().reverseBits(0b11111111111111111111111111111101),
                equalTo(0b10111111111111111111111111111111));
    }
}
