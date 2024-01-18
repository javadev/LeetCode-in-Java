package g1901_2000.s1906_minimum_absolute_difference_queries;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minDifference() {
        assertThat(
                new Solution()
                        .minDifference(
                                new int[] {1, 3, 4, 8},
                                new int[][] {{0, 1}, {1, 2}, {2, 3}, {0, 3}}),
                equalTo(new int[] {2, 1, 4, 1}));
    }

    @Test
    void minDifference2() {
        assertThat(
                new Solution()
                        .minDifference(
                                new int[] {4, 5, 2, 2, 7, 10},
                                new int[][] {{2, 3}, {0, 2}, {0, 5}, {3, 5}}),
                equalTo(new int[] {-1, 1, 1, 3}));
    }
}
