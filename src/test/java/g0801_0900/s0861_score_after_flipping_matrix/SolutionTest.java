package g0801_0900.s0861_score_after_flipping_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void matrixScore() {
        assertThat(
                new Solution().matrixScore(new int[][] {{0, 0, 1, 1}, {1, 0, 1, 0}, {1, 1, 0, 0}}),
                equalTo(39));
    }

    @Test
    void matrixScore2() {
        assertThat(new Solution().matrixScore(new int[][] {{0}}), equalTo(1));
    }
}
