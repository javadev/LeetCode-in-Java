package g0601_0700.s0661_image_smoother;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void imageSmoother() {
        assertThat(
                new Solution().imageSmoother(new int[][] {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}}),
                equalTo(new int[][] {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}));
    }

    @Test
    void imageSmoother2() {
        assertThat(
                new Solution()
                        .imageSmoother(
                                new int[][] {{100, 200, 100}, {200, 50, 200}, {100, 200, 100}}),
                equalTo(new int[][] {{137, 141, 137}, {141, 138, 141}, {137, 141, 137}}));
    }
}
