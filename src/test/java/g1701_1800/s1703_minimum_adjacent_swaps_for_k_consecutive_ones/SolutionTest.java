package g1701_1800.s1703_minimum_adjacent_swaps_for_k_consecutive_ones;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minMoves() {
        assertThat(new Solution().minMoves(new int[] {1, 0, 0, 1, 0, 1}, 2), equalTo(1));
    }

    @Test
    void minMoves2() {
        assertThat(new Solution().minMoves(new int[] {1, 0, 0, 0, 0, 0, 1, 1}, 3), equalTo(5));
    }

    @Test
    void minMoves3() {
        assertThat(new Solution().minMoves(new int[] {1, 1, 0, 1}, 2), equalTo(0));
    }
}
