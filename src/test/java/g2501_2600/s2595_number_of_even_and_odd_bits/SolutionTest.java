package g2501_2600.s2595_number_of_even_and_odd_bits;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void evenOddBit() {
        assertThat(new Solution().evenOddBit(17), equalTo(new int[] {2, 0}));
    }

    @Test
    void evenOddBit2() {
        assertThat(new Solution().evenOddBit(2), equalTo(new int[] {0, 1}));
    }
}
