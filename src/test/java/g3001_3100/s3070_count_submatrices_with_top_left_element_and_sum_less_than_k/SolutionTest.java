package g3001_3100.s3070_count_submatrices_with_top_left_element_and_sum_less_than_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countSubmatrices() {
        assertThat(
                new Solution()
                        .countSubmatrices(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[7,6,3],[6,6,1]"),
                                18),
                equalTo(4));
    }

    @Test
    void countSubmatrices2() {
        assertThat(
                new Solution()
                        .countSubmatrices(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[7,2,9],[1,5,0],[2,6,6]"),
                                20),
                equalTo(6));
    }
}
