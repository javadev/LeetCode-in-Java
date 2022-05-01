package g1401_1500.s1489_find_critical_and_pseudo_critical_edges_in_minimum_spanning_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findCriticalAndPseudoCriticalEdges() {
        assertThat(
                new Solution()
                        .findCriticalAndPseudoCriticalEdges(
                                5,
                                new int[][] {
                                    {0, 1, 1}, {1, 2, 1}, {2, 3, 2}, {0, 3, 2}, {0, 4, 3},
                                    {3, 4, 3}, {1, 4, 6}
                                }),
                equalTo(ArrayUtils.getLists(new int[][] {{0, 1}, {2, 3, 4, 5}})));
    }

    @Test
    void findCriticalAndPseudoCriticalEdges2() {
        assertThat(
                new Solution()
                        .findCriticalAndPseudoCriticalEdges(
                                4, new int[][] {{0, 1, 1}, {1, 2, 1}, {2, 3, 1}, {0, 3, 1}}),
                equalTo(ArrayUtils.getLists(new int[][] {{}, {0, 1, 2, 3}})));
    }
}
