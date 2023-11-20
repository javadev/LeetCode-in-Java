package g2801_2900.s2812_find_the_safest_path_in_a_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumSafenessFactor() {
        assertThat(
                new Solution()
                        .maximumSafenessFactor(
                                ArrayUtils.getLists(new int[][] {{1, 0, 0}, {0, 0, 0}, {0, 0, 1}})),
                equalTo(0));
    }

    @Test
    void maximumSafenessFactor2() {
        assertThat(
                new Solution()
                        .maximumSafenessFactor(
                                ArrayUtils.getLists(new int[][] {{0, 0, 1}, {0, 0, 0}, {0, 0, 0}})),
                equalTo(2));
    }

    @Test
    void maximumSafenessFactor3() {
        assertThat(
                new Solution()
                        .maximumSafenessFactor(
                                ArrayUtils.getLists(
                                        new int[][] {
                                            {0, 0, 0, 1}, {0, 0, 0, 0}, {0, 0, 0, 0}, {1, 0, 0, 0}
                                        })),
                equalTo(2));
    }
}
