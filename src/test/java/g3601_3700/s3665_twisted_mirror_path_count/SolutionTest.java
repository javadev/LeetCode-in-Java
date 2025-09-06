package g3601_3700.s3665_twisted_mirror_path_count;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void uniquePaths() {
        assertThat(
                new Solution().uniquePaths(new int[][] {{0, 1, 0}, {0, 0, 1}, {1, 0, 0}}),
                equalTo(5));
    }

    @Test
    void uniquePaths2() {
        assertThat(new Solution().uniquePaths(new int[][] {{0, 0}, {0, 0}}), equalTo(2));
    }

    @Test
    void uniquePaths3() {
        assertThat(new Solution().uniquePaths(new int[][] {{0, 1, 1}, {1, 1, 0}}), equalTo(1));
    }
}
