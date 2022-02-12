package g0901_1000.s0980_unique_paths_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void uniquePathsIII() {
        assertThat(
                new Solution()
                        .uniquePathsIII(new int[][] {{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 2, -1}}),
                equalTo(2));
    }

    @Test
    void uniquePathsIII2() {
        assertThat(
                new Solution()
                        .uniquePathsIII(new int[][] {{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 2}}),
                equalTo(4));
    }

    @Test
    void uniquePathsIII3() {
        assertThat(new Solution().uniquePathsIII(new int[][] {{0, 1}, {2, 0}}), equalTo(0));
    }
}
