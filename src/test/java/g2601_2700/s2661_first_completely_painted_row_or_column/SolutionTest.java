package g2601_2700.s2661_first_completely_painted_row_or_column;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void firstCompleteIndex() {
        assertThat(
                new Solution()
                        .firstCompleteIndex(
                                new int[] {1, 3, 4, 2},
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,4],[2,3]")),
                equalTo(2));
    }

    @Test
    void firstCompleteIndex2() {
        assertThat(
                new Solution()
                        .firstCompleteIndex(
                                new int[] {2, 8, 7, 4, 1, 3, 5, 6, 9},
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[3,2,5],[1,4,6],[8,7,9]")),
                equalTo(3));
    }
}
