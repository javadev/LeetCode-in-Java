package g0601_0700.s0688_knight_probability_in_chessboard;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void knightProbability() {
        assertThat(new Solution().knightProbability(3, 2, 0, 0), equalTo(0.06250));
    }

    @Test
    void knightProbability2() {
        assertThat(new Solution().knightProbability(1, 0, 0, 0), equalTo(1.00));
    }
}
