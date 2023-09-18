package g2701_2800.s2718_sum_of_matrix_after_queries;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void matrixSumQueries() {
        assertThat(
                new Solution()
                        .matrixSumQueries(
                                3,
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,0,1],[1,2,2],[0,2,3],[1,0,4]")),
                equalTo(23L));
    }

    @Test
    void matrixSumQueries2() {
        assertThat(
                new Solution()
                        .matrixSumQueries(
                                3,
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,0,4],[0,1,2],[1,0,1],[0,2,3],[1,2,1]")),
                equalTo(17L));
    }
}
