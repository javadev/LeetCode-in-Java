package g1601_1700.s1631_path_with_minimum_effort;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumEffortPath() {
        assertThat(
                new Solution().minimumEffortPath(new int[][] {{1, 2, 2}, {3, 8, 2}, {5, 3, 5}}),
                equalTo(2));
    }

    @Test
    void minimumEffortPath2() {
        assertThat(
                new Solution().minimumEffortPath(new int[][] {{1, 2, 3}, {3, 8, 4}, {5, 3, 5}}),
                equalTo(1));
    }

    @Test
    void minimumEffortPath3() {
        assertThat(
                new Solution()
                        .minimumEffortPath(
                                new int[][] {
                                    {1, 2, 1, 1, 1},
                                    {1, 2, 1, 2, 1},
                                    {1, 2, 1, 2, 1},
                                    {1, 2, 1, 2, 1},
                                    {1, 1, 1, 2, 1}
                                }),
                equalTo(0));
    }
}
