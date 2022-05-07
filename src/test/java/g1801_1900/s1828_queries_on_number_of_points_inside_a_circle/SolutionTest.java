package g1801_1900.s1828_queries_on_number_of_points_inside_a_circle;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPoints() {
        assertThat(
                new Solution()
                        .countPoints(
                                new int[][] {{1, 3}, {3, 3}, {5, 3}, {2, 2}},
                                new int[][] {{2, 3, 1}, {4, 3, 1}, {1, 1, 2}}),
                equalTo(new int[] {3, 2, 2}));
    }

    @Test
    void countPoints2() {
        assertThat(
                new Solution()
                        .countPoints(
                                new int[][] {{1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}},
                                new int[][] {{1, 2, 2}, {2, 2, 2}, {4, 3, 2}, {4, 3, 3}}),
                equalTo(new int[] {2, 3, 2, 4}));
    }
}
