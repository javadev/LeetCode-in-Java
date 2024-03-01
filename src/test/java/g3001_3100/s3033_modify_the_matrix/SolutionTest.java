package g3001_3100.s3033_modify_the_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void modifiedMatrix() {
        assertThat(
                new Solution()
                        .modifiedMatrix(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,2,-1],[4,-1,6],[7,8,9]")),
                equalTo(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[1,2,9],[4,8,6],[7,8,9]")));
    }

    @Test
    void modifiedMatrix2() {
        assertThat(
                new Solution().modifiedMatrix(new int[][] {{3, -1}, {5, 2}}),
                equalTo(new int[][] {{3, 2}, {5, 2}}));
    }
}
