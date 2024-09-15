package g3201_3300.s3286_find_a_safe_walk_through_a_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findSafeWalk() {
        assertThat(
                new Solution()
                        .findSafeWalk(
                                ArrayUtils.getLists(
                                        new int[][] {
                                            {0, 1, 0, 0, 0}, {0, 1, 0, 1, 0}, {0, 0, 0, 1, 0}
                                        }),
                                1),
                equalTo(true));
    }

    @Test
    void findSafeWalk2() {
        assertThat(
                new Solution()
                        .findSafeWalk(
                                ArrayUtils.getLists(
                                        new int[][] {
                                            {0, 1, 1, 0, 0, 0},
                                            {1, 0, 1, 0, 0, 0},
                                            {0, 1, 1, 1, 0, 1},
                                            {0, 0, 1, 0, 1, 0}
                                        }),
                                3),
                equalTo(false));
    }

    @Test
    void findSafeWalk3() {
        assertThat(
                new Solution()
                        .findSafeWalk(
                                ArrayUtils.getLists(new int[][] {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}}),
                                5),
                equalTo(true));
    }
}
