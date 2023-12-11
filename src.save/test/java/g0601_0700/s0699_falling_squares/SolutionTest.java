package g0601_0700.s0699_falling_squares;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void fallingSquares() {
        assertThat(
                new Solution().fallingSquares(new int[][] {{1, 2}, {2, 3}, {6, 1}}),
                equalTo(Arrays.asList(2, 5, 5)));
    }

    @Test
    void fallingSquares2() {
        assertThat(
                new Solution().fallingSquares(new int[][] {{100, 100}, {200, 100}}),
                equalTo(Arrays.asList(100, 100)));
    }
}
