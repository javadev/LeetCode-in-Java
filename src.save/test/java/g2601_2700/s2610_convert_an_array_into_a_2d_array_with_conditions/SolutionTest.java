package g2601_2700.s2610_convert_an_array_into_a_2d_array_with_conditions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMatrix() {
        assertThat(
                new Solution().findMatrix(new int[] {1, 3, 4, 1, 2, 3, 1}),
                equalTo(
                        ArrayUtils.getLists(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,3,4,2],[1,3],[1]"))));
    }

    @Test
    void findMatrix2() {
        assertThat(
                new Solution().findMatrix(new int[] {1, 2, 3, 4}),
                equalTo(
                        ArrayUtils.getLists(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,2,3,4]"))));
    }
}
