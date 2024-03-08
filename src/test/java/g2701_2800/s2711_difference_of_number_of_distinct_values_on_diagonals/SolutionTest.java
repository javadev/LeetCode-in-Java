package g2701_2800.s2711_difference_of_number_of_distinct_values_on_diagonals;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void differenceOfDistinctValues() {
        assertThat(
                new Solution()
                        .differenceOfDistinctValues(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,2,3],[3,1,5],[3,2,1]")),
                equalTo(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[1,1,0],[1,0,1],[0,1,1]")));
    }

    @Test
    void differenceOfDistinctValues2() {
        assertThat(
                new Solution().differenceOfDistinctValues(new int[][] {{1}}),
                equalTo(new int[][] {{0}}));
    }
}
