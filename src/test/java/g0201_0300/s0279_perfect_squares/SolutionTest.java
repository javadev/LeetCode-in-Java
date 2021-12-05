package g0201_0300.s0279_perfect_squares;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numSquares() {
        assertThat(new Solution().numSquares(12), equalTo(3));
    }

    @Test
    void numSquares2() {
        assertThat(new Solution().numSquares(13), equalTo(2));
    }
}
