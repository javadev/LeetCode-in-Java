package g0301_0400.s0338_counting_bits;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countBits() {
        assertThat(new Solution().countBits(2), equalTo(new int[] {0, 1, 1}));
    }

    @Test
    void countBits2() {
        assertThat(new Solution().countBits(5), equalTo(new int[] {0, 1, 1, 2, 1, 2}));
    }
}
