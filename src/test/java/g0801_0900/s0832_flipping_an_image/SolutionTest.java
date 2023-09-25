package g0801_0900.s0832_flipping_an_image;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void flipAndInvertImage() {
        assertThat(
                new Solution().flipAndInvertImage(new int[][] {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}}),
                equalTo(new int[][] {{1, 0, 0}, {0, 1, 0}, {1, 1, 1}}));
    }

    @Test
    void flipAndInvertImage2() {
        assertThat(
                new Solution()
                        .flipAndInvertImage(
                                new int[][] {
                                    {1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}
                                }),
                equalTo(new int[][] {{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}}));
    }
}
