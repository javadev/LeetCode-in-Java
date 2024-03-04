package g3001_3100.s3047_find_the_largest_area_of_square_inside_two_rectangles;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestSquareArea() {
        assertThat(
                new Solution()
                        .largestSquareArea(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,1],[2,2],[3,1]"),
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[3,3],[4,4],[6,6]")),
                equalTo(1L));
    }

    @Test
    void largestSquareArea2() {
        assertThat(
                new Solution()
                        .largestSquareArea(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,1],[2,2],[1,2]"),
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[3,3],[4,4],[3,4]")),
                equalTo(1L));
    }

    @Test
    void largestSquareArea3() {
        assertThat(
                new Solution()
                        .largestSquareArea(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,1],[3,3],[3,1]"),
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[2,2],[4,4],[4,2]")),
                equalTo(0L));
    }
}
