package g2401_2500.s2482_difference_between_ones_and_zeros_in_row_and_column;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void onesMinusZeros() {
        assertThat(
                new Solution()
                        .onesMinusZeros(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,1,1],[1,0,1],[0,0,1]")),
                equalTo(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[0,0,4],[0,0,4],[-2,-2,2]")));
    }

    @Test
    void onesMinusZeros2() {
        assertThat(
                new Solution()
                        .onesMinusZeros(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,1,1],[1,1,1]")),
                equalTo(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[5,5,5],[5,5,5]")));
    }
}
