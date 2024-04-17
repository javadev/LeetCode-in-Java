package g3001_3100.s3086_minimum_moves_to_pick_k_ones;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumMoves() {
        assertThat(
                new Solution().minimumMoves(new int[] {1, 1, 0, 0, 0, 1, 1, 0, 0, 1}, 3, 1),
                equalTo(3L));
    }

    @Test
    void minimumMoves2() {
        assertThat(new Solution().minimumMoves(new int[] {0, 0, 0, 0}, 2, 3), equalTo(4L));
    }

    @Test
    void minimumMoves3() {
        assertThat(new Solution().minimumMoves(new int[] {1, 0, 1, 0, 1}, 3, 0), equalTo(4L));
    }
}
