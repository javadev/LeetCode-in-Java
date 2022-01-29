package g0401_0500.s0453_minimum_moves_to_equal_array_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minMoves() {
        assertThat(new Solution().minMoves(new int[] {1, 2, 3}), equalTo(3));
    }

    @Test
    void minMoves2() {
        assertThat(new Solution().minMoves(new int[] {1, 1, 1}), equalTo(0));
    }
}
