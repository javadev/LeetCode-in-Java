package g2601_2700.s2679_sum_in_a_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void matrixSum() {
        assertThat(
                new Solution()
                        .matrixSum(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[7,2,1],[6,4,2],[6,5,3],[3,2,1]")),
                equalTo(15));
    }

    @Test
    void matrixSum2() {
        assertThat(new Solution().matrixSum(new int[][] {{1}}), equalTo(1));
    }
}
