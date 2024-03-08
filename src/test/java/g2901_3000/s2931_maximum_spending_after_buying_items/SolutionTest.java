package g2901_3000.s2931_maximum_spending_after_buying_items;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSpending() {
        assertThat(
                new Solution()
                        .maxSpending(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[8,5,2],[6,4,1],[9,7,3]")),
                equalTo(285L));
    }

    @Test
    void maxSpending2() {
        assertThat(
                new Solution()
                        .maxSpending(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[10,8,6,4,2],[9,7,5,3,2]")),
                equalTo(386L));
    }
}
