package g1401_1500.s1453_maximum_number_of_darts_inside_of_a_circular_dartboard;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numPoints() {
        assertThat(
                new Solution().numPoints(new int[][] {{-2, 0}, {2, 0}, {0, 2}, {0, -2}}, 2),
                equalTo(4));
    }

    @Test
    void numPoints2() {
        assertThat(
                new Solution()
                        .numPoints(
                                new int[][] {{-3, 0}, {3, 0}, {2, 6}, {5, 4}, {0, 9}, {7, 8}}, 5),
                equalTo(5));
    }
}
