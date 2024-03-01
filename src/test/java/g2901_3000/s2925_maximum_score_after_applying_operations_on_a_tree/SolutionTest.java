package g2901_3000.s2925_maximum_score_after_applying_operations_on_a_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumScoreAfterOperations() {
        assertThat(
                new Solution()
                        .maximumScoreAfterOperations(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,1],[0,2],[0,3],[2,4],[4,5]"),
                                new int[] {5, 2, 5, 2, 1, 1}),
                equalTo(11L));
    }

    @Test
    void maximumScoreAfterOperations2() {
        assertThat(
                new Solution()
                        .maximumScoreAfterOperations(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,1],[0,2],[1,3],[1,4],[2,5],[2,6]"),
                                new int[] {20, 10, 9, 7, 4, 3, 5}),
                equalTo(40L));
    }
}
