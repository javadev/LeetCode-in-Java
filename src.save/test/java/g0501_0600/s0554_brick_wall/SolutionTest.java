package g0501_0600.s0554_brick_wall;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void leastBricks() {
        assertThat(
                new Solution()
                        .leastBricks(
                                ArrayUtils.getLists(
                                        new int[][] {
                                            {1, 2, 2, 1},
                                            {3, 1, 2},
                                            {1, 3, 2},
                                            {2, 4},
                                            {3, 1, 2},
                                            {1, 3, 1, 1}
                                        })),
                equalTo(2));
    }

    @Test
    void leastBricks2() {
        assertThat(
                new Solution().leastBricks(ArrayUtils.getLists(new int[][] {{1}, {1}, {1}})),
                equalTo(3));
    }
}
