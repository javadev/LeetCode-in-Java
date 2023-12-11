package g0301_0400.s0313_super_ugly_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void nthSuperUglyNumber() {
        assertThat(new Solution().nthSuperUglyNumber(12, new int[] {2, 7, 13, 19}), equalTo(32));
    }

    @Test
    void nthSuperUglyNumber2() {
        assertThat(new Solution().nthSuperUglyNumber(1, new int[] {2, 3, 5}), equalTo(1));
    }
}
