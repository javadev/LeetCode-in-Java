package g0301_0400.s0310_minimum_height_trees;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMinHeightTrees() {
        assertThat(
                new Solution().findMinHeightTrees(4, new int[][] {{1, 0}, {1, 2}, {1, 3}}),
                equalTo(Arrays.asList(1)));
    }

    @Test
    void findMinHeightTrees2() {
        assertThat(
                new Solution()
                        .findMinHeightTrees(
                                6, new int[][] {{3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}}),
                equalTo(Arrays.asList(3, 4)));
    }
}
