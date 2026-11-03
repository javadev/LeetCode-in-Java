package g3901_4000.s3975_filter_occupied_intervals;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void filterOccupiedIntervals() {
        assertThat(
                new Solution()
                        .filterOccupiedIntervals(
                                new int[][] {{2, 6}, {4, 8}, {10, 10}, {10, 12}, {14, 16}}, 7, 11),
                equalTo(List.of(List.of(2, 6), List.of(12, 12), List.of(14, 16))));
    }

    @Test
    void filterOccupiedIntervals2() {
        assertThat(
                new Solution().filterOccupiedIntervals(new int[][] {{1, 5}, {2, 3}}, 3, 8),
                equalTo(List.of(List.of(1, 2))));
    }

    @Test
    void filterOccupiedIntervals3() {
        assertThat(
                new Solution().filterOccupiedIntervals(new int[][] {{1, 2}, {4, 5}}, 1, 5),
                equalTo(List.of()));
    }
}
