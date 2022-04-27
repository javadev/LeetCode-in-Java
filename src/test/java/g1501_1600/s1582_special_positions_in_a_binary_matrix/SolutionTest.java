package g1501_1600.s1582_special_positions_in_a_binary_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numSpecial() {
        assertThat(
                new Solution().numSpecial(new int[][] {{1, 0, 0}, {0, 0, 1}, {1, 0, 0}}),
                equalTo(1));
    }

    @Test
    void numSpecial2() {
        assertThat(
                new Solution().numSpecial(new int[][] {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}),
                equalTo(3));
    }
}
