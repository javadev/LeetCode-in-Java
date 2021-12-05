package g0201_0300.s0201_bitwise_and_of_numbers_range_medium_bit_manipulation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void rangeBitwiseAnd() {
        assertThat(new Solution().rangeBitwiseAnd(5, 7), equalTo(4));
    }

    @Test
    public void rangeBitwiseAnd2() {
        assertThat(new Solution().rangeBitwiseAnd(0, 0), equalTo(0));
    }

    @Test
    public void rangeBitwiseAnd3() {
        assertThat(new Solution().rangeBitwiseAnd(1, 2147483647), equalTo(0));
    }
}
