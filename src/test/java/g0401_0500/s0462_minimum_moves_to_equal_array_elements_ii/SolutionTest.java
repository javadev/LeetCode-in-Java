package g0401_0500.s0462_minimum_moves_to_equal_array_elements_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minMoves2() {
        assertThat(new Solution().minMoves2(new int[] {1, 2, 3}), equalTo(2));
    }

    @Test
    void minMoves22() {
        assertThat(new Solution().minMoves2(new int[] {1, 10, 2, 9}), equalTo(16));
    }
}
