package g3601_3700.s3609_minimum_moves_to_reach_target_in_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minMoves() {
        assertThat(new Solution().minMoves(1, 2, 5, 4), equalTo(2));
    }

    @Test
    void minMoves2() {
        assertThat(new Solution().minMoves(0, 1, 2, 3), equalTo(3));
    }

    @Test
    void minMoves3() {
        assertThat(new Solution().minMoves(1, 1, 2, 2), equalTo(-1));
    }
}
