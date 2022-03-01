package g0701_0800.s0797_all_paths_from_source_to_target;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void allPathsSourceTarget() {
        assertThat(
                new Solution().allPathsSourceTarget(new int[][] {{1, 2}, {3}, {3}, {}}),
                equalTo(ArrayUtils.getLists(new int[][] {{0, 1, 3}, {0, 2, 3}})));
    }

    @Test
    void allPathsSourceTarget2() {
        assertThat(
                new Solution()
                        .allPathsSourceTarget(new int[][] {{4, 3, 1}, {3, 2, 4}, {3}, {4}, {}}),
                equalTo(
                        ArrayUtils.getLists(
                                new int[][] {
                                    {0, 4}, {0, 3, 4}, {0, 1, 3, 4}, {0, 1, 2, 3, 4}, {0, 1, 4}
                                })));
    }
}
