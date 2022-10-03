package g1001_1100.s1034_coloring_a_border;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void colorBorder() {
        assertThat(
                new Solution().colorBorder(new int[][] {{1, 1}, {1, 2}}, 0, 0, 3),
                equalTo(new int[][] {{3, 3}, {3, 2}}));
    }

    @Test
    void colorBorder2() {
        assertThat(
                new Solution().colorBorder(new int[][] {{1, 2, 2}, {2, 3, 2}}, 0, 1, 3),
                equalTo(new int[][] {{1, 3, 3}, {2, 3, 3}}));
    }

    @Test
    void colorBorder3() {
        assertThat(
                new Solution().colorBorder(new int[][] {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}}, 1, 1, 2),
                equalTo(new int[][] {{2, 2, 2}, {2, 1, 2}, {2, 2, 2}}));
    }
}
