package g2601_2700.s2699_modify_graph_edge_weights;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void modifiedGraphEdges() {
        assertThat(
                new Solution()
                        .modifiedGraphEdges(
                                5,
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[4,1,-1],[2,0,-1],[0,3,-1],[4,3,-1]"),
                                0,
                                1,
                                5),
                equalTo(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[4,1,1],[2,0,1],[0,3,3],[4,3,1]")));
    }

    @Test
    void modifiedGraphEdges2() {
        assertThat(
                new Solution()
                        .modifiedGraphEdges(
                                3,
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,1,-1],[0,2,5]"),
                                0,
                                2,
                                6),
                equalTo(new int[][] {}));
    }
}
