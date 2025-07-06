package g3601_3700.s3604_minimum_time_to_reach_destination_in_directed_graph;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minTime() {
        assertThat(new Solution().minTime(3, new int[][] {{0, 1, 0, 1}, {1, 2, 2, 5}}), equalTo(3));
    }

    @Test
    void minTime2() {
        assertThat(
                new Solution()
                        .minTime(
                                4,
                                new int[][] {
                                    {0, 1, 0, 3}, {1, 3, 7, 8}, {0, 2, 1, 5}, {2, 3, 4, 7}
                                }),
                equalTo(5));
    }

    @Test
    void minTime3() {
        assertThat(
                new Solution().minTime(3, new int[][] {{1, 0, 1, 3}, {1, 2, 3, 5}}), equalTo(-1));
    }
}
