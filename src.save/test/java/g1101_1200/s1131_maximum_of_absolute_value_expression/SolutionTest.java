package g1101_1200.s1131_maximum_of_absolute_value_expression;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxAbsValExpr() {
        assertThat(
                new Solution().maxAbsValExpr(new int[] {1, 2, 3, 4}, new int[] {-1, 4, 5, 6}),
                equalTo(13));
    }

    @Test
    void maxAbsValExpr2() {
        assertThat(
                new Solution()
                        .maxAbsValExpr(new int[] {1, -2, -5, 0, 10}, new int[] {0, -2, -1, -7, -4}),
                equalTo(20));
    }
}
