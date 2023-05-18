package g0801_0900.s0879_profitable_schemes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void profitableSchemes() {
        assertThat(
                new Solution().profitableSchemes(5, 3, new int[] {2, 2}, new int[] {2, 3}),
                equalTo(2));
    }

    @Test
    void profitableSchemes2() {
        assertThat(
                new Solution().profitableSchemes(10, 5, new int[] {2, 3, 5}, new int[] {6, 7, 8}),
                equalTo(7));
    }
}
