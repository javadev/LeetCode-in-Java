package g3501_3600.s3567_minimum_absolute_difference_in_sliding_submatrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minAbsDiff() {
        assertThat(
                new Solution().minAbsDiff(new int[][] {{1, 8}, {3, -2}}, 2),
                equalTo(new int[][] {{2}}));
    }

    @Test
    void minAbsDiff2() {
        assertThat(
                new Solution().minAbsDiff(new int[][] {{3, -1}}, 1), equalTo(new int[][] {{0, 0}}));
    }

    @Test
    void minAbsDiff3() {
        assertThat(
                new Solution().minAbsDiff(new int[][] {{1, -2, 3}, {2, 3, 5}}, 2),
                equalTo(new int[][] {{1, 2}}));
    }
}
