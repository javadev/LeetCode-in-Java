package g0801_0900.s0835_image_overlap;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestOverlap() {
        assertThat(
                new Solution()
                        .largestOverlap(
                                new int[][] {{1, 1, 0}, {0, 1, 0}, {0, 1, 0}},
                                new int[][] {{0, 0, 0}, {0, 1, 1}, {0, 0, 1}}),
                equalTo(3));
    }

    @Test
    void largestOverlap2() {
        assertThat(new Solution().largestOverlap(new int[][] {{1}}, new int[][] {{1}}), equalTo(1));
    }

    @Test
    void largestOverlap3() {
        assertThat(new Solution().largestOverlap(new int[][] {{0}}, new int[][] {{0}}), equalTo(0));
    }
}
