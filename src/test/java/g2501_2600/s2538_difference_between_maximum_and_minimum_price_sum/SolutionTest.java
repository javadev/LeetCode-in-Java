package g2501_2600.s2538_difference_between_maximum_and_minimum_price_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxOutput() {
        assertThat(
                new Solution()
                        .maxOutput(
                                6,
                                CommonUtils.convertLeetCodeRegularRectangleArrayInputIntoJavaArray(
                                        "[0,1],[1,2],[1,3],[3,4],[3,5]"),
                                new int[] {9, 8, 7, 6, 10, 5}),
                equalTo(24L));
    }

    @Test
    void maxOutput2() {
        assertThat(
                new Solution()
                        .maxOutput(
                                3,
                                CommonUtils.convertLeetCodeRegularRectangleArrayInputIntoJavaArray(
                                        "[0,1],[1,2]"),
                                new int[] {1, 1, 1}),
                equalTo(2L));
    }
}
