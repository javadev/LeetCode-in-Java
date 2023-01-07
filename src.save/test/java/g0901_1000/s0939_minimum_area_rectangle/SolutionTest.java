package g0901_1000.s0939_minimum_area_rectangle;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minAreaRect() {
        assertThat(
                new Solution().minAreaRect(new int[][] {{1, 1}, {1, 3}, {3, 1}, {3, 3}, {2, 2}}),
                equalTo(4));
    }

    @Test
    void minAreaRect2() {
        assertThat(
                new Solution()
                        .minAreaRect(new int[][] {{1, 1}, {1, 3}, {3, 1}, {3, 3}, {4, 1}, {4, 3}}),
                equalTo(2));
    }
}
