package g2701_2800.s2736_maximum_sum_queries;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumSumQueries() {
        assertThat(
                new Solution()
                        .maximumSumQueries(
                                new int[] {4, 3, 1, 2},
                                new int[] {2, 4, 9, 5},
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[4,1],[1,3],[2,5]")),
                equalTo(new int[] {6, 10, 7}));
    }

    @Test
    void maximumSumQueries2() {
        assertThat(
                new Solution()
                        .maximumSumQueries(
                                new int[] {3, 2, 5},
                                new int[] {2, 3, 4},
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[4,4],[3,2],[1,1]")),
                equalTo(new int[] {9, 9, 9}));
    }

    @Test
    void maximumSumQueries3() {
        assertThat(
                new Solution()
                        .maximumSumQueries(
                                new int[] {2, 1}, new int[] {2, 3}, new int[][] {{3, 3}}),
                equalTo(new int[] {-1}));
    }
}
