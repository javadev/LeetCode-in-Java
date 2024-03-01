package g0301_0400.s0367_valid_perfect_square;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isPerfectSquare() {
        assertThat(new Solution().isPerfectSquare(16), equalTo(true));
    }

    @Test
    void isPerfectSquare2() {
        assertThat(new Solution().isPerfectSquare(14), equalTo(false));
    }
}
