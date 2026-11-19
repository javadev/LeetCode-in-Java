package g4001_4100.s4016_maximum_area_of_two_non_overlapping_square_submatrices;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxArea() {
        assertThat(
                new Solution().maxArea(new int[][] {{1, 1, 1, 0}, {1, 1, 1, 1}, {0, 0, 1, 1}}),
                equalTo(4));
    }

    @Test
    void maxArea2() {
        assertThat(new Solution().maxArea(new int[][] {{0, 1}, {1, 0}}), equalTo(1));
    }

    @Test
    void maxArea3() {
        assertThat(new Solution().maxArea(new int[][] {{0, 0}, {0, 1}}), equalTo(0));
    }
}
