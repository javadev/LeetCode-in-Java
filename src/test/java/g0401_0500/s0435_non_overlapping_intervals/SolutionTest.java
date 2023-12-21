package g0401_0500.s0435_non_overlapping_intervals;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void eraseOverlapIntervals() {
        assertThat(
                new Solution().eraseOverlapIntervals(new int[][] {{1, 2}, {2, 3}, {3, 4}, {1, 3}}),
                equalTo(1));
    }

    @Test
    void eraseOverlapIntervals2() {
        assertThat(
                new Solution().eraseOverlapIntervals(new int[][] {{1, 2}, {1, 2}, {1, 2}}),
                equalTo(2));
    }

    @Test
    void eraseOverlapIntervals3() {
        assertThat(new Solution().eraseOverlapIntervals(new int[][] {{1, 2}, {2, 3}}), equalTo(0));
    }
}
