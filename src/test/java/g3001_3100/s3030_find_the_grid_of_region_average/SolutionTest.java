package g3001_3100.s3030_find_the_grid_of_region_average;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void resultGrid() {
        assertThat(
                new Solution()
                        .resultGrid(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[5,6,7,10],[8,9,10,10],[11,12,13,10]"),
                                3),
                equalTo(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[9,9,9,9],[9,9,9,9],[9,9,9,9]")));
    }

    @Test
    void resultGrid2() {
        assertThat(
                new Solution()
                        .resultGrid(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[10,20,30],[15,25,35],[20,30,40],[25,35,45]"),
                                12),
                equalTo(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[25,25,25],[27,27,27],[27,27,27],[30,30,30]")));
    }

    @Test
    void resultGrid3() {
        assertThat(
                new Solution()
                        .resultGrid(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[5,6,7],[8,9,10],[11,12,13]"),
                                1),
                equalTo(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[5,6,7],[8,9,10],[11,12,13]")));
    }
}
