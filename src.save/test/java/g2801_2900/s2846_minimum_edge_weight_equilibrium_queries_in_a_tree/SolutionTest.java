package g2801_2900.s2846_minimum_edge_weight_equilibrium_queries_in_a_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperationsQueries() {
        assertThat(
                new Solution()
                        .minOperationsQueries(
                                7,
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,1,1],[1,2,1],[2,3,1],[3,4,2],[4,5,2],[5,6,2]"),
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,3],[3,6],[2,6],[0,6]")),
                equalTo(new int[] {0, 0, 1, 3}));
    }

    @Test
    void minOperationsQueries2() {
        assertThat(
                new Solution()
                        .minOperationsQueries(
                                8,
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,2,6],[1,3,4],[2,4,6],[2,5,3],[3,6,6],[3,0,8],[7,0,2]"),
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[4,6],[0,4],[6,5],[7,4]")),
                equalTo(new int[] {1, 2, 2, 3}));
    }
}
