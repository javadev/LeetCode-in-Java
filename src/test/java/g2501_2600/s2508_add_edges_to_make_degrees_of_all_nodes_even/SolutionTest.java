package g2501_2600.s2508_add_edges_to_make_degrees_of_all_nodes_even;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isPossible() {
        assertThat(
                new Solution()
                        .isPossible(
                                5,
                                ArrayUtils.getLists(
                                        new int[][] {
                                            {1, 2}, {2, 3}, {3, 4}, {4, 2}, {1, 4}, {2, 5}
                                        })),
                equalTo(true));
    }

    @Test
    void isPossible2() {
        assertThat(
                new Solution().isPossible(4, ArrayUtils.getLists(new int[][] {{1, 2}, {3, 4}})),
                equalTo(true));
    }

    @Test
    void isPossible3() {
        assertThat(
                new Solution()
                        .isPossible(4, ArrayUtils.getLists(new int[][] {{1, 2}, {1, 3}, {1, 4}})),
                equalTo(false));
    }
}
