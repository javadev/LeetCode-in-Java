package g1501_1600.s1504_count_submatrices_with_all_ones;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numSubmat() {
        assertThat(
                new Solution().numSubmat(new int[][] {{1, 0, 1}, {1, 1, 0}, {1, 1, 0}}),
                equalTo(13));
    }

    @Test
    void numSubmat2() {
        assertThat(
                new Solution().numSubmat(new int[][] {{0, 1, 1, 0}, {0, 1, 1, 1}, {1, 1, 1, 0}}),
                equalTo(24));
    }
}
