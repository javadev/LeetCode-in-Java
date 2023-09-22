package g2701_2800.s2732_find_a_good_subset_of_the_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void goodSubsetofBinaryMatrix() {
        assertThat(
                new Solution()
                        .goodSubsetofBinaryMatrix(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,1,1,0],[0,0,0,1],[1,1,1,1]")),
                equalTo(Arrays.asList(0, 1)));
    }

    @Test
    void goodSubsetofBinaryMatrix2() {
        assertThat(
                new Solution()
                        .goodSubsetofBinaryMatrix(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,1,1],[1,1,1]")),
                equalTo(List.of()));
    }

    @Test
    void goodSubsetofBinaryMatrix3() {
        assertThat(
                new Solution()
                        .goodSubsetofBinaryMatrix(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,0,0]")),
                equalTo(List.of(0)));
    }
}
