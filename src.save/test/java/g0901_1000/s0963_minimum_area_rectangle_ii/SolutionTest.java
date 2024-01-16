package g0901_1000.s0963_minimum_area_rectangle_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minAreaFreeRect() {
        assertThat(
                new Solution().minAreaFreeRect(new int[][] {{1, 2}, {2, 1}, {1, 0}, {0, 1}}),
                equalTo(2.0));
    }

    @Test
    void minAreaFreeRect2() {
        assertThat(
                new Solution()
                        .minAreaFreeRect(new int[][] {{0, 1}, {2, 1}, {1, 1}, {1, 0}, {2, 0}}),
                equalTo(1.0));
    }

    @Test
    void minAreaFreeRect3() {
        assertThat(
                new Solution()
                        .minAreaFreeRect(new int[][] {{0, 3}, {1, 2}, {3, 1}, {1, 3}, {2, 1}}),
                equalTo(0.0));
    }
}
