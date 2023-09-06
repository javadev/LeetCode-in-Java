package g2601_2700.s2646_minimize_the_total_price_of_the_trips;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumTotalPrice() {
        assertThat(
                new Solution()
                        .minimumTotalPrice(
                                4,
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,1],[1,2],[1,3]"),
                                new int[] {2, 2, 10, 6},
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,3],[2,1],[2,3]")),
                equalTo(23));
    }

    @Test
    void minimumTotalPrice2() {
        assertThat(
                new Solution()
                        .minimumTotalPrice(
                                2, new int[][] {{0, 1}}, new int[] {2, 2}, new int[][] {{0, 0}}),
                equalTo(1));
    }
}
