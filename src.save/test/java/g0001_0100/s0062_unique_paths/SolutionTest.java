package g0001_0100.s0062_unique_paths;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void uniquePaths() {
        assertThat(new Solution().uniquePaths(3, 7), equalTo(28));
    }

    @Test
    void uniquePaths2() {
        assertThat(new Solution().uniquePaths(3, 2), equalTo(3));
    }
}
