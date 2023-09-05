package g2601_2700.s2643_row_with_maximum_ones;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void rowAndMaximumOnes() {
        assertThat(
                new Solution()
                        .rowAndMaximumOnes(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,1],[1,0]")),
                equalTo(new int[] {0, 1}));
    }

    @Test
    void rowAndMaximumOnes2() {
        assertThat(
                new Solution()
                        .rowAndMaximumOnes(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,0,0],[0,1,1]")),
                equalTo(new int[] {1, 2}));
    }

    @Test
    void rowAndMaximumOnes3() {
        assertThat(
                new Solution()
                        .rowAndMaximumOnes(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,0],[1,1],[0,0]")),
                equalTo(new int[] {1, 2}));
    }
}
