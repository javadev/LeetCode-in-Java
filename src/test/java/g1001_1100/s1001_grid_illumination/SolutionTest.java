package g1001_1100.s1001_grid_illumination;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void gridIllumination() {
        assertThat(
                new Solution()
                        .gridIllumination(
                                5, new int[][] {{0, 0}, {4, 4}}, new int[][] {{1, 1}, {1, 0}}),
                equalTo(new int[] {1, 0}));
    }

    @Test
    void gridIllumination2() {
        assertThat(
                new Solution()
                        .gridIllumination(
                                5, new int[][] {{0, 0}, {4, 4}}, new int[][] {{1, 1}, {1, 1}}),
                equalTo(new int[] {1, 1}));
    }

    @Test
    void gridIllumination3() {
        assertThat(
                new Solution()
                        .gridIllumination(
                                5,
                                new int[][] {{0, 0}, {0, 4}},
                                new int[][] {{0, 4}, {0, 1}, {1, 4}}),
                equalTo(new int[] {1, 1, 0}));
    }
}
