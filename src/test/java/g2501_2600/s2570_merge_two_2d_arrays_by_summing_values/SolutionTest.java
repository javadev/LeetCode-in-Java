package g2501_2600.s2570_merge_two_2d_arrays_by_summing_values;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mergeArrays() {
        assertThat(
                new Solution()
                        .mergeArrays(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,2],[2,3],[4,5]"),
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,4],[3,2],[4,1]")),
                equalTo(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[1,6],[2,3],[3,2],[4,6]")));
    }

    @Test
    void mergeArrays2() {
        assertThat(
                new Solution()
                        .mergeArrays(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[2,4],[3,6],[5,5]"),
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,3],[4,3]")),
                equalTo(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[1,3],[2,4],[3,6],[4,3],[5,5]")));
    }
}
