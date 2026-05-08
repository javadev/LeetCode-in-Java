package g3701_3800.s3776_minimum_moves_to_balance_circular_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minMoves() {
        assertThat(new Solution().minMoves(new int[] {5, 1, -4}), equalTo(4L));
    }

    @Test
    void minMoves2() {
        assertThat(new Solution().minMoves(new int[] {1, 2, -5, 2}), equalTo(6L));
    }

    @Test
    void minMoves3() {
        assertThat(new Solution().minMoves(new int[] {-3, 2}), equalTo(-1L));
    }
}
