package g0701_0800.s0793_preimage_size_of_factorial_zeroes_function;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void preimageSizeFZF() {
        assertThat(new Solution().preimageSizeFZF(0), equalTo(5));
    }

    @Test
    void preimageSizeFZF2() {
        assertThat(new Solution().preimageSizeFZF(5), equalTo(0));
    }

    @Test
    void preimageSizeFZF3() {
        assertThat(new Solution().preimageSizeFZF(3), equalTo(5));
    }
}
