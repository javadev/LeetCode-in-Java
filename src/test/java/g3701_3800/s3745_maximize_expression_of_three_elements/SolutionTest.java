package g3701_3800.s3745_maximize_expression_of_three_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximizeExpressionOfThree() {
        assertThat(new Solution().maximizeExpressionOfThree(new int[] {1, 2, 3}), equalTo(4));
    }

    @Test
    void maximizeExpressionOfThree2() {
        assertThat(new Solution().maximizeExpressionOfThree(new int[] {5, 5, 5}), equalTo(5));
    }

    @Test
    void maximizeExpressionOfThree3() {
        assertThat(new Solution().maximizeExpressionOfThree(new int[] {-5, -1, -3, 4}), equalTo(8));
    }
}
