package g1201_1300.s1289_minimum_falling_path_sum_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minFallingPathSum() {
        assertThat(
                new Solution().minFallingPathSum(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}),
                equalTo(13));
    }

    @Test
    void minFallingPathSum2() {
        assertThat(new Solution().minFallingPathSum(new int[][] {{7}}), equalTo(7));
    }
}
