package g1901_2000.s1923_longest_common_subpath;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestCommonSubpath() {
        assertThat(
                new Solution()
                        .longestCommonSubpath(
                                5, new int[][] {{0, 1, 2, 3, 4}, {2, 3, 4}, {4, 0, 1, 2, 3}}),
                equalTo(2));
    }

    @Test
    void longestCommonSubpath2() {
        assertThat(new Solution().longestCommonSubpath(5, new int[][] {{0}, {1}, {2}}), equalTo(0));
    }

    @Test
    void longestCommonSubpath3() {
        assertThat(
                new Solution()
                        .longestCommonSubpath(5, new int[][] {{0, 1, 2, 3, 4}, {4, 3, 2, 1, 0}}),
                equalTo(1));
    }
}
