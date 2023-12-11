package g1601_1700.s1674_minimum_moves_to_make_array_complementary;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minMoves() {
        assertThat(new Solution().minMoves(new int[] {1, 2, 4, 3}, 4), equalTo(1));
    }

    @Test
    void minMoves2() {
        assertThat(new Solution().minMoves(new int[] {1, 2, 2, 1}, 2), equalTo(2));
    }

    @Test
    void minMoves3() {
        assertThat(new Solution().minMoves(new int[] {1, 2, 1, 2}, 2), equalTo(0));
    }
}
