package g0901_1000.s0931_minimum_falling_path_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minFallingPathSum() {
        assertThat(
                new Solution().minFallingPathSum(new int[][] {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}}),
                equalTo(13));
    }

    @Test
    void minFallingPathSum2() {
        assertThat(
                new Solution().minFallingPathSum(new int[][] {{-19, 57}, {-40, -5}}), equalTo(-59));
    }
}
