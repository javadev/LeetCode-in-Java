package g0001_0100.s0069_sqrtx;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mySqrt() {
        assertThat(new Solution().mySqrt(4), equalTo(2));
    }

    @Test
    void mySqrt2() {
        assertThat(new Solution().mySqrt(8), equalTo(2));
    }
}
