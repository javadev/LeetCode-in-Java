package g1801_1900.s1851_minimum_interval_to_include_each_query;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minInterval() {
        assertThat(
                new Solution()
                        .minInterval(
                                new int[][] {{1, 4}, {2, 4}, {3, 6}, {4, 4}},
                                new int[] {2, 3, 4, 5}),
                equalTo(new int[] {3, 3, 1, 4}));
    }

    @Test
    void minInterval2() {
        assertThat(
                new Solution()
                        .minInterval(
                                new int[][] {{2, 3}, {2, 5}, {1, 8}, {20, 25}},
                                new int[] {2, 19, 5, 22}),
                equalTo(new int[] {2, -1, 4, 6}));
    }
}
