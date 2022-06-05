package g2101_2200.s2139_minimum_moves_to_reach_target_score;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minMoves() {
        assertThat(new Solution().minMoves(5, 0), equalTo(4));
    }

    @Test
    void minMoves2() {
        assertThat(new Solution().minMoves(19, 2), equalTo(7));
    }

    @Test
    void minMoves3() {
        assertThat(new Solution().minMoves(10, 4), equalTo(4));
    }
}
