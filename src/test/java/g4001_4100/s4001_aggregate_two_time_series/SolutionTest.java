package g4001_4100.s4001_aggregate_two_time_series;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void aggregateTimeSeries() {
        assertThat(
                new Solution()
                        .aggregateTimeSeries(
                                new int[][] {{1, 3}, {4, 1}}, new int[][] {{2, 2}, {5, 2}}),
                equalTo(ArrayUtils.getLists(new int[][] {{1, 5}, {2, 3}, {4, 3}, {5, 2}})));
    }

    @Test
    void aggregateTimeSeries2() {
        assertThat(
                new Solution()
                        .aggregateTimeSeries(new int[][] {{1, 5}, {3, 1}}, new int[][] {{2, 2}}),
                equalTo(ArrayUtils.getLists(new int[][] {{1, 7}, {2, 3}, {3, 1}})));
    }

    @Test
    void aggregateTimeSeries3() {
        assertThat(
                new Solution()
                        .aggregateTimeSeries(new int[][] {{1, 5}}, new int[][] {{1000000000, 2}}),
                equalTo(ArrayUtils.getLists(new int[][] {{1, 7}, {1000000000, 2}})));
    }
}
