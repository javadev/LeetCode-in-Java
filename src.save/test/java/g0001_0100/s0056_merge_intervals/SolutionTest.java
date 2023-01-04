package g0001_0100.s0056_merge_intervals;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void merge() {
        assertThat(
                new Solution().merge(new int[][] {{1, 3}, {2, 6}, {8, 10}, {15, 18}}),
                equalTo(new int[][] {{1, 6}, {8, 10}, {15, 18}}));
    }

    @Test
    void merge2() {
        assertThat(
                new Solution().merge(new int[][] {{1, 4}, {4, 5}}), equalTo(new int[][] {{1, 5}}));
    }
}
