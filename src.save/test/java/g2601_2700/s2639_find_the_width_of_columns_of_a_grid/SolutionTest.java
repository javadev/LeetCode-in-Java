package g2601_2700.s2639_find_the_width_of_columns_of_a_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findColumnWidth() {
        assertThat(
                new Solution()
                        .findColumnWidth(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1],[22],[333]")),
                equalTo(new int[] {3}));
    }

    @Test
    void findColumnWidth2() {
        assertThat(
                new Solution()
                        .findColumnWidth(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[-15,1,3],[15,7,12],[5,6,-2]")),
                equalTo(new int[] {3, 1, 2}));
    }
}
